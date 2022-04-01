grammar GrammarMe;

program
    : 'begin' 'program' ':' statement+ 'end' 'program' 
    | WS;

loop: 'while' expression 'do' ':' statement+ 'end' 'while';

statement
    : statement COMMENT
    | expression EOE
    | loop
    | EOE
    | COMMENT
    | WS
    ;

expression
    : STRING
    | NUM
    | ID
    | 'false' 
    | 'true'
    | OP=('+'|'-') NUM
    | expression OP=('+'|'-') expression
    | expression OP=('*'|'/') expression
    | expression OP=('>' | '<' | '>=' | '<=' | '==' | '<>') expression
    | '~' expression
    | expression OP=('OR' | 'AND') expression
    | expression '.' expression
    | ID ':=' expression
    | OP=('integer' | 'boolean' | 'var') ID ':=' expression 
    | '(' expression ')'
    | OP=('read' | 'write') expression
    | WS
    ;

// Lexer
ID: [a-zA-Z][a-zA-Z0-9]*;
NUM: [0-9]+;
EOE: ';';
STRING: '"' .*? '"';
COMMENT: '//' .*? '\n' -> skip;
WS: [ \t\r\n]+ -> skip;