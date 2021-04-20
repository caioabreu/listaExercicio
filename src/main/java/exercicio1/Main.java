package exercicio1;

public class Main {

    public static void main(String[] args) {
        double votosValidos = 800;
        double totalEleitores = 1000;
        double votosBrancos = 150;
        double votosNulos = 10;

        System.out.format("Percentual de votos válidos em relação ao total de eleitores: %.2f %%", votosValidosPeloTotalEleitores(votosValidos, totalEleitores));
        System.out.format("\nPercentual de votos brancos em relação ao total de eleitores: %.2f %%", votosBrancosPeloTotalEleitores(votosBrancos, totalEleitores));
        System.out.format("\nPercentual de votos nulos em relação ao total de eleitores: %.2f %%", votosNulosPeloTotalEleitores(votosNulos, totalEleitores));

    }

    private static double votosValidosPeloTotalEleitores(double numVotos, double total) {
        return (numVotos / total) * 100;
    }

    private static double votosBrancosPeloTotalEleitores(double numBrancos, double total) {
        return (numBrancos / total) * 100;
    }

    private static double votosNulosPeloTotalEleitores(double numVotosNulos, double total) {
        return (numVotosNulos / total) * 100;
    }
}
