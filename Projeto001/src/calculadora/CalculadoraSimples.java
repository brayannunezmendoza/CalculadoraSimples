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
            System.out.println("Digite o primeiro numero para a operação");
            double n1 = sc.nextDouble();
            System.out.println("Digite o segundo numero para a operação");
            double n2 = sc.nextDouble();

            System.out.println("Escolha a operação desejada");
            System.out.println("(1)soma\n(2)subtração\n(3)multiplicação\n(4)divisão");
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
                    System.out.println("Opção não listada");
                    System.out.println("Operação finalizada");
            }
        } catch (Exception e) {
            System.out.println("Apenas numeros");
        }
    }
}
