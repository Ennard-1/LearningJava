package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        Calculator calc = new Calculator(scanner);
        int resultado = calc.Selector();
        System.out.println("Resultado: " + resultado);
        scanner.close(); 
    }
}
