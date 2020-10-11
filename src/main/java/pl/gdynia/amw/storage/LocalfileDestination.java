package pl.gdynia.amw.storage;

import lombok.AllArgsConstructor;
import lombok.Builder;
import pl.gdynia.amw.file.Storage;
import pl.gdynia.amw.model.Destination;


@Builder
@AllArgsConstructor
public class LocalfileDestination implements Destination {

    private String path;

    @Override
    public void store(String content, String label) {
        Storage.getInstance().storeFile(path, content, label);
    }
}
