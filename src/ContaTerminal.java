
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        String agencia;
        int numero;
        String nomeCliente;
        double saldo;

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Por favor, digite o número da Agência!");
            agencia = scanner.next();

            System.out.println("Por favor, digite o número da Conta!");
            numero = scanner.nextInt();

            System.out.println("Por favor, digite o Nome do Cliente!");
            scanner.nextLine(); //Usado para limpar o scanner.
            nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o Saldo!");
            saldo = scanner.nextDouble();
        }
        
        System.out.println(
            "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
            + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
