import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        // criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Insira o número de sua conta:");    
        // exibe mensagens para o usuário 

        int numeroConta = scanner.nextInt();
        // pede para o usuário inserir os dados  

        System.out.println("Insira o número de sua agencia:");
        String agencia = scanner.next();

        System.out.println("Insira o seu nome:");
        String nomeUsuario = scanner.next();

        System.out.println("Insira seu sobrenome:");
        String sobrenomeUsuario = scanner.next();

        System.out.println("Insira o saldo de sua conta:");
        double saldo = scanner.nextDouble();
        
        // exibe uma mensagem informando os dados da conta criada
        System.out.println("\"Olá " + nomeUsuario + " " + sobrenomeUsuario + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }    
}