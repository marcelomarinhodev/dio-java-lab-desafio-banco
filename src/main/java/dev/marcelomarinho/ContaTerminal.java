package dev.marcelomarinho;

import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        try {
            imprimeTextoNumero();
            int numero = preencherNumero(scanner);
            scanner = new Scanner(System.in);

            imprimeTextoAgencia();
            String agencia = preencherAgencia(scanner);

            imprimeTextoNomeCliente();
            String nome = preencherNomeCliente(scanner);

            imprimeTextSaldo();
            BigDecimal saldo = preencherSaldo(scanner);

            System.out.println("Olá "
                    .concat(nome)
                    .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                    .concat(agencia)
                    .concat(", conta ")
                    .concat(String.valueOf(numero))
                    .concat(" e seu saldo ")
                    .concat(String.valueOf(saldo))
                    .concat(" já está disponível para saque")
            );
        } finally {
            scanner.close();
        }
    }

    private static void imprimeTextoNumero() {
        System.out.println("Por favor, digite o número da Conta!");
        System.out.print("Conta: ");
    }

    private static int preencherNumero(Scanner scanner) {
        return scanner.nextInt();
    }

    private static void imprimeTextoAgencia() {
        System.out.println("Por favor, digite o número da Agência!");
        System.out.print("Agência: ");
    }

    private static String preencherAgencia(Scanner scanner) {
        return scanner.nextLine();
    }

    private static void imprimeTextoNomeCliente() {
        System.out.println("Por favor, digite o seu nome!");
        System.out.print("Nome: ");
    }

    private static String preencherNomeCliente(Scanner scanner) {
        return scanner.nextLine();
    }

    private static void imprimeTextSaldo() {
        System.out.println("Por favor, digita o saldo!");
        System.out.print("Saldo: ");
    }

    private static BigDecimal preencherSaldo(Scanner scanner) {
        return BigDecimal.valueOf(scanner.nextDouble());
    }

}
