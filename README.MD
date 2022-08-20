Design Patterns
Factory


Usando Strings podemos buscar - serviços (classes) e executar operações.
Nosso programa - CRUD. Além de trabalhar com o banco MONEY. Você irá trabalhar com a classe model Pagamento.
Dentro do Model - irá criar outro pacote - pagamentos que terá nosso Pattern. Fora os pacotes service, 
repositories e controller.

Serão duas classes a primeira será assim:

Utilize o BigDecimal.
Situação: nosso cliente quando fizer pagamentos irá registrar o pagamento - 
Registro onde fará a soma quando atrasado e se em dia ou adiantado lançar desconto se o cliente colocar  
valor de desconto.
Pagamento em atraso usando a String PAGAMENTO_ATRASADO .
Pagamento em dia usando a String PAGAMENTO_EM_DIA .


A segunda será assim:

Classe: Recebimento
Faça outra classe que lida com recebimentos com as Strings.
DIN_PIX_CHEQUE : Sem quaisquer descontos.
CARTAO_DEBITO : Desconto de 2,5 % → Valor que será recebido.
CARTAO_CREDITO : Desconto de 3,7 % → Valor que será recebido.
VALE_REFEICAO : Desconto de 4,2 % → Valor que será recebido.
