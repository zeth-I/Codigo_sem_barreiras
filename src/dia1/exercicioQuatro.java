package dia1;

import java.util.Scanner;

public class exercicioQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o total de eleitores");
        long eleitores = scanner.nextLong();

        System.out.println("Digite o total de Votos (válidos)");
        long votosValidos = scanner.nextLong();

        System.out.println("Digita o total de votos brancos");
        long votosBrancos = scanner.nextLong();

        System.out.println("Digite o total de votos nulos");
        long votosNulos = scanner.nextLong();
        // \n <= pula uma linha

        System.out.printf("O percentual de votos válidos é: %.2f%%%n", votosValidos * 100f / eleitores);
        float percentualVotosNulos = votosNulos * 100f / eleitores;

        System.out.printf("O percentual de votos válidos é: %.2f%%%n", votosNulos * 100f / eleitores);
        float percentualVotosBrancos = votosBrancos * 100f / eleitores;

        System.out.printf("O percentual de votos válidos é: %.2f%%%n", votosBrancos * 100f / eleitores);

        scanner.close();
    }
}
