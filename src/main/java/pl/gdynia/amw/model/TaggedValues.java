package pl.gdynia.amw.model;

import lombok.*;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor
@EqualsAndHashCode
public class TaggedValues implements CordaObject {

    @Getter
    private Map<String, String> properties = new HashMap<>();

}
