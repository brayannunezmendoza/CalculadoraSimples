package calculadora;

import java.util.Scanner;

/**
 *
 * @author brayan
 */
public class CalculadoraSimples {

    public CalculadoraSimples() {
        Scanner sc = new Scanner(System.in);
        try {
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
        } catch (Exception e) {
            System.out.println("Apenas numeros");
        }
    }
}
