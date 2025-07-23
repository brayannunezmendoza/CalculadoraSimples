package calculadora;

import java.util.Scanner;

/**
 *
 * @author brayan
 */
public class CalculadoraSimples {

    public CalculadoraSimples() {
        double n1 = 0;
        double n2;
        int e;
        int es;
        boolean continuar = true;
        Scanner sc = new Scanner(System.in);

        try {
            do {
                System.out.println("Digite o primeiro numero para a opera��o");
                n1 = sc.nextDouble();
                System.out.println("Digite o segundo numero para a opera��o");
                n2 = sc.nextDouble();
                System.out.println("Escolha a opera��o desejada");
                System.out.println("(1)soma\n(2)subtra��o\n(3)multiplica��o\n(4)divis�o");
                e = sc.nextInt();
                switch (e) {
                    case 1 -> System.out.println("Resultado: " + (n1 + n2));
                    case 2 -> System.out.println("Resultado: " + (n1 - n2));
                    case 3 -> System.out.println("Resultado: " + (n1 * n2));
                    case 4 -> System.out.println("Resultado: " + (n1 / n2));
                    default -> {
                        System.out.println("Op��o n�o listada");
                        System.out.println("Opera��o finalizada");
                    }
                }
                System.out.println("Recome�ar?\n(1)Sim\n(2)N�o");
                es = sc.nextInt();
                switch (es) {
                    case 2:
                        continuar = false;
                        break;
                    case 1:
                        continuar = true;
                    default:
                        System.out.println("Op��o n�o reconhecido\nOpera��o finalizada");
                        continuar = false;
                }
            } while (continuar);
        } catch (Exception InputMismatchException) {
            System.out.println("Apenas numeros\nO processo ser� finalizado");
        }
        sc.close();
    }
}
