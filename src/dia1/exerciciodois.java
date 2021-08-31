package dia1;

import java.util.Scanner;

public class exerciciodois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer numero = scanner.nextInt();

        System.out.println("Antecessor é");
        System.out.println(numero - 1);
        // mostrar o antecessor

        scanner.close();;
    }
}
