package com.company;

public class SelectionSort {

    private int elementos[] = new int[]{5,1,3,4,2};

    public void imprimirVetor() {
        for (int elemento : elementos) {
            System.out.print(elemento + " ");
        }

    }

    public void selectionSort() {

        for (int i = 0; i < elementos.length - 1; i++) {

            int menorIndice = i;

            for(int j = i + 1; j < elementos.length;j++){
                if(elementos[j] < elementos[menorIndice]){
                    menorIndice = j;
                }
            }

            int temp = elementos[menorIndice];
            elementos[menorIndice] = elementos[i];
            elementos[i] = temp;

            System.out.print("Iteração " + (i+1) + " - " );
            imprimirVetor();
            System.out.println("");

        }

    }

}
