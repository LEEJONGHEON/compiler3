// Generated from compiler3.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link compiler3Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface compiler3Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link compiler3Parser#compUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompUnit(compiler3Parser.CompUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler3Parser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(compiler3Parser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler3Parser#funcType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncType(compiler3Parser.FuncTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler3Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(compiler3Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler3Parser#blockItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockItem(compiler3Parser.BlockItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler3Parser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(compiler3Parser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler3Parser#return_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_(compiler3Parser.Return_Context ctx);
	/**
	 * Visit a parse tree produced by {@link compiler3Parser#lVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLVal(compiler3Parser.LValContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler3Parser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl(compiler3Parser.DeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler3Parser#constDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDecl(compiler3Parser.ConstDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler3Parser#bType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBType(compiler3Parser.BTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler3Parser#constDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDef(compiler3Parser.ConstDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler3Parser#constInitVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstInitVal(compiler3Parser.ConstInitValContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler3Parser#constExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstExp(compiler3Parser.ConstExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler3Parser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(compiler3Parser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler3Parser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(compiler3Parser.VarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler3Parser#initVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitVal(compiler3Parser.InitValContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler3Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(compiler3Parser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler3Parser#addExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExp(compiler3Parser.AddExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler3Parser#addSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(compiler3Parser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler3Parser#mulExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExp(compiler3Parser.MulExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler3Parser#mulDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(compiler3Parser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler3Parser#unaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExp(compiler3Parser.UnaryExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler3Parser#funcRParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncRParams(compiler3Parser.FuncRParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler3Parser#primaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExp(compiler3Parser.PrimaryExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler3Parser#unaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOp(compiler3Parser.UnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler3Parser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(compiler3Parser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler3Parser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(compiler3Parser.IdentContext ctx);
}