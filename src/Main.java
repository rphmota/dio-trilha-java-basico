import entities.ContaBancaria;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = new ContaBancaria();

        System.out.println("Digite o número da conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo inicial:");
        double saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite a agência:");
        String agencia = scanner.nextLine();

        // Atribui os valores lidos ao objeto conta
        conta.setNumeroConta(numeroConta);
        conta.setNomeCliente(nomeCliente);
        conta.setSaldo(saldo);
        conta.setAgencia(agencia);
        conta.imprimirBoasVindas();
        scanner.close();
    }
}