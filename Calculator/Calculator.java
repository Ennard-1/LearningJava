package Calculator;

import java.util.Scanner;

public class Calculator {

    private Scanner scanner;

    public Calculator(Scanner scanner) {
        this.scanner = scanner;
    }

    public String inputNumber() {
        System.out.println("Adicione um número:");
        return scanner.nextLine();
    }

    public String inputOperator() {
        System.out.println("Adicione um operador (+, -, *, /):");
        return scanner.nextLine();
    }

    public int Selector() {
        String num1Str = inputNumber();
        String operator = inputOperator();
        String num2Str = inputNumber();

        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);

        int resultado = 0;

        switch (operator) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: divisão por zero.");
                }
                break;
            default:
                System.out.println("Operador inválido.");
        }

        return resultado;
    }
}
