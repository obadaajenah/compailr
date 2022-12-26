import expression.ExpressionProcessor;
import expression.Program;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
//        String fileName = "C:\\Users\\majd\\IdeaProjects\\untitled\\test.dart";
        Dart2Parser parser = getParser("test.dart");
        ParseTree ast = parser.program();
        if(!MyErrorListener.hasError)
        {
            AntlrToProgram programVisitor = new AntlrToProgram();

            Program program = programVisitor.visit(ast);
            if(programVisitor.semanticError.isEmpty())
            {
                ExpressionProcessor processor = new ExpressionProcessor(program.expressions);
                for (String v :
                        processor.getResult()) {
                    System.out.println(v);
                }
                processor.values.forEach((s, variableValue) -> System.out.println(s + " " + variableValue));
            }
            else
            {
                for (String error:
                        programVisitor.semanticError) {
                    System.err.println(error);

                }
            }
        }
    }
    public static Dart2Parser getParser(String fileName){
        Dart2Parser parser = null ;
        try {
            CharStream input = CharStreams.fromFileName(fileName);
            Dart2Lexer lexer = new Dart2Lexer(input);
            CommonTokenStream token = new CommonTokenStream(lexer);
            parser = new Dart2Parser(token);
            parser.removeErrorListeners();
            parser.addErrorListener(new MyErrorListener());
        }catch (IOException e){

        }
        return parser;
    }
    public static Dart2Parser getParserFromLexer(Dart2Lexer lexer){
        Dart2Parser parser = null ;
        CommonTokenStream token = new CommonTokenStream(lexer);
        parser = new Dart2Parser(token);
        return parser;
    }
}