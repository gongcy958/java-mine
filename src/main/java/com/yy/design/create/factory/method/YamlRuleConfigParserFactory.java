package com.yy.design.create.factory.method;

import com.yy.design.create.factory.simple.IRuleConfigParser;
import com.yy.design.create.factory.simple.YamlConfigRuleParser;

/**
 * @author gongcy
 * @date 2022/10/24 4:30 下午
 * @Description
 */
public class YamlRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new YamlConfigRuleParser();
    }
}
