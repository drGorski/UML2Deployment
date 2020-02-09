package pl.gdynia.amw.dictionary;

import pl.gdynia.amw.model.node.*;

public enum StereotypesEnum {

    DLTNode, OracleNode, NetworkMapNode, NotaryNode;

    public Node getInstance() {
        switch (this) {
            case NotaryNode:
                return new NotaryNode();
            case OracleNode:
                return new OracleNode();
            case NetworkMapNode:
                return new NetworkMapNode();
            case DLTNode:
                return new DLTNode();
            default:
                return new Node();
        }
    }
}
