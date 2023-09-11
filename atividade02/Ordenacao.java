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
        return 0;
    }

    @Override
    public long selectionSort(int[] numeros) {
        return 0;
    }

    @Override
    public long insertionSort(int[] numeros) {
        return 0;
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
