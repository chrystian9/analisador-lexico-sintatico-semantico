grammar Alguma;

programa: (blocoVar)? blocoPrincipal EOF;
blocoVar: 'Var' decl*;
decl: TIPO ID;
blocoPrincipal: 'Begin' instr* 'End';
instr: atr | funcao;
atr: ID ':=' (operando | operacao);
operando: NUM | ID;
operacao: operando OPERADOR (operando | operacao);
funcao:  ID'('(params)?')';
params: param(','param)*;
param: NUM | ID;

TIPO: ('int' | 'float');
ID: ([a-z]|[A-Z])*;
NUM: [0-9]+('.'[0-9]*)?;
OPERADOR: '+' | '-' | '*' | '/';
WS: [ \r\t\n]* -> skip;