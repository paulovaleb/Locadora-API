
public interface InterfaceAssociacao {
/* Calcula a frequ�ncia de um associado nas reuni�es ocorridas durante um 
determinado per�odo, retornando um n�mero entre 0 e 1 (ex: 0,6, indicando 
que o associado participou de 60% das reuni�es.*/
public double calcularFrequencia(int numAssociado, int numAssociacao, long
inicio, long fim) throws AssociadoNaoExistente, ReuniaoNaoExistente, 
AssociacaoNaoExistente;
/* Registra a frequencia de um associado em uma reuni�o. n�o deveria 
registrar participacao em reunioes acontecidas antes da sua filiacao na 
associa��o.*/
public void registrarFrequencia(int codigoAssociado, int numAssociacao, 
long dataReuniao)throws AssociadoNaoExistente, ReuniaoNaoExistente, 
AssociacaoNaoExistente, FrequenciaJaRegistrada, FrequenciaIncompativel;
/* Registra o pagamento de uma taxa, em uma associa��o, dentro uma 
determinada compet�ncia, para um associado. O valor a ser pago n�o pode ser 
menor que uma parcela, embora n�o precise ser exatamente duas parcelas. Uma 
parcela de R$20,00 por m�s aceita um pagamento de R$30,00, sendo uma 
parcela completa e um peda�o da pr�xima. Associados remidos n�o deveriam 
mais realizar pagamentos de taxas administrativas vigentes em datas antes 
da sua remiss�o, gerando exce��o de AssociadoJaRemido se houver tentativa 
de se pagar algo para esse caso. Caso o valor a ser pago seja menor que o 
m�nimo (n�o sendo o ultimo do ano!) ou gerando pagamento maior que a taxa 
anual, gerar exce��o de ValorInvalido. Lembrar de verificar valores 
negativos. */
public void registrarPagamento(int numAssociacao, String taxa, int
vigencia, int numAssociado, long data, double valor) throws
AssociacaoNaoExistente, AssociadoNaoExistente, AssociadoJaRemido, 
TaxaNaoExistente, ValorInvalido;
 
// Calcula o total de pagamentos realizado por um associado, em uma 
associa��o, para uma taxa, que possui uma vig�ncia, dentro de um certo 
per�odo de tempo. 
public double somarPagamentoDeAssociado (int numAssociacao, int
numAssociado, String nomeTaxa, int vigencia, long inicio, long fim) throws
AssociacaoNaoExistente, AssociadoNaoExistente, TaxaNaoExistente;
// Calcula o total de taxas previstas para um dado ano, em uma associa��o. 
public double calcularTotalDeTaxas (int numAssociacao, int vigencia) throws
AssociacaoNaoExistente, TaxaNaoExistente;
/* Adiciona uma associa��o a ser gerenciada. Valida todos os campos para 
evitar dados n�o preenchidos.*/public void adicionar(Associacao a) throws AssociacaoNaoExistente, 
ValorInvalido;
// Adiciona um associado a uma associa��o. Valida todos os campos para evitar dados n�o preenchidos.
public void adicionar(int associacao, Associado a) throws
AssociacaoNaoExistente, AssociadoJaExistente, ValorInvalido;
/* Adiciona uma reuni�o a uma associa��o. Valida todos os campos para 
evitar dados n�o preenchidos.*/
public void adicionar(int associacao, Reuniao r) throws
AssociacaoNaoExistente, ReuniaoJaExistente, ValorInvalido;
/* Adiciona uma taxa a uma associa��o. Valida todos os campos para evitar 
dados n�o preenchidos.*/
public void adicionar(int associacao, Taxa t) throws
AssociacaoNaoExistente, TaxaJaExistente, ValorInvalido;
