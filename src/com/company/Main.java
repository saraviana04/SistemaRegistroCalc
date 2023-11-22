package com.company;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seja Bem Vindo");
        System.out.println("Escolha qual programa usar"  );
        System.out.println("opcao (1) RegistroJava ou opcao (2) Calculadora"  );

        int opcao = Integer.parseInt(sc.nextLine());
        if(opcao == 1){
            RegistroJava.executa(sc);
        }
        if(opcao == 2) {
            Calculadora.executa(sc);
        }else {
            System.out.println("operacao invalida :-(");
        }


    }
}
