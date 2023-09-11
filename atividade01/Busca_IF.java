package atividade01;

/*
 * Interface para implementa��o da classe "Busca".
 * Os m�todos booleanos devem retornar 'false' se 'k' n�o estiver no vetor 'numeros'.
 * O m�todo buscaLinear_iterativa2 deve considerar 
 */
public interface Busca_IF {
	
	int[] geraVetorNumericoOrdenado(int tamanho);
	
	boolean buscaLinear_iterativa(int[] numeros, int k);

	boolean buscaLinear_recursiva(int[] numeros, int k);
	
	boolean buscaLinear_iterativa_duasPontas(int[] numeros, int k);

	boolean buscaBinaria_iterativa(int[] numeros, int k);

	boolean buscaBinaria_recursiva(int[] numeros, int k);

}
