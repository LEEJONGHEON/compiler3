grammar compiler3;

WS: [ \t\r\n]+ -> skip;

DecimalConst: NonzeroDigit DC;
fragment DC: (Digit DC)?;
OctalConst: '0' OC;
fragment OC: (OctalDigit OC)?;
HexadecimalConst: HexadecimalPrefix HexadecimalDigit HC;
fragment HC: (HexadecimalDigit HC)?;

Ident1: Nondigit Ident2;
fragment Ident2: (Nondigit Ident2)? | (Digit Ident2)?;

HexadecimalPrefix: '0x' | '0X';
Digit: '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9';
NonzeroDigit: '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9';
OctalDigit: '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7';
HexadecimalDigit: '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' | 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'A' | 'B' | 'C' | 'D' | 'E' | 'F';

Nondigit: '_' | 'a' | 'b' | 'c' | 'd' | 'e' | 'f' | 'g' | 'h' | 'i' | 'j' | 'k' | 'l' | 'm' | 'n' | 'o' | 'p' | 'q' | 'r'
 | 's' | 't' | 'u' | 'v' | 'w' | 'x' | 'y' | 'z' | 'A' | 'B' | 'C' | 'D' | 'E' | 'F' | 'G' | 'H' | 'I' | 'J' | 'K' | 'L'
 | 'M' | 'N' | 'O' | 'P' | 'Q' | 'R' | 'S' | 'T' | 'U' | 'V' | 'W' | 'X' | 'Y' | 'Z';

compUnit: funcDef;
funcDef: funcType 'main' '(' ')' block;
funcType: 'int';
block: '{' (blockItem)* '}';
blockItem: decl | stmt;
stmt: lVal '=' exp ';' | (exp)? ';' | return_ exp ';';
return_: 'return';
lVal: ident;

decl: constDecl | varDecl;
constDecl: 'const' bType constDef (',' constDef)* ';';
bType: 'int';
constDef: ident '=' constInitVal;
constInitVal: constExp;
constExp: addExp;
varDecl: bType varDef (',' varDef)* ';';
varDef: ident | ident '=' initVal;
initVal: exp;

exp: addExp;
addExp: mulExp | addExp addSub mulExp;
addSub: '+' | '-';
mulExp: unaryExp | mulExp mulDiv unaryExp;
mulDiv: '*' | '/' | '%';
unaryExp: primaryExp | ident '(' (funcRParams)? ')'| unaryOp unaryExp;
funcRParams: exp (',' exp)*;
primaryExp: '(' exp ')' | lVal | number;
unaryOp: '+' | '-';
number: DecimalConst | OctalConst | HexadecimalConst;
ident: Ident1;
