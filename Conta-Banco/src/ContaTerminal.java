import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Por favor, digite seu nome: ");
        String nome = scanner.nextLine();
  
        System.out.print("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da conta:");
        int conta = Integer.parseInt(scanner.nextLine());

        double saldo = 3.55;
           
        
        System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +  ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
        
        scanner.close();
    }
}
