package repositorio.java;

import java.util.Scanner;
import java.util.Locale;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

        if (altura >= 1.70) {
            System.out.println(nome + " tem altura para servir ao exército");
        } else {
            System.out.println("Você é muito baixo para servi ao exército");
        }

        sc.close();
    }
}