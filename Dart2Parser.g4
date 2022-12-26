
parser grammar Dart2Parser;

options { tokenVocab=Dart2Lexer; }

program : content*;
content: varDefinition
        | varEQ
        | intIncrease
        | boolVarDefnition
        | boolVarEq ;
// (varDefnition | varEq | boolVarDefnition | boolVarEq)*;
varDefinition: DataType IDENTIFIER (EQ exp |) SC ;
intIncrease: IDENTIFIER (PLPL | MM)  SC ;
boolVarDefnition: Bool_type IDENTIFIER (EQ boolExp | ) SC ;
varEQ : IDENTIFIER ((EQFORNORMALMATH | EQ) exp | ) SC;
boolVarEq : IDENTIFIER ((EQFORBOOLEANMATH | EQ) boolExp | ) SC;
exp : exp MathMaticalSign exp # MathematicsLogic /// math between expression
    | OP exp CP # BetweenBracket /// expression in brackets
    | IDENTIFIER # Variable /// variable
    | NUMBER # Number
    | DOUBLE # Double
    | SingleLineString # String;  /// number
boolExp : boolExp BooleanSign boolExp # BoolMathematicsLogic
        | OP boolExp CP # BoolBetweenBracket
        | Bool_value # Bool
        | IDENTIFIER # BoolVariable ;
////////////////////////////////
def_class:CLASS_ NAME ( | EXTENDS_ NAME ) OBC class_body*  CBC;

class_body:varDefinition
         |boolVarDefnition
         |def_function_datatype
         |def_function_void
          ;

def_function_void:VOID_ NAME OP (DataType NAME C*)* CP OBC function_body* CBC;


def_function_datatype:DataType NAME OP (DataType NAME C*)* CP OBC function_body* RETURN_ NAME SC CBC;
function_body:varDefinition
             |boolVarDefnition
             |intIncrease
             ;
def_if:IF_ OP condition+ CP  OBC if_body* CBC;
condition: NAME |Bool_value |DIGIT OPCO DEGIT|NAME  OPCO NAME |NAME  OPCO DIGIT|DIGIT  OPCO NAME;
if_body:varDefinition
       |boolVarDefnition
       |intIncrease
       ;