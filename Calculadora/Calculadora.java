package Calculadora;

public class Calculadora {

    public double somar(double valor1, double valor2){
        System.out.println(valor1 + valor2);
        return valor1 + valor2;
    }

    public double multiplicacao(double valor1, double valor2){
        System.out.println(valor1 * valor2);
        return valor1 * valor2;

    }

    public double subtracao(double valor1, double valor2){
        System.out.println(valor1 - valor2);
        return valor1 - valor2;
    }

    public double divisao(double valor1, double valor2){
        if (valor2 == 0){
            throw new ArithmeticException("Não é possivel dividir por zero.");
        }
            System.out.println(valor1 / valor2);
            return valor1 / valor2;
    }
}
