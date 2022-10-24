package com.yy.design.create.factory.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gongcy
 * @date 2022/10/24 3:54 下午
 * @Description
 */
public class RuleConfigParserFactory {

    // 优化3 单例模式+简单工厂

    private static final Map<String, IRuleConfigParser> cacheParsers = new HashMap<>();

    static {
        cacheParsers.put("json",new JsonRuleConfigParser());
        cacheParsers.put("xml",new XmlRuleConfigParser());
        cacheParsers.put("yaml",new YamlConfigRuleParser());
        cacheParsers.put("properties",new PropertiesRuleConfigParser());
    }

    public static IRuleConfigParser createParser(String configFormat) {
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

        if (configFormat == null || configFormat.isEmpty()) {
            return null;
        }

        return cacheParsers.get(configFormat);
    }
}
