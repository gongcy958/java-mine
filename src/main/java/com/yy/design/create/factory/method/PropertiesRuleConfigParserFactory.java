package com.yy.design.create.factory.method;

import com.yy.design.create.factory.simple.IRuleConfigParser;
import com.yy.design.create.factory.simple.PropertiesRuleConfigParser;

/**
 * @author gongcy
 * @date 2022/10/24 4:31 下午
 * @Description
 */
public class PropertiesRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new PropertiesRuleConfigParser();
    }
}
