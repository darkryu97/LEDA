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
		Ordenacao_IF o = new Ordenacao();
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
		long depois = System.nanoTime();

		System.out.println(o.bubbleSort(vetor5));
		System.out.println(o.bubbleSort(vetor5Reverse));
		System.out.println(o.bubbleSort(vetor5Random));
		System.out.println(o.bubbleSort(vetor10));
		System.out.println(o.bubbleSort(vetor10Reverse));
		System.out.println(o.bubbleSort(vetor10Random));
		System.out.println(o.bubbleSort(vetor15));
		System.out.println(o.bubbleSort(vetor15Reverse));
		System.out.println(o.bubbleSort(vetor15Random)+"\n");

		System.out.println(o.selectionSort(vetor5));
		System.out.println(o.selectionSort(vetor5Reverse));
		System.out.println(o.selectionSort(vetor5Random));
		System.out.println(o.selectionSort(vetor10));
		System.out.println(o.selectionSort(vetor10Reverse));
		System.out.println(o.selectionSort(vetor10Random));
		System.out.println(o.selectionSort(vetor15));
		System.out.println(o.selectionSort(vetor15Reverse));
		System.out.println(o.selectionSort(vetor15Random)+"\n");

		System.out.println(o.insertionSort(vetor5));
		System.out.println(o.insertionSort(vetor5Reverse));
		System.out.println(o.insertionSort(vetor5Random));
		System.out.println(o.insertionSort(vetor10));
		System.out.println(o.insertionSort(vetor10Reverse));
		System.out.println(o.insertionSort(vetor10Random));
		System.out.println(o.insertionSort(vetor15));
		System.out.println(o.insertionSort(vetor15Reverse));
		System.out.println(o.insertionSort(vetor15Random)+"\n");
	}

}
