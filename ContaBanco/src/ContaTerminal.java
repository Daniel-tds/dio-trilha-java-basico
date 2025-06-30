import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println ("Por favor, digite o numero da conta! ");
        var numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println ("Por favor, digite o numero da Agencia! ");
        var agencia = scanner.nextLine();

        System.out.println ("Por favor, digite o seu nome! ");
        var nomeCliente = scanner.nextLine();

        System.out.println ("Por favor, digite o saldo! ");
        var saldo = scanner.nextFloat();

        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque." ,nomeCliente, agencia, numero, saldo);

        scanner.close();
    }
}
