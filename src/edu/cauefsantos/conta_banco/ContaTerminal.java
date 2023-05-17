package edu.cauefsantos.conta_banco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Olá! Informe seu nome para iniciarmos: ");
        String nomeCliente = sc.next();

        System.out.printf("%s, por favor digite o número da sua conta: ", nomeCliente);
        int numeroConta = sc.nextInt();

        System.out.print("Agora informe a agencia: ");
        String numeroAgencia = sc.next();

        System.out.print("Por fim, digite seu saldo: R$");
        double saldo = sc.nextDouble();

        System.out.printf("Olá, %s! Obrigado por criar uma conta em nosso banco! Sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque", nomeCliente, numeroAgencia, numeroConta, saldo);

        sc.close();

    }
}
