package dia2;

import java.util.Scanner;

public class exercicio3 {
    /*
    Escreva um algoritmo em Java que leia dois números inteiros e determine
    qual é o menor. Escreva um algoritmo que determina o maior também.
    */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        int FirstNumber = in.nextInt();

        System.out.println("Digite o segundo número");
        int SecondNumber = in.nextInt();

        if (FirstNumber == SecondNumber) {
            System.out.println("Os dois números são iguais");
        } else if (FirstNumber < SecondNumber) {
            System.out.println("O primeiro número é menor");
        } else {
            System.out.println("O segundo número é menor");
        }

        in.close();
    }
}
