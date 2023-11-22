package com.company;
import java.util.Locale;
import java.util.Scanner;

public class Calculadora {



        public static void executa (Scanner entrada) {
            Scanner sc = new Scanner(System.in);
            //Variaveis
            boolean continuar;


            do{
                System.out.println("Digite o valor um: ");
                double valorUm = Double.parseDouble(entrada.nextLine());

                System.out.println("Digite a Operacao(+, -, *, /): ");
                String operacao = entrada.nextLine();

                System.out.println("Digite o valor um: ");
                double valorDois = Double.parseDouble(entrada.nextLine());

                System.out.println("Resultado:" + realizarCalculo(valorUm, valorDois, operacao));
                continuar = verificarNovaOperacao();
            }while(continuar);
            System.out.print("Obrigada po usar calculadora java");

        }

        public static  boolean verificarNovaOperacao(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Deseja realizar nova operacao ? (S ou N): " );
            return !sc.nextLine().toUpperCase(Locale.ROOT).equals("N");
        }

        public static Double realizarCalculo(Double valorUm, Double valorDois, String operacao) {
            Double respostaCalculo = 0.0;

            if ("+".equals(operacao)) {
                respostaCalculo = valorUm + valorDois;
            } else if ("-".equals(operacao)) {
                respostaCalculo = valorUm - valorDois;
            } else if ("*".equals(operacao)) {
                respostaCalculo = valorUm * valorDois;
            } else if ("/".equals(operacao)) {
                respostaCalculo = valorUm / valorDois;
            } else {
                System.out.println("operacao invalida :-(");
            }

            return respostaCalculo;



        }
    }

