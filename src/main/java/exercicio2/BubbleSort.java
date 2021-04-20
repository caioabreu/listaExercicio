package exercicio2;

public class BubbleSort {

    public static void main(String[] args) {
        int[] vetorEntrada = new int[]{5, 3, 2, 4, 7, 1, 0, 6};
        int[] resultado = bubbleSort(vetorEntrada);

        System.out.println("Vetor ordenado: ");
        imprimeResultado(resultado);
    }

    private static int[] bubbleSort(int[] vetor) {
        int troca;
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    troca = vetor[j + 1];
                    vetor[j + 1] = vetor[j];
                    vetor[j] = troca;
                }
            }
        }

        return vetor;
    }

    private static void imprimeResultado(int[] vetor) {

        for (int i = 0; i < vetor.length; i++) {
            System.out.println(i + ",");
        }
    }
}
