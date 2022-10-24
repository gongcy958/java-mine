package com.yy.design.create.factory.method;

import com.yy.design.create.factory.simple.IRuleConfigParser;
import com.yy.design.create.factory.simple.JsonRuleConfigParser;

/**
 * @author gongcy
 * @date 2022/10/24 4:29 下午
 * @Description
 */
public class JsonRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new JsonRuleConfigParser();
    }
}
