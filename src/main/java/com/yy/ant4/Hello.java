package com.yy.ant4;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * @author gongcy
 * @date 2022/11/17 4:54 下午
 * @Description
 */
public class Hello {

    public static void main(String[] args) {
        CodePointCharStream input = CharStreams.fromString("hello world");
        HelloLexer lexer = new HelloLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HelloParser parser = new HelloParser(tokens);
        ParseTree tree = parser.r();
        MyHelloVisitor hello = new MyHelloVisitor();
        hello.visit(tree);
    }
}
