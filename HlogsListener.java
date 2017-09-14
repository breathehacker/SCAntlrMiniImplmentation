// Generated from Hlogs.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HlogsParser}.
 */
public interface HlogsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HlogsParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(HlogsParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlogsParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(HlogsParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlogsParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(HlogsParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlogsParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(HlogsParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlogsParser#imp}.
	 * @param ctx the parse tree
	 */
	void enterImp(HlogsParser.ImpContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlogsParser#imp}.
	 * @param ctx the parse tree
	 */
	void exitImp(HlogsParser.ImpContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlogsParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(HlogsParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlogsParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(HlogsParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlogsParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(HlogsParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlogsParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(HlogsParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlogsParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(HlogsParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlogsParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(HlogsParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlogsParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(HlogsParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlogsParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(HlogsParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlogsParser#multiply}.
	 * @param ctx the parse tree
	 */
	void enterMultiply(HlogsParser.MultiplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlogsParser#multiply}.
	 * @param ctx the parse tree
	 */
	void exitMultiply(HlogsParser.MultiplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HlogsParser#if_st}.
	 * @param ctx the parse tree
	 */
	void enterIf_st(HlogsParser.If_stContext ctx);
	/**
	 * Exit a parse tree produced by {@link HlogsParser#if_st}.
	 * @param ctx the parse tree
	 */
	void exitIf_st(HlogsParser.If_stContext ctx);
}