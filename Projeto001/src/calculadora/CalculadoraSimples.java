package calculadora;

import java.util.Scanner;

/**
 *
 * @author brayan
 */
public class CalculadoraSimples {

    public CalculadoraSimples() {
        int es;
        boolean continuar = true;
        Scanner sc = new Scanner(System.in);

        try {
            do {
                System.out.println("Digite o primeiro numero para a opera��o");
                double n1 = sc.nextDouble();
                System.out.println("Digite o segundo numero para a opera��o");
                double n2 = sc.nextDouble();

                System.out.println("Escolha a opera��o desejada");
                System.out.println("(1)soma\n(2)subtra��o\n(3)multiplica��o\n(4)divis�o");
                int e = sc.nextInt();
                switch (e) {
                    case 1:
                        System.out.println("Resultado: " + (n1 + n2));
                        break;
                    case 2:
                        System.out.println("Resultado: " + (n1 - n2));
                        break;
                    case 3:
                        System.out.println("Resultado: " + (n1 * n2));
                        break;
                    case 4:
                        System.out.println("Resultado: " + (n1 / n2));
                        break;
                    default:
                        System.out.println("Op��o n�o listada");
                        System.out.println("Opera��o finalizada");
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
            System.out.println("Apenas numeros");
        }

        sc.close();

    }

}
