package atividade01;

public class Busca implements Busca_IF {

	@Override
	public int[] geraVetorNumericoOrdenado(int tamanho) {
		int[] vetor = new int[tamanho];
		for(int i=0;i<=tamanho-1;i++) {
			vetor[i]=i+1;
		}
		return vetor;
	}

	@Override
	public boolean buscaLinear_iterativa(int[] numeros, int k) {
		for(int i=0;i<numeros.length;i++) {
			if(numeros[i]==k){
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean buscaLinear_recursiva(int[] numeros, int k) {
		if(auxLinearRecursiva(numeros,0,k)==k) {
			return true;
		}
		return false;
	}
	public int auxLinearRecursiva(int[] numeros, int index, int k) {
		if(numeros[index]==k) {
			return numeros[index];
		}else if(index==numeros.length-1){
			return 0;
		}
		return auxLinearRecursiva(numeros,index+1,k);
	}

	@Override
	public boolean buscaBinaria_iterativa(int[] numeros, int k) {
		int comeco = 0;
		int fim = numeros.length-1;
		while(comeco<fim+1){
			int meio = (comeco + fim)/2;
		    if (k == numeros[meio]) {
		    	return true;
		    } else if (k > numeros[meio]) {
		    	comeco = meio + 1;
		    } else {
		    	fim = meio - 1;
		    }	
		}
		return false;
	}

	@Override
	public boolean buscaBinaria_recursiva(int[] numeros, int k) {
		if(auxBinariaRecursiva(0,numeros.length,numeros,k)==k) {
			return true;
		}
		return false;
	}
	public int auxBinariaRecursiva(int comeco, int fim, int[] numeros, int k) {
		if (comeco>fim) {
			return 0;
		} else {
			int meio = (comeco+fim)/2;
			if(numeros[meio]==k) {
				return numeros[meio];
			}else if(k>numeros[meio]){
				return auxBinariaRecursiva(meio+1,fim,numeros,k);
			}else {
				return auxBinariaRecursiva(comeco,meio-1,numeros,k);
			}
		}
	}

	@Override
	public boolean buscaLinear_iterativa_duasPontas(int[] numeros, int k) {
		int max = numeros.length-1;
		for(int i=0;i<(max+1)/2;i++) {
			if(numeros[i]==k || numeros[max-i]==k){
				return true;
			}
		}
		return false;
	}

}
