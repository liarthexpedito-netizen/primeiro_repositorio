package repositorio_dois.java;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[2][2];

        System.out.println("Digite quatro números inteiros: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Os números digitados foram: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j]);
            }
        }

        sc.close();
    }
}

