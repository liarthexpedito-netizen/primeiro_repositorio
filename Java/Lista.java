package repositorio.java;

import java.util.Locale;
import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] lista = new int[5];

        System.out.println("Digite cinco números interios:");
        for (int i = 0; i < lista.length; i++) {
            lista[i] = sc.nextInt();
        }

        System.out.println("Os números digitados foram: ");
        for (int numeros : lista) {
            System.out.println(numeros);
        }

        sc.close();
    }
    
}