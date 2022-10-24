package com.yy.design.create.factory.method;

import com.yy.design.create.factory.simple.IRuleConfigParser;
import com.yy.design.create.factory.simple.InvalidRuleConfigException;
import com.yy.design.create.factory.simple.RuleConfig;

/**
 * @author gongcy
 * @date 2022/10/24 4:33 下午
 * @Description
 */
public class ResourceConfigSourceNew {

    public RuleConfig load(String ruleConfigFilePath) {

        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);


        // 优化
//        IRuleConfigParserFactory parserFactory = null;
//        if ("json".equalsIgnoreCase(ruleConfigFileExtension)) {
//            parserFactory = new JsonRuleConfigParserFactory();
//        } else if ("xml".equalsIgnoreCase(ruleConfigFileExtension)) {
//            parserFactory = new XmlRuleConfigParserFactory();
//        } else if ("yaml".equalsIgnoreCase(ruleConfigFileExtension)) {
//            parserFactory = new YamlRuleConfigParserFactory();
//        } else if ("properties".equalsIgnoreCase(ruleConfigFileExtension)) {
//            parserFactory = new PropertiesRuleConfigParserFactory();
//        } else {
//            throw new InvalidRuleConfigException("Rule config file format is not supported: " + ruleConfigFilePath);
//        }

        IRuleConfigParserFactory parserFactory = RuleConfigParserFactoryMap.getParserFactory(ruleConfigFileExtension);
        if (parserFactory == null) {
            throw new InvalidRuleConfigException("Rule config file format is not supported: " + ruleConfigFilePath);
        }

        IRuleConfigParser parser = parserFactory.createParser();

        String configText = "";
        // 从ruleConfigFilePath文件中读取配置文本到configText中。

        return parser.parse(configText);

    }

    private String getFileExtension(String ruleConfigFilePath) {
        // 解析文件获取扩展名

        return "xml";
    }
}
