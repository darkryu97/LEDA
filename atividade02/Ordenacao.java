package atividade02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ordenacao implements Ordenacao_IF {

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
    @Override
    public boolean checaVetorOrdenado(int[] numeros) {
        for (int i=0;i<numeros.length;i++){
            if(numeros[i]!=i+1){
                return false;
            }
        }
        return true;
    }

    @Override
    public long bubbleSort(int[] numeros) {
        int[] array = numeros;
        int n = numeros.length;
        int aux = 0;
        long media = 0,soma = 0,antes = 0,depois = 0,cont = 0;

        while(cont<50){
            numeros = array;
            antes = System.nanoTime();
            for (int i=0;i<n;i++){
                for (int j=0;j<n-i-1;j++){
                    if (numeros[j]>numeros[j+1]){
                        aux = numeros[j];
                        numeros[j] = numeros[j+1];
                        numeros[j+1] = aux;
                    }
                }
            }
            depois = System.nanoTime();
            soma += depois-antes;
            cont++;
        }
        media = soma/50;

        if (checaVetorOrdenado(array)){
            return media;
        }
        return -1;
    }

    @Override
    public long selectionSort(int[] numeros) {
        int[] array = numeros;
        int n = numeros.length;
        int aux = 0;
        long media = 0,soma = 0,antes = 0,depois = 0,cont = 0;
        while(cont<50) {
            numeros = array;
            antes = System.nanoTime();
            for (int i = 0; i < n - 1; i++) {
                int menor = i;
                for (int j = i + 1; j < n; j++) {
                    if (numeros[j] < numeros[menor]) {
                        menor = j;
                    }
                }
                aux = numeros[i];
                numeros[i] = numeros[menor];
                numeros[menor] = aux;
            }
            depois = System.nanoTime();
            soma += depois-antes;
            cont++;
        }
        media = soma/50;
        if (checaVetorOrdenado(array)){
            return media;
        }
        return -1;
    }

    @Override
    public long insertionSort(int[] numeros) {
        int[] array = numeros;
        int n = numeros.length;
        int aux = 0,key = 0;
        long media = 0,soma = 0,antes = 0,depois = 0,cont = 0;
        while(cont<50) {
            numeros = array;
            antes = System.nanoTime();
            for (int i = 1; i < n; i++) {
                key = numeros[i];
                int j = i - 1;

                // Move os elementos maiores que a chave para a direita
                while (j >= 0 && numeros[j] > key) {
                    numeros[j + 1] = numeros[j];
                    j--;
                }

                // Insere a chave na posição correta
                numeros[j + 1] = key;
            }

            depois = System.nanoTime();
            soma += depois-antes;
            cont++;
        }
        media = soma/50;
        if (checaVetorOrdenado(array)){
            return media;
        }
        return -1;
    }

    @Override
    public long mergeSort(int[] numeros) {
        return 0;
    }

    @Override
    public long quickSort(int[] numeros) {
        return 0;
    }

    @Override
    public long random_quickSort(int[] numeros) {
        return 0;
    }

    @Override
    public long quickSort_Java(int[] numeros) {
        return 0;
    }

    @Override
    public long countingSort(int[] numeros) {
        return 0;
    }
}
