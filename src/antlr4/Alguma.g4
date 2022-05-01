grammar Alguma;

@header {
    package antlr4;
}

inicio: (declaracao)? programa EOF #NInicio;
declaracao: ':declaracao' (decl)* #BlocoDeclaracao;
decl: TIPO ID('=' NUM)?';' #NDeclaracao;
programa: 'programa' (instr)* #BlocoPrograma;
instr: ID '=' (ID|NUM|operacao)';' #NAtribuicao;
operacao: operando OPERADOR (operando|operacao) #NOperacao;
operando: ID|NUM #NOperando;

TIPO: ('int'|'float');
ID:([a-z][A-Z])+;
WS:[ \r\t\n]* -> skip;
NUM: [0-9] + ('.'[0-9]+)?;
OPERADOR: '+'|'-'|'*'|'/';