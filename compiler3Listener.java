// Generated from compiler3.g4 by ANTLR 4.9.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link compiler3Parser}.
 */
public interface compiler3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link compiler3Parser#compUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompUnit(compiler3Parser.CompUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler3Parser#compUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompUnit(compiler3Parser.CompUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler3Parser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(compiler3Parser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler3Parser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(compiler3Parser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler3Parser#funcType}.
	 * @param ctx the parse tree
	 */
	void enterFuncType(compiler3Parser.FuncTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler3Parser#funcType}.
	 * @param ctx the parse tree
	 */
	void exitFuncType(compiler3Parser.FuncTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler3Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(compiler3Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler3Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(compiler3Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler3Parser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(compiler3Parser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler3Parser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(compiler3Parser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler3Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(compiler3Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler3Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(compiler3Parser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler3Parser#return_}.
	 * @param ctx the parse tree
	 */
	void enterReturn_(compiler3Parser.Return_Context ctx);
	/**
	 * Exit a parse tree produced by {@link compiler3Parser#return_}.
	 * @param ctx the parse tree
	 */
	void exitReturn_(compiler3Parser.Return_Context ctx);
	/**
	 * Enter a parse tree produced by {@link compiler3Parser#lVal}.
	 * @param ctx the parse tree
	 */
	void enterLVal(compiler3Parser.LValContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler3Parser#lVal}.
	 * @param ctx the parse tree
	 */
	void exitLVal(compiler3Parser.LValContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler3Parser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(compiler3Parser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler3Parser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(compiler3Parser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler3Parser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstDecl(compiler3Parser.ConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler3Parser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstDecl(compiler3Parser.ConstDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler3Parser#bType}.
	 * @param ctx the parse tree
	 */
	void enterBType(compiler3Parser.BTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler3Parser#bType}.
	 * @param ctx the parse tree
	 */
	void exitBType(compiler3Parser.BTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler3Parser#constDef}.
	 * @param ctx the parse tree
	 */
	void enterConstDef(compiler3Parser.ConstDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler3Parser#constDef}.
	 * @param ctx the parse tree
	 */
	void exitConstDef(compiler3Parser.ConstDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler3Parser#constInitVal}.
	 * @param ctx the parse tree
	 */
	void enterConstInitVal(compiler3Parser.ConstInitValContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler3Parser#constInitVal}.
	 * @param ctx the parse tree
	 */
	void exitConstInitVal(compiler3Parser.ConstInitValContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler3Parser#constExp}.
	 * @param ctx the parse tree
	 */
	void enterConstExp(compiler3Parser.ConstExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler3Parser#constExp}.
	 * @param ctx the parse tree
	 */
	void exitConstExp(compiler3Parser.ConstExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler3Parser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(compiler3Parser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler3Parser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(compiler3Parser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler3Parser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(compiler3Parser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler3Parser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(compiler3Parser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler3Parser#initVal}.
	 * @param ctx the parse tree
	 */
	void enterInitVal(compiler3Parser.InitValContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler3Parser#initVal}.
	 * @param ctx the parse tree
	 */
	void exitInitVal(compiler3Parser.InitValContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler3Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(compiler3Parser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler3Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(compiler3Parser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler3Parser#addExp}.
	 * @param ctx the parse tree
	 */
	void enterAddExp(compiler3Parser.AddExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler3Parser#addExp}.
	 * @param ctx the parse tree
	 */
	void exitAddExp(compiler3Parser.AddExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler3Parser#addSub}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(compiler3Parser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler3Parser#addSub}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(compiler3Parser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler3Parser#mulExp}.
	 * @param ctx the parse tree
	 */
	void enterMulExp(compiler3Parser.MulExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler3Parser#mulExp}.
	 * @param ctx the parse tree
	 */
	void exitMulExp(compiler3Parser.MulExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler3Parser#mulDiv}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(compiler3Parser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler3Parser#mulDiv}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(compiler3Parser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler3Parser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExp(compiler3Parser.UnaryExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler3Parser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExp(compiler3Parser.UnaryExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler3Parser#funcRParams}.
	 * @param ctx the parse tree
	 */
	void enterFuncRParams(compiler3Parser.FuncRParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler3Parser#funcRParams}.
	 * @param ctx the parse tree
	 */
	void exitFuncRParams(compiler3Parser.FuncRParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler3Parser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExp(compiler3Parser.PrimaryExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler3Parser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExp(compiler3Parser.PrimaryExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler3Parser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOp(compiler3Parser.UnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler3Parser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOp(compiler3Parser.UnaryOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler3Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(compiler3Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler3Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(compiler3Parser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler3Parser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(compiler3Parser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler3Parser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(compiler3Parser.IdentContext ctx);
}