import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, informe o número da conta: ");
        int numeroDaConta = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor, informe o número da agência: ");
        String numeroDaAgencia = sc.nextLine();

        System.out.println("Por favor, informe o seu nome: ");
        String nomeDoCliente = sc.nextLine();

        System.out.println("Por favor, informe o saldo: ");
        double saldo = sc.nextDouble();

        System.out.println("Olá, " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " +
                numeroDaAgencia +", conta: " +numeroDaConta+ " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
