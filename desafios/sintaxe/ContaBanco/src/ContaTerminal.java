import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        int numero = x.nextInt();

        System.out.println("Agora Digite O nome da Agência:");
        String agencia = x.next();

        System.out.println("Digite Seu Nome:");
        String nomeCliente = x.next();

        System.out.println("Agora digite Seu saldo:");
        double saldo = x.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é:"
                + agencia + ", conta:" + numero + " e seu saldo:" + saldo +"$" +" já está disponível para saque");
    }

}
