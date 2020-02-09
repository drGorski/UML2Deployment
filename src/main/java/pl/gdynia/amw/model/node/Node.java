package pl.gdynia.amw.model.node;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.gdynia.amw.model.CordaObject;

import java.util.HashMap;
import java.util.Map;

@NoArgsConstructor
@EqualsAndHashCode
public class Node implements CordaObject {

    @Getter private Map<String, Object> properties = new HashMap<>();
}
