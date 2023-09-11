package atividade02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class BrincandoComOrdenacao {
	public static void main(String[] args) {
		Ordenacao_IF o = new Ordenacao();
		int[][] matriz = Ordenacao.criarVetores(15000);
		int[] vetor15 = matriz[0];
		int[] vetor15Reverse = matriz[1];
		int[] vetor15Random = matriz[2];
		matriz = Ordenacao.criarVetores(10000);
		int[] vetor10 = matriz[0];
		int[] vetor10Reverse = matriz[1];
		int[] vetor10Random = matriz[2];
		matriz = Ordenacao.criarVetores(5000);
		int[] vetor5 = matriz[0];
		int[] vetor5Reverse = matriz[1];
		int[] vetor5Random = matriz[2];
		long depois = System.nanoTime();
		

		System.out.println(o.checaVetorOrdenado(vetor15));
		
		
		

	}

}
