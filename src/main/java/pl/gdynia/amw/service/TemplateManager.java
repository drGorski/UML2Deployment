package pl.gdynia.amw.service;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import org.apache.commons.io.FileUtils;
import pl.gdynia.amw.consts.Consts;

import java.io.File;
import java.nio.charset.Charset;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class TemplateManager {

    public static final String DEPLOY_NODES_TASK_TEMPLATE = "templates/deployNodesTask.template";
    public static final String DEPLOY_NODES_TASK_NODE_TEMPLATE = "templates/deployNodesTask_node.template";
    public static final String DEPLOY_NODES_TASK_NODE_NOTARY_SECTION_TEMPLATE = "templates/deployNodesTask_notaryNode.template";
    public static final String NODE_CONFIG_TEMPLATE = "templates/nodeConfig.template";

    private static TemplateManager INSTANCE = new TemplateManager();

    @SneakyThrows
    public String readTemplate(String template) {
        File file = new File(getClass().getClassLoader().getResource(template).getFile());
        return FileUtils.readFileToString(file, Charset.forName(Consts.UTF_8));
    }

    public static TemplateManager getInstance() {
        return INSTANCE;
    }
}
