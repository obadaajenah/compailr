// Generated from C:/Users/majd/IdeaProjects/untitled\Dart2Parser.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Dart2Parser}.
 */
public interface Dart2ParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Dart2Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Dart2Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(Dart2Parser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(Dart2Parser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#varDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVarDefinition(Dart2Parser.VarDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#varDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVarDefinition(Dart2Parser.VarDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#intIncrease}.
	 * @param ctx the parse tree
	 */
	void enterIntIncrease(Dart2Parser.IntIncreaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#intIncrease}.
	 * @param ctx the parse tree
	 */
	void exitIntIncrease(Dart2Parser.IntIncreaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#boolVarDefnition}.
	 * @param ctx the parse tree
	 */
	void enterBoolVarDefnition(Dart2Parser.BoolVarDefnitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#boolVarDefnition}.
	 * @param ctx the parse tree
	 */
	void exitBoolVarDefnition(Dart2Parser.BoolVarDefnitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#varEQ}.
	 * @param ctx the parse tree
	 */
	void enterVarEQ(Dart2Parser.VarEQContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#varEQ}.
	 * @param ctx the parse tree
	 */
	void exitVarEQ(Dart2Parser.VarEQContext ctx);
	/**
	 * Enter a parse tree produced by {@link Dart2Parser#boolVarEq}.
	 * @param ctx the parse tree
	 */
	void enterBoolVarEq(Dart2Parser.BoolVarEqContext ctx);
	/**
	 * Exit a parse tree produced by {@link Dart2Parser#boolVarEq}.
	 * @param ctx the parse tree
	 */
	void exitBoolVarEq(Dart2Parser.BoolVarEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BetweenBracket}
	 * labeled alternative in {@link Dart2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterBetweenBracket(Dart2Parser.BetweenBracketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BetweenBracket}
	 * labeled alternative in {@link Dart2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitBetweenBracket(Dart2Parser.BetweenBracketContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link Dart2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterVariable(Dart2Parser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link Dart2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitVariable(Dart2Parser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link Dart2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterNumber(Dart2Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link Dart2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitNumber(Dart2Parser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MathematicsLogic}
	 * labeled alternative in {@link Dart2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterMathematicsLogic(Dart2Parser.MathematicsLogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MathematicsLogic}
	 * labeled alternative in {@link Dart2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitMathematicsLogic(Dart2Parser.MathematicsLogicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code String}
	 * labeled alternative in {@link Dart2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterString(Dart2Parser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code String}
	 * labeled alternative in {@link Dart2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitString(Dart2Parser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Double}
	 * labeled alternative in {@link Dart2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterDouble(Dart2Parser.DoubleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link Dart2Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitDouble(Dart2Parser.DoubleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolMathematicsLogic}
	 * labeled alternative in {@link Dart2Parser#boolExp}.
	 * @param ctx the parse tree
	 */
	void enterBoolMathematicsLogic(Dart2Parser.BoolMathematicsLogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolMathematicsLogic}
	 * labeled alternative in {@link Dart2Parser#boolExp}.
	 * @param ctx the parse tree
	 */
	void exitBoolMathematicsLogic(Dart2Parser.BoolMathematicsLogicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link Dart2Parser#boolExp}.
	 * @param ctx the parse tree
	 */
	void enterBool(Dart2Parser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link Dart2Parser#boolExp}.
	 * @param ctx the parse tree
	 */
	void exitBool(Dart2Parser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolVariable}
	 * labeled alternative in {@link Dart2Parser#boolExp}.
	 * @param ctx the parse tree
	 */
	void enterBoolVariable(Dart2Parser.BoolVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolVariable}
	 * labeled alternative in {@link Dart2Parser#boolExp}.
	 * @param ctx the parse tree
	 */
	void exitBoolVariable(Dart2Parser.BoolVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolBetweenBracket}
	 * labeled alternative in {@link Dart2Parser#boolExp}.
	 * @param ctx the parse tree
	 */
	void enterBoolBetweenBracket(Dart2Parser.BoolBetweenBracketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolBetweenBracket}
	 * labeled alternative in {@link Dart2Parser#boolExp}.
	 * @param ctx the parse tree
	 */
	void exitBoolBetweenBracket(Dart2Parser.BoolBetweenBracketContext ctx);
}