grammar minicompi;

/*
 * Reglas gramaticales
 */
// INICIO DEL PROGRAMA
start
     :
     program EOF
     ;
// PROGRAMA EL CUAL DEBE LLEVAR SENTENCIA
program
    :   statement+
    ;

// SENTNCIA QUE PUEDE SER DECLARACION DE VARIABLE, ASIGNACION, IF, WHILE, FOR, EXPRESION, PRINT
statement
    :   variableDeclaration
    |   variableAssignment
    |   ifStatement
    |   whileStatement
    |   forStatement
    |   expressionStatement
    |   printStatement
    |   asignmentStatement
    ;

// REGLA PARA LA DECLARACION DE UNA VARIABLE
variableDeclaration
    :   VARIABLE ID (ASSIGN expression)?
    ;
// REGLA PARA LA ASIGNACION DE UNA VARIABLE
variableAssignment
    :   ID ASSIGN expression
    ;

//REGLA PARA LA DECLARACION DE UN IF Y ELSE
ifStatement
    :   IF LPAREN expression RPAREN '{'block'}' (ELSE '{'block'}')?
    ;
// REGLA PARA LA DECLARACION DE UN WHILE
whileStatement
    :   WHILE LPAREN expression RPAREN '{'block'}'
    ;
// REGLA PARA LA DECLARACION DE UN FOR
forStatement
    :   FOR LPAREN variableDeclaration? SEMI expression? SEMI expression? RPAREN '{' block '}'
    ;

// EXPRESION QUE DEBE DE LLEVAR PUNTO  Y COMA AL FINAL
expressionStatement
    :   expression SEMI
    ;

//EXPRESION QUE PUEDE SER LOGICA O MATEMATICA
expression
    :   logicalOrExpression
    |   additiveExpression
    ;

// EXPRESION LOGICA OR
logicalOrExpression
    :   logicalAndExpression (OR logicalAndExpression)*
    ;

// EXPRESION LOGICA AND
logicalAndExpression
    :   equalityExpression (AND equalityExpression)*
    ;

// REGLA PARA COMPARACION Y NO IGUALDAD
equalityExpression
    :   relationalExpression ((EQUAL | NOTEQUAL) relationalExpression)*
    ;
// REGLA PARA EXPRESION RELACIONAL
relationalExpression
    :   additiveExpression ((LT | LTE | GT | GTE) additiveExpression)*
    ;

// REGLA PARA ADICION
additiveExpression
    :   multiplicativeExpression ((PLUS | MINUS) multiplicativeExpression)*
    ;
//REGLA PARA MULTIPLICACION
multiplicativeExpression
    :   unaryExpression ((MULT | DIV) unaryExpression)*
    ;
// REGLA PARA DETRMINAR LOS TRUE O FALSE
unaryExpression
    :   MINUS unaryExpression
    |   NOT unaryExpression
    |   primaryExpression
    ;

// REGLA PARA VALORES PRIMITIVOS
primaryExpression
    :   TRUE
    |   FALSE
    |   NUMBER
    |   STRING
    |   LPAREN expression RPAREN
    |   ID
    ;

// REGLA PARA ASGINACION DE UNA VARIABLE
asignmentStatement: ID '=' expression ';';
//REGLA PARA IMPRIMIR DATOS DE TIPO CADENA
printStatement: PRINT':'expression |(',' (expression))*';';
// REGLA QUE DEFINE LO QUE CONTENDRA UN BLOCK, ESTO SE USA EN LAS SENTECIAS IF, WHILE, ELSE Y FOR
block: '{' statement* '}';


//PALABRAS RESERVADAS
VARIABLE        :   'var' ;
IF              :   'if' ;
ELSE            :   'else' ;
WHILE           :   'while' ;
FOR             :   'for' ;
TRUE            :   'true' ;
FALSE           :   'false' ;
PLUS            :   '+' ;
MINUS           :   '-' ;
MULT            :   '*' ;
DIV             :   '/' ;
EQUAL           :   '==' ;
NOTEQUAL        :   '!=' ;
LT              :   '<' ;
LTE             :   '<=' ;
GT              :   '>' ;
GTE             :   '>=' ;
AND             :   '&&' | 'and' ;
OR              :   '||' | 'or' ;
NOT             :   '!' ;
ASSIGN          :   '=' ;
LPAREN          :   '(' ;
RPAREN          :   ')' ;
SEMI            :   ';' ;
PRINT           :   'print';
// Números enteros y decimales
NUMBER          :   INT ('.' DIGIT+)?;
fragment INT     :   '0' | [1-9] [0-9]* ;
fragment DIGIT   :   [0-9] ;

// Cadenas de texto
STRING          :   '"' (~["\r\n] | ESC)* '"';
fragment ESC     :   '\\' [\\"] ;

// Variables
ID              :   [a-zA-Z_] [a-zA-Z_0-9]* ;

// Ignoramos espacios en blanco y comentarios
WS              :   [ \t\n\r]+ -> skip ;
COMMENT         :   '//' ~[\r\n]* -> skip ;
