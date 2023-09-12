package atividade02;

public class Ordenacao implements Ordenacao_IF {
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
        int[] array = numeros.clone();
        int n = numeros.length;
        int aux = 0;
        long media = 0,soma = 0,antes = 0,depois = 0,cont = 0;

        while(cont<50){
            numeros = array.clone();
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
        if (checaVetorOrdenado(numeros)){
            return media;
        }
        return -1;
    }

    @Override
    public long selectionSort(int[] numeros) {
        int[] array = numeros.clone();
        int n = numeros.length;
        int aux = 0;
        long media = 0,soma = 0,antes = 0,depois = 0,cont = 0;
        while(cont<50) {
            numeros = array.clone();
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
        if (checaVetorOrdenado(numeros)){
            return media;
        }
        return -1;
    }

    @Override
    public long insertionSort(int[] numeros) {
        int[] array = numeros.clone();
        int n = numeros.length;
        int aux = 0,key = 0;
        long media = 0,soma = 0,antes = 0,depois = 0,cont = 0;
        while(cont<50) {
            numeros = array.clone();
            antes = System.nanoTime();
            for (int i = 1; i < n; i++) {
                key = numeros[i];
                int j = i - 1;
                while (j >= 0 && numeros[j] > key) {
                    numeros[j + 1] = numeros[j];
                    j--;
                }
                numeros[j + 1] = key;
            }
            depois = System.nanoTime();
            soma += depois-antes;
            cont++;
        }
        media = soma/50;
        if (checaVetorOrdenado(numeros)){
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
