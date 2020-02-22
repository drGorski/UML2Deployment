package pl.gdynia.amw.model.node;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.gdynia.amw.model.CordaObject;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor
@EqualsAndHashCode
public class CordaNode implements CordaObject {

    @Getter @Setter private String name;
    @Getter private Map<String, Object> properties = new HashMap<>();
}
