package pl.gdynia.amw.model;

import lombok.*;
import pl.gdynia.amw.annotation.TemplateTag;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@EqualsAndHashCode
public class Node implements CordaObject {

    private static final String TEMPLATE_PATH = "nodeGradleConfig.txt";
    private static final String EXTENSION = ".gradle";

    @Getter(onMethod_ = {@TemplateTag("<!--nodeName-->")}) @Setter private String nodeName;
    @Getter(onMethod_ = {@TemplateTag("<!--p2pPort-->")}) @Setter private String p2pPort;
    @Getter(onMethod_ = {@TemplateTag("<!--rpcAddress-->")}) @Setter private String rpcAddress;
    @Getter(onMethod_ = {@TemplateTag("<!--rpcAdminAddress-->")}) @Setter private String rpcAdminAddress;
    @Getter(onMethod_ = {@TemplateTag("<!--webPort-->")}) @Setter private String webPort;
    @Getter(onMethod_ = {@TemplateTag("<!--rpcUserUser-->")}) @Setter private String rpcUserUser;
    @Getter(onMethod_ = {@TemplateTag("<!--rpcUserPassword-->")}) @Setter private String rpcUserPassword;
    @Getter(onMethod_ = {@TemplateTag("<!--rpcUserPermission-->")}) @Setter private String rpcUserPermissions;

    public boolean anyParametersFilled() {
        return nodeName != null ||
                p2pPort != null ||
                rpcAddress != null ||
                rpcAdminAddress != null ||
                webPort != null ||
                rpcUserUser != null ||
                rpcUserPassword != null ||
                rpcUserPermissions != null;
    }


    @Override
    public String getIdentifier() {
        return nodeName+EXTENSION;
    }

    @Override
    public String getTemplatePath() {
        return TEMPLATE_PATH;
    }

}
