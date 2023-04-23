package celso;


import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double numUm, numDois, resultado;
        int opcao;
        
        System.out.println("Bem-vindo(a) à calculadora!");
        
        do {
            System.out.println("\nSelecione a operação que deseja realizar:");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Potenciação");
            System.out.println("0. Sair");
            
            opcao = sc.nextInt();
            
            switch(opcao) {
                case 1:
                    System.out.println("\nDigite o primeiro número:");
                    numUm = sc.nextDouble();
                    System.out.println("Digite o segundo número:");
                    numDois = sc.nextDouble();
                    resultado = numUm + numDois;
                    System.out.println("Resultado da soma: " + resultado);
                    break;
                    
                case 2:
                    System.out.println("\nDigite o primeiro número:");
                    numUm = sc.nextDouble();
                    System.out.println("Digite o segundo número:");
                    numDois = sc.nextDouble();
                    resultado = numUm - numDois;
                    System.out.println("Resultado da subtração: " + resultado);
                    break;
                    
                case 3:
                    System.out.println("\nDigite o primeiro número:");
                    numUm = sc.nextDouble();
                    System.out.println("Digite o segundo número:");
                    numDois = sc.nextDouble();
                    resultado = numUm * numDois;
                    System.out.println("Resultado da multiplicação: " + resultado);
                    break;
                    
                case 4:
                    System.out.println("\nDigite o primeiro número:");
                    numUm = sc.nextDouble();
                    System.out.println("Digite o segundo número:");
                    numDois = sc.nextDouble();
                    
                    if(numDois == 0) {
                        System.out.println("Não é possível dividir por zero.");
                    } else {
                        resultado = numUm / numDois;
                        System.out.println("Resultado da divisão: " + resultado);
                    }
                    break;
                    
                case 5:
                    System.out.println("\nDigite o primeiro número:");
                    numUm = sc.nextDouble();
                    System.out.println("Digite o segundo número:");
                    numDois = sc.nextDouble();
                    resultado = Math.pow(numUm, numDois);
                    System.out.println("Resultado da potenciação: " + resultado);
                    break;
                    
                case 0:
                    System.out.println("\nEncerrando a calculadora...");
                    break;
                    
                default:
                    System.out.println("\nOpção inválida. Por favor, selecione uma opção válida.");
                    break;
            }
            
        } while(opcao != 0);
        
        sc.close();
    }

	public static double soma(double numUm, double numDois) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static double subtracao(double numUm, double numDois) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static double multiplicacao(double numUm, double numDois) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static double divisao(double numUm, double numDois) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static double potenciacao(double numUm, double numDois) {
		// TODO Auto-generated method stub
		return 0;
	}
}
