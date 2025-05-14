public class Main {
    public static void main(String[] args) {
        // Criação das contas
        ContaBancaria c1 = new ContaBancaria(1001, "Ana Silva", 500.0);
        ContaBancaria c2 = new ContaBancaria(1002, "João Pereira", 1000.0);

        // Teste na conta 1
        System.out.printf("Saldo inicial (c1): R$ %.2f%n", c1.getSaldo());
        c1.depositar(150.0);
        System.out.printf("Após depósito de R$ 150,00 (c1): R$ %.2f%n", c1.getSaldo());
        boolean okSacarC1 = c1.sacar(700.0);
        System.out.printf("Tentativa de saque de R$ 700,00 (c1): %s%n", okSacarC1 ? "sucesso" : "falha");
        System.out.printf("Saldo final (c1): R$ %.2f%n", c1.getSaldo());

        System.out.println(); // Linha em branco para separar os testes

        // Teste na conta 2
        System.out.printf("Saldo inicial (c2): R$ %.2f%n", c2.getSaldo());
        c2.depositar(200.0);
        System.out.printf("Após depósito de R$ 200,00 (c2): R$ %.2f%n", c2.getSaldo());
        boolean okSacarC2 = c2.sacar(1200.0);
        System.out.printf("Tentativa de saque de R$ 1200,00 (c2): %s%n", okSacarC2 ? "sucesso" : "falha");
        System.out.printf("Saldo final (c2): R$ %.2f%n", c2.getSaldo());
    }
}
