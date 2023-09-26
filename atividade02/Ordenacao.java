package atividade02;

import java.util.Random;
import java.util.Arrays;

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
        int n = numeros.length;
        int aux = 0;
        long antes = 0,depois = 0;
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
        if (checaVetorOrdenado(numeros)){
            return depois-antes;
        }
        return -1;
    }

    @Override
    public long selectionSort(int[] numeros) {
        int n = numeros.length;
        int aux = 0;
        long antes = 0,depois = 0;
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
        if (checaVetorOrdenado(numeros)){
            return depois-antes;
        }
        return -1;
    }

    @Override
    public long insertionSort(int[] numeros) {
        int n = numeros.length;
        int key = 0;
        long antes = 0,depois = 0;
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
        if (checaVetorOrdenado(numeros)){
            return depois-antes;
        }
        return -1;
    }

    @Override
    public long mergeSort(int[] numeros) {
        long antes = 0,depois = 0;
        antes = System.nanoTime();
        mergeSortAux(numeros);
        depois = System.nanoTime();
        if (checaVetorOrdenado(numeros)){
            return depois-antes;
        }
        return 0;
    }

    public static void mergeSortAux(int[] A) {
        int n = A.length;
        if (n <= 1) {
            return;
        }

        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        // Copie os elementos para os subarrays esquerdo e direito
        for (int i = 0; i < mid; i++) {
            left[i] = A[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = A[i];
        }

        // Chame o mergeSort recursivamente nos subarrays esquerdo e direito
        mergeSortAux(left);
        mergeSortAux(right);

        // Merge os dois subarrays ordenados
        merge(left, right, A);
    }

    public static void merge(int[] left, int[] right, int[] A) {
        int nL = left.length;
        int nR = right.length;
        int i = 0, j = 0, k = 0;

        while (i < nL && j < nR) {
            if (left[i] <= right[j]) {
                A[k++] = left[i++];
            } else {
                A[k++] = right[j++];
            }
        }

        while (i < nL) {
            A[k++] = left[i++];
        }

        while (j < nR) {
            A[k++] = right[j++];
        }
    }

    @Override
    public long quickSort(int[] numeros) {
        long antes = 0,depois = 0;
        antes = System.nanoTime();
        quickSortAux(numeros,0,numeros.length-1);
        depois = System.nanoTime();
        if (checaVetorOrdenado(numeros)){
            return depois-antes;
        }
        return 0;
    }

    public static void quickSortAux(int[] array, int left, int right) {
        if (left < right) {
            int pivot = partition(array, left, right);
            quickSortAux(array, left, pivot - 1);
            quickSortAux(array, pivot + 1, right);
        }
    }

    public static int partition(int[] array, int left, int right) {
        int pivot = array[left];
        int i = left + 1;
        int j = right;

        while (i <= j) {
            if (array[i] <= pivot) {
                i++;
            } else if (array[j] > pivot) {
                j--;
            } else {
                swap(array, i, j);
            }
        }

        swap(array, left, j);
        return j;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    @Override
    public long random_quickSort(int[] numeros) {
        long antes = 0,depois = 0;
        int size = numeros.length;
        antes = System.nanoTime();
        quickSortRandom(numeros, 0,size - 1);
        depois = System.nanoTime();
        if (checaVetorOrdenado(numeros)){
            return depois-antes;
        }
        return 0;
    }

    public static void quickSortRandom(int[] array, int left, int right) {
        if (left < right) {
            int pivot = randomPartition(array, left, right);
            quickSortRandom(array, left, pivot - 1);
            quickSortRandom(array, pivot + 1, right);
        }
    }

    public static int randomPartition(int[] array, int left, int right) {

        Random rand = new Random();
        int randomIndex = rand.nextInt(right - left + 1) + left;

        swap(array, randomIndex, right);

        return partition(array, left, right);
    }

    @Override
    public long quickSort_Java(int[] numeros) {
        long antes = 0,depois = 0;
        antes = System.nanoTime();
        Arrays.sort(numeros);
        depois = System.nanoTime();
        if (checaVetorOrdenado(numeros)){
            return depois-antes;
        }
        return 0;
    }

    @Override
    public long countingSort(int[] numeros) {
        int maior = 0;
        int size = numeros.length;
        int[] vetorOrdenado = new int[size];
        //maior valor do vetor
        for(int i = 0;i < size;i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        //cria o vetor de coordenadas
        int[] k = new int[maior+1];
        long antes = 0,depois = 0;
        antes = System.nanoTime();
        //guarda quantas vezes o número aparece
        for(int i=0;i<size;i++){
            k[numeros[i]]++;
        }
        //soma os valores do vetor para as posições corretas
        for (int i = 1; i <= maior; i++) {
            k[i] += k[i - 1];
        }
        //Ordena em um novo vetor
        for (int i = size - 1; i >= 0; i--) {
            vetorOrdenado[k[numeros[i]] - 1] = numeros[i];
            k[numeros[i]]--;
        }
        depois = System.nanoTime();

        if(checaVetorOrdenado(vetorOrdenado)){
            return depois-antes;
        }
        return 0;
    }
}
