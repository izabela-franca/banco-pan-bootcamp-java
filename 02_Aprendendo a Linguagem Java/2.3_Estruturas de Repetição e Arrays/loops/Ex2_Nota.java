package loops;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

import java.util.Scanner;

public class Ex2_Nota {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scanner.nextInt();

        while (nota < 0 | nota >10) {
            System.out.println("Valor inválido! Digite novamente: ");
            nota = scanner.nextInt();
        }
    }
}
