package Calculadora;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        Calculadora calcular = new Calculadora();

            Locale.setDefault(Locale.US);
            System.out.println("Sejá bem vindo a nossa calculadora: ");
            int operacao = 0;
            double valor1, valor2;

            do {
                try {

                    System.out.println("Digite o número da operção que você escolhe: ");

                    System.out.println("# 1 Somar(+): ");
                    System.out.println("# 2 Multiplicação(*): ");
                    System.out.println("# 3 Subtrair(-): ");
                    System.out.println("# 4 Divisão(/): ");
                    System.out.println("# 0 Sair: ");

                    operacao = sc.nextInt();

                    System.out.print("Digite um número: ");
                    valor1 = sc.nextDouble();
                    System.out.print("Digite outro número: ");
                    valor2 = sc.nextDouble();

                    switch (operacao) {
                        case 1:
                            calcular.somar(valor1, valor2);
                            break;
                        case 2:
                            calcular.multiplicacao(valor1, valor2);
                            break;
                        case 3:
                            calcular.subtracao(valor1, valor2);
                            break;
                        case 4:
                            try {
                                calcular.divisao(valor1, valor2);
                            } catch (ArithmeticException e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        case 0:
                            System.out.println("Saindo da calculadora ");
                            break;
                        default:
                            System.out.println("Opção inválida!");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Caracteres inválidos");
                    sc.next();
                }
            }while (operacao != 0) ;

                sc.close();
    }
}
