package com.yy.design.create.factory.simple;

import com.yy.design.create.factory.simple.IRuleConfigParser;
import com.yy.design.create.factory.simple.InvalidRuleConfigException;
import com.yy.design.create.factory.simple.RuleConfig;
import com.yy.design.create.factory.simple.RuleConfigParserFactory;

/**
 * @author gongcy
 * @date 2022/10/24 3:23 下午
 * @Description
 */
public class RuleConfigSource {

    public RuleConfig load(String ruleConfigFilePath) {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        IRuleConfigParser parser = null;

        // 优化1 规范与重构 抽取 createParser();
//        if ("json".equalsIgnoreCase(ruleConfigFileExtension)) {
//            parser = new JsonRuleConfigParser();
//        } else if ("xml".equalsIgnoreCase(ruleConfigFileExtension)) {
//            parser = new XmlRuleConfigParser();
//        } else if ("yaml".equalsIgnoreCase(ruleConfigFileExtension)) {
//            parser = new YamlConfigRuleParser();
//        } else if ("properties".equalsIgnoreCase(ruleConfigFileExtension)) {
//            parser = new PropertiesRuleConfigParser();
//        } else {
//            throw new InvalidRuleConfigException("Rule config file format is supported : " + ruleConfigFilePath);
//        }

        parser = RuleConfigParserFactory.createParser(ruleConfigFileExtension);

        if (parser == null) {
            throw new InvalidRuleConfigException("Rule config file format is supported : " + ruleConfigFilePath);
        }

        String configText = "";
        return parser.parse(configText);
    }

//    private IRuleConfigParser createParser(String configFormat) {
//
//        // 优化二 类职责单一 抽取类
//        IRuleConfigParser parser = null;
//        if ("json".equalsIgnoreCase(configFormat)) {
//            parser = new JsonRuleConfigParser();
//        } else if ("xml".equalsIgnoreCase(configFormat)) {
//            parser = new XmlRuleConfigParser();
//        } else if ("yaml".equalsIgnoreCase(configFormat)) {
//            parser = new YamlConfigRuleParser();
//        } else if ("properties".equalsIgnoreCase(configFormat)) {
//            parser = new PropertiesRuleConfigParser();
//        }
//
//        return parser;
//    }


    private String getFileExtension(String ruleConfigFilePath) {
        return "json";
    }
}
