// Generated from /Users/mine/ownenv/java-mine/src/main/java/com/yy/ant4/AggregateParser.g4 by ANTLR 4.10.1
package com.yy.ant4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AggregateParser}.
 */
public interface AggregateParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AggregateParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(AggregateParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link AggregateParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(AggregateParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link AggregateParser#aggClause}.
	 * @param ctx the parse tree
	 */
	void enterAggClause(AggregateParser.AggClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AggregateParser#aggClause}.
	 * @param ctx the parse tree
	 */
	void exitAggClause(AggregateParser.AggClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link AggregateParser#cardinalityAggClause}.
	 * @param ctx the parse tree
	 */
	void enterCardinalityAggClause(AggregateParser.CardinalityAggClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AggregateParser#cardinalityAggClause}.
	 * @param ctx the parse tree
	 */
	void exitCardinalityAggClause(AggregateParser.CardinalityAggClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link AggregateParser#termsAfterAggClause}.
	 * @param ctx the parse tree
	 */
	void enterTermsAfterAggClause(AggregateParser.TermsAfterAggClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AggregateParser#termsAfterAggClause}.
	 * @param ctx the parse tree
	 */
	void exitTermsAfterAggClause(AggregateParser.TermsAfterAggClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link AggregateParser#termsAggClause}.
	 * @param ctx the parse tree
	 */
	void enterTermsAggClause(AggregateParser.TermsAggClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AggregateParser#termsAggClause}.
	 * @param ctx the parse tree
	 */
	void exitTermsAggClause(AggregateParser.TermsAggClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link AggregateParser#geoBoundingBoxAggClause}.
	 * @param ctx the parse tree
	 */
	void enterGeoBoundingBoxAggClause(AggregateParser.GeoBoundingBoxAggClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link AggregateParser#geoBoundingBoxAggClause}.
	 * @param ctx the parse tree
	 */
	void exitGeoBoundingBoxAggClause(AggregateParser.GeoBoundingBoxAggClauseContext ctx);
}