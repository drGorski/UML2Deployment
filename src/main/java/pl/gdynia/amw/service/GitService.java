package pl.gdynia.amw.service;

import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import org.apache.commons.io.FileUtils;
import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;

import java.io.Closeable;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

@NoArgsConstructor
public class GitService implements Closeable {

    private Path repo;
    private Git git;

    @SneakyThrows
    public Path clone(String url, String branch, String login, String password) {
        repo = Files.createTempDirectory(branch);

        git = Git.cloneRepository()
                .setURI(url)
                .setDirectory(repo.toFile())
                .setBranchesToClone(Arrays.asList("refs/heads/"+branch))
                .setBranch("refs/heads/"+branch)
                .setCredentialsProvider(new UsernamePasswordCredentialsProvider(login, password))
                .call();

        return repo;
    }

    @SneakyThrows
    public void addAllFiles() {
        git.add().addFilepattern(".").call();
    }

    @SneakyThrows
    public void commitAndPush(String login, String password) {
        git.commit()
                .setMessage("Uploading new configuration")
                .call();

        git.push().setCredentialsProvider(new UsernamePasswordCredentialsProvider(login, password)).call();
    }

    @Override
    public void close() throws IOException {
        FileUtils.deleteDirectory(repo.toFile());
    }
}
