package entities;

public class Account {
    private String type;
    private Client client;
    private Double balance;

    public Account() {

    }

    public Account(String type, Client client, Double balance) {
        this.type = type;
        this.client = client;
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public Client getClient() {
        return client;
    }

    public Double getBalance() {
        return balance;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void withdraw(Double amount) {
        if (amount > balance) {
            System.out.println("Valor de saque maior que o saldo!");
        } else if (amount <= 0) {
            System.out.println("O valor para saque deve ser maior que 0!");
        }
        balance -= amount;
    }

    public void deposit(Double amount) {
        if (amount <= 0) {
            System.out.println("O valor para depósito deve ser maior que 0!");
        }
        balance += amount;
    }

    @Override
    public String toString() {
        return  "Nome: " + getClient().getName() +
                " Tipo da conta: " + getType() +
                " Saldo inicial: " + getBalance();
    }
}
