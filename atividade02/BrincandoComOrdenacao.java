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
		
		List <Integer> Lista = new ArrayList<>(Arrays.asList(vetorReverseInteger));
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
		
		
		System.out.println("Tudo funcional");
		
		
		

	}

}
