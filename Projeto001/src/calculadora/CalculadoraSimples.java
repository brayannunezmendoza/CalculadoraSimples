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
                System.out.println("Digite o primeiro numero para a operação");
                n1 = sc.nextDouble();
                System.out.println("Digite o segundo numero para a operação");
                n2 = sc.nextDouble();
                System.out.println("Escolha a operação desejada");
                System.out.println("(1)soma\n(2)subtração\n(3)multiplicação\n(4)divisão");
                e = sc.nextInt();
                switch (e) {
                    case 1 -> System.out.println("Resultado: " + (n1 + n2));
                    case 2 -> System.out.println("Resultado: " + (n1 - n2));
                    case 3 -> System.out.println("Resultado: " + (n1 * n2));
                    case 4 -> System.out.println("Resultado: " + (n1 / n2));
                    default -> {
                        System.out.println("Opção não listada");
                        System.out.println("Operação finalizada");
                    }
                }
                System.out.println("Recomeçar?\n(1)Sim\n(2)Não");
                es = sc.nextInt();
                switch (es) {
                    case 2:
                        continuar = false;
                        break;
                    case 1:
                        continuar = true;
                    default:
                        System.out.println("Opção não reconhecido\nOperação finalizada");
                        continuar = false;
                }
            } while (continuar);
        } catch (Exception InputMismatchException) {
            System.out.println("Apenas numeros\nO processo será finalizado");
        }
        sc.close();
    }
}
