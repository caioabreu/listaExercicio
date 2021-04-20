package exercicio3;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira um número para ser calculado seu fatorial: \n");
        int numeroEntrada = entrada.nextInt();
        System.out.println("Fatorial recursivo: " + calculaFatorial(numeroEntrada));
        System.out.println("Fatorial iterativo: " + calculaFatorialNaoRecursivo(numeroEntrada));
    }

    private static int calculaFatorial(int numero) {

        if (numero == 0) {
            return 1;
        } else if (numero > 0) {
            numero *= calculaFatorial(numero - 1);
        }

        return numero;
    }

    private static int calculaFatorialNaoRecursivo(int numero) {
        if (numero == 0) {
            return 1;
        } else if (numero > 0) {
            for (int i = numero; i >= 2; i--) {
                numero *= (i - 1);
            }
        }

        return numero;
    }
}
