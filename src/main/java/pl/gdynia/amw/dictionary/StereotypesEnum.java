package pl.gdynia.amw.dictionary;

import pl.gdynia.amw.model.node.*;

public enum StereotypesEnum {

    DLTNode, OracleNode, NetworkMapNode, NotaryNode;

    public CordaNode getInstance() {
        switch (this) {
            case NotaryNode:
                return new NotaryCordaNode();
            case OracleNode:
                return new OracleCordaNode();
            case NetworkMapNode:
                return new NetworkMapCordaNode();
            case DLTNode:
                return new DLTCordaNode();
            default:
                return new CordaNode();
        }
    }
}
