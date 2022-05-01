grammar Alguma;

@header {
    package antlr4;
}

inicio: (declaracao)? programa EOF #NInicio;
declaracao: ':DECLARACAO' (decl)* #BlocoDeclaracao;
decl: TIPO ID('=' NUM|BOOL|STRING)? #NDeclaracao;
programa: ':ALGORITMO' (instr)* #BlocoAlgoritmo;
instr: ATRIBUIR 'A' (ID|NUM|BOOL|STRING|operacao) #NAtribuicao;
operacao: operando OPERADOR (operando|operacao) #NOperacao;
operando: ID|NUM #NOperando;

TIPO: ('int'|'float'|'Bool'|'string');
ID:([a-z][A-Z])+;
STRING: ["](([a-z][A-Z]+[0-9])*)?["];
WS:[ \r\t\n]* -> skip;
NUM: [0-9] + ('.'[0-9]+)?;
BOOL: 'False'|'True';
OPERADOR: '+'|'-'|'*'|'/';