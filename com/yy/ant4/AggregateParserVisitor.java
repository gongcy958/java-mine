// Generated from /Users/mine/ownenv/java-mine/src/main/java/com/yy/ant4/AggregateParser.g4 by ANTLR 4.10.1
package com.yy.ant4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AggregateParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AggregateParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AggregateParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(AggregateParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link AggregateParser#aggClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggClause(AggregateParser.AggClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link AggregateParser#cardinalityAggClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCardinalityAggClause(AggregateParser.CardinalityAggClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link AggregateParser#termsAfterAggClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermsAfterAggClause(AggregateParser.TermsAfterAggClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link AggregateParser#termsAggClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermsAggClause(AggregateParser.TermsAggClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link AggregateParser#geoBoundingBoxAggClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeoBoundingBoxAggClause(AggregateParser.GeoBoundingBoxAggClauseContext ctx);
}