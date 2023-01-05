package com.yy.ant4;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * @author gongcy
 * @date 2022/11/17 4:53 下午
 * @Description
 */
public class MyHelloVisitor extends AbstractParseTreeVisitor<String> implements HelloVisitor<String> {
    @Override
    public String visitR(HelloParser.RContext ctx) {
        System.out.println(ctx.getText());
        System.out.println(ctx.ID().getText());
        return visitChildren(ctx);
    }
}
