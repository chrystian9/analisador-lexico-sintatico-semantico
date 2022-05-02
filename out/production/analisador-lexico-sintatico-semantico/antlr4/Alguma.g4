grammar Alguma;

@header {
    package antlr4;
}

inicio: (declaracao)? programa EOF #NInicio;
declaracao: DECLARACAO (decl)* #BlocoDeclaracao;
decl: TIPO ID('=' NUM|BOOL|STRING)? #NDeclaracao;
programa: ALGORITMO (instr)* #BlocoAlgoritmo;
instr: atribuir #NInstrucao;
atribuir: ATRIBUIR (ID|NUM|BOOL|STRING|operacao) A ID #NAtribuicao;
operacao: operando OPERADOR (operando|operacao) #NOperacao;
operando: ID|NUM|BOOL|STRING #NOperando;

TIPO: ('int'|'float'|'Bool'|'string');
ID: [a-z]([a-z]|[A-Z]|[0-9])+;
STRING: '"' .*? '"';
WS: [ \r\t\n]* -> skip;
NUM: [0-9]+(','[0-9]+)?;
BOOL: 'False'|'True';
OPERADOR: '+'|'-'|'*'|'/'|'%'|'>'|'<'|'>='|'<='|'==';
DECLARACAO: ':DECLARACAO';
ALGORITMO: ':ALGORITMO';
ATRIBUIR: 'ATRIBUIR';
A: 'A';