package com.yy.design.create.factory.method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gongcy
 * @date 2022/10/24 4:43 下午
 * @Description
 */
public class RuleConfigParserFactoryMap {

    private static final Map<String, IRuleConfigParserFactory> cacheFactories = new HashMap<>();


    static {
        cacheFactories.put("json",new JsonRuleConfigParserFactory());
        cacheFactories.put("xml",new XmlRuleConfigParserFactory());
        cacheFactories.put("yaml",new YamlRuleConfigParserFactory());
        cacheFactories.put("properties",new PropertiesRuleConfigParserFactory());
    }

    public static IRuleConfigParserFactory getParserFactory(String type) {
        if (type == null || type.isEmpty()) {
            return null;
        }

        return cacheFactories.get(type.toLowerCase());

    }
}
