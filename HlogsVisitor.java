// Generated from Hlogs.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HlogsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HlogsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HlogsParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(HlogsParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlogsParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(HlogsParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlogsParser#imp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImp(HlogsParser.ImpContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlogsParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(HlogsParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlogsParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(HlogsParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlogsParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(HlogsParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlogsParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(HlogsParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlogsParser#multiply}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiply(HlogsParser.MultiplyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HlogsParser#if_st}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_st(HlogsParser.If_stContext ctx);
}