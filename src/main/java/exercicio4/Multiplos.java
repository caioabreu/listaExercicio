package exercicio4;

import java.util.Scanner;

public class Multiplos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um número: \n");
        int numeroEntrada = entrada.nextInt();

        System.out.println("Soma dos múltiplos de 3 ou 5: " + somaMultiplos3Ou5(numeroEntrada));
    }

    private static int somaMultiplos3Ou5(int numero) {
        int soma = 0;
        for (int i = 3; i < numero; i++) {
            if (i % 3 == 0) {
                soma += i;
            }
            if (i % 5 == 0) {
                soma += i;
            }
        }

        return soma;
    }
}
