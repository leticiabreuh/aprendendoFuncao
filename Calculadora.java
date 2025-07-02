import java.util.Scanner;
 
public class Calculadora {
 
    // Métodos que retornam resultado
    public static double somar(double numero1, double numero2) {
        return numero1 + numero2;
    }
 
    public static double dividir(double numero1, double numero2) {
        return numero1 / numero2;
    }
 
    public static double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }
 
    public static double subtrair(double numero1, double numero2) {
        return numero1 - numero2;
    }
 
    public static double restoDaDivisao(double numero1, double numero2) {
        return numero1 % numero2;
    }
 
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
 
        while (continuar) {
 
            System.out.println("Digite o primeiro número: ");
            double numero1 = scanner.nextDouble();
 
            System.out.println("Digite o segundo número: ");
            double numero2 = scanner.nextDouble();
 
            System.out.println("\nEscolha a operação:");
            System.out.println("1 - Somar");
            System.out.println("2 - Dividir");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Subtrair");
            System.out.println("5 - Resto da divisão");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
 
            double resultado;
 
            switch (opcao) {
                case 1:
                    resultado = somar(numero1, numero2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 2:
                    if (numero2 != 0) {
                        resultado = dividir(numero1, numero2);
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida!");
                    }
                    break;
                case 3:
                    resultado = multiplicar(numero1, numero2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 4:
                    resultado = subtrair(numero1, numero2);
                    System.out.println("Resultado: " + resultado);
                    break;
                case 5:
                    resultado = restoDaDivisao(numero1, numero2);
                    System.out.println("Resultado: " + resultado);
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
 
            System.out.println("\nDeseja continuar? (s/n)");
            String resposta = scanner.next();
 
            if (resposta.equalsIgnoreCase("n")) {
                continuar = false;
                System.out.println("Calculadora encerrada!");
            }
        }
 
        scanner.close();
    }
}
 