package atividade02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class BrincandoComOrdenacao {
	public static int[][] criarVetores(int size){
		int[] vetorStandard = new int[size];
		int[] vetorReverse = new int[size];
		int[] vetorRandom = new int[size];
		Integer[] vetorReverseInteger = new Integer[size];
		for (int i=0;i<size;i++) {
			vetorStandard[i] = i+1;
			vetorReverse[i] = size-i;
			vetorReverseInteger[i] = size-i;
		}

		List<Integer> Lista = new ArrayList<>(Arrays.asList(vetorReverseInteger));
		Collections.shuffle(Lista);

		for (int i=0;i<size;i++) {
			vetorRandom[i] = Lista.toArray(new Integer[0])[i].intValue();
			//System.out.printf("%d %d %d\n",vetorStandard[i],vetorReverse[i],vetorRandom[i]);
		}
		//System.out.println("------------");

		int[][] matriz = new int[3][size];
		matriz[0] = vetorStandard;
		matriz[1] = vetorReverse;
		matriz[2] = vetorRandom;
		return matriz;
	}
	public static void main(String[] args) {
		//Instancia do objeto do tipo Ordenacao
		Ordenacao_IF o = new Ordenacao();

		//Criação dos vetores
		int[][] matriz = criarVetores(15000);
		int[] vetor15 = matriz[0];
		int[] vetor15Reverse = matriz[1];
		int[] vetor15Random = matriz[2];
		matriz = criarVetores(10000);
		int[] vetor10 = matriz[0];
		int[] vetor10Reverse = matriz[1];
		int[] vetor10Random = matriz[2];
		matriz = criarVetores(5000);
		int[] vetor5 = matriz[0];
		int[] vetor5Reverse = matriz[1];
		int[] vetor5Random = matriz[2];
		//Criação do array temporal
		long[] tempos = new long[72];
		//Contador do while
		int cont = 0;
		//Nanotime
		long antes = 0,depois = 0;
		antes = System.nanoTime();
		while(cont<50){
			//bubble sort
			tempos[0] += o.bubbleSort(vetor5.clone());
			tempos[1] += o.bubbleSort(vetor5Reverse.clone());
			tempos[2] += o.bubbleSort(vetor5Random.clone());
			tempos[3] += o.bubbleSort(vetor10.clone());
			tempos[4] += o.bubbleSort(vetor10Reverse.clone());
			tempos[5] += o.bubbleSort(vetor10Random.clone());
			tempos[6] += o.bubbleSort(vetor15.clone());
			tempos[7] += o.bubbleSort(vetor15Reverse.clone());
			tempos[8] += o.bubbleSort(vetor15Random.clone());

			//selection sort
			tempos[9] += o.selectionSort(vetor5.clone());
			tempos[10] += o.selectionSort(vetor5Reverse.clone());
			tempos[11] += o.selectionSort(vetor5Random.clone());
			tempos[12] += o.selectionSort(vetor10.clone());
			tempos[13] += o.selectionSort(vetor10Reverse.clone());
			tempos[14] += o.selectionSort(vetor10Random.clone());
			tempos[15] += o.selectionSort(vetor15.clone());
			tempos[16] += o.selectionSort(vetor15Reverse.clone());
			tempos[17] += o.selectionSort(vetor15Random.clone());

			//insertion sort
			tempos[18] += o.insertionSort(vetor5.clone());
			tempos[19] += o.insertionSort(vetor5Reverse.clone());
			tempos[20] += o.insertionSort(vetor5Random.clone());
			tempos[21] += o.insertionSort(vetor10.clone());
			tempos[22] += o.insertionSort(vetor10Reverse.clone());
			tempos[23] += o.insertionSort(vetor10Random.clone());
			tempos[24] += o.insertionSort(vetor15.clone());
			tempos[25] += o.insertionSort(vetor15Reverse.clone());
			tempos[26] += o.insertionSort(vetor15Random.clone());

			tempos[27] += o.mergeSort(vetor5.clone());
			tempos[28] += o.mergeSort(vetor5Reverse.clone());
			tempos[29] += o.mergeSort(vetor5Random.clone());
			tempos[30] += o.mergeSort(vetor10.clone());
			tempos[31] += o.mergeSort(vetor10Reverse.clone());
			tempos[32] += o.mergeSort(vetor10Random.clone());
			tempos[33] += o.mergeSort(vetor15.clone());
			tempos[34] += o.mergeSort(vetor15Reverse.clone());
			tempos[35] += o.mergeSort(vetor15Random.clone());

			tempos[36] += o.quickSort(vetor5.clone());
			tempos[37] += o.quickSort(vetor5Reverse.clone());
			tempos[38] += o.quickSort(vetor5Random.clone());
			tempos[39] += o.quickSort(vetor10.clone());
			tempos[40] += o.quickSort(vetor10Reverse.clone());
			tempos[41] += o.quickSort(vetor10Random.clone());
			tempos[42] += o.quickSort(vetor15.clone());
			tempos[43] += o.quickSort(vetor15Reverse.clone());
			tempos[44] += o.quickSort(vetor15Random.clone());
			cont++;
		}

		//For para impressão dos valores
		for (int i=0;i<9;i++){
			System.out.println(tempos[i]/50+" "+tempos[i+9]/50+" "+tempos[i+18]/50+" "+tempos[i+27]/50+" "+tempos[i+36]/50);
		}
		depois = System.nanoTime();
		System.out.println(depois-antes);
	}

}
