import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta:");
        int conta = scanner.nextInt(); 
        
        System.out.println("Digite o número da agência:");
        int agencia = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite o seu nome e sobrenome:");
        String nome = scanner.nextLine();

        System.out.println("Digite o valor a ser depositado:");
        float saldo = scanner.nextFloat();

        System.out.println("Olá, " +nome+ " obrigado por criar uma conta em nosso banco, sua agência é " +agencia+ ", conta " +conta+ " e seu saldo " +saldo+ " já está disponível para saque");
    }
}
