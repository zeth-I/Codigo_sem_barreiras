package dia1;

import java.util.Scanner;

public class exercicioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base = scanner.nextInt();
        double altura = scanner.nextInt();

        System.out.println(base * altura / 2);
    }
}
