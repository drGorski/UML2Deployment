package pl.gdynia.amw.storage;

import lombok.*;
import org.apache.commons.io.FileUtils;
import pl.gdynia.amw.model.Destination;
import pl.gdynia.amw.service.GitService;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GitDestination implements Destination {

    @Getter @Setter private String gitUrl;
    @Getter @Setter private String gitPath;
    @Getter @Setter private String gitBranch;
    @Getter @Setter private String gitLogin;
    @Getter @Setter private String gitPassword;

    @Override @SneakyThrows
    public void store(String content, String label) {

        try (GitService gitService = new GitService()) {
            Path repo = gitService.clone(gitUrl, gitBranch, gitLogin, gitPassword);

            File fileToModify = new File(repo.toString()+File.separator+gitPath+File.separator+label);
            if (!fileToModify.exists()) {
                fileToModify.createNewFile();
            }

            FileUtils.writeStringToFile(fileToModify, content, StandardCharsets.UTF_8);

            gitService.addAllFiles();
            gitService.commitAndPush(gitLogin, gitPassword);
        }
    }

}
