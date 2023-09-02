import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int conta=0;
        String agencia;
        double saldo=0;
        String cliente;
        System.out.println("****************Bem-Vindo ao Banco Dio****************");
        try {
            System.out.println("Digite sua conta");
            conta = scanner.nextInt();
        } catch (InputMismatchException e) {

            System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
        }
        System.out.println("Digite  Sua Agencia");
        agencia = scanner.next();
        scanner.nextLine();
        System.out.println("Digite seu  Nome");
        cliente = scanner.nextLine();
        System.out.println("Digite saldo na Conta");
        try {
            saldo = scanner.nextFloat();
        } catch (InputMismatchException e2) {

            System.err.println("Não é permitido inserir letras, informe apenas números inteiros!");
        }
        System.out.println("Olá "+cliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+conta+" e seu saldo "+saldo+" já está disponível para saque");
    }
}