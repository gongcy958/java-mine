package com.yy.design.create.factory.method;

import com.yy.design.create.factory.simple.IRuleConfigParser;

/**
 * @author gongcy
 * @date 2022/10/24 4:28 下午
 * @Description
 */
public interface IRuleConfigParserFactory {

    IRuleConfigParser createParser();
}
