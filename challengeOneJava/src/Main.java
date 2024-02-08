import entities.Account;
import entities.Client;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Client client = new Client("Guilherme da Silva Neves");
        Account account = new Account("Corrent", client, 2500.0);

        System.out.println("Dados iniciais do cliente:");
        System.out.println(account);
        System.out.println();

        String clientOptions = """
                Operações
                
                1 - Consultar saldos
                2 - Sacar valor
                3 - Depositar valor
                4 - Sair
                """;

        int selectedOption = 0;
        double amount = 0;

        while (selectedOption != 4) {
            System.out.println();
            System.out.println(clientOptions);

            System.out.print("Digite a opção desejada: ");
            selectedOption = scanner.nextInt();

            if (selectedOption == 1) {
                System.out.println("Seu saldo é: " + account.getBalance());
            } else if (selectedOption == 2) {
                System.out.println("Informe o valor desejado para saque: ");
                amount = scanner.nextDouble();
                account.withdraw(amount);
                System.out.println("Seu novo saldo é: " + account.getBalance());
            } else if (selectedOption == 3) {
                System.out.println("Informe o valor desejado para depósito: ");
                amount = scanner.nextDouble();
                account.deposit(amount);
                System.out.println("Seu novo saldo é: " + account.getBalance());
            } else {
                System.out.println("Opção selecionada é inválida!");
            }
        }
    }
}