package repositorio.java;

import java.util.Scanner;
import java.util.Locale;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

        if (altura >= 1.70 && idade >= 18) {
            System.out.println("Com " + idade + " de idade e medindo " + altura + " de altura, " + nome + " está apto a servir ao exército");
        } else if (altura < 1.60) {
            System.out.println("Você não possui estatura mínima");
        } else if (idade < 18) {
            System.out.println("Você ainda não completou 18 anos");
        }

        sc.close();
    }
}