package com.company;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class RegistroJava {


        public static void executa(Scanner entrada) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Scanner ler = new Scanner(System.in);

            /*Variavel*/
            double Taxa;
            char resp = 0;

            do {

                try {
                    /*Data*/
                    System.out.println("Entre com data");
                    Date date = simpleDateFormat.parse(entrada.next());


                    /*hora entrada*/
                    Scanner entrada1 = new Scanner(System.in);
                    System.out.println("Entre com a hora de Inicio");
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
                    LocalTime horaInicio = LocalTime.parse(entrada1.nextLine(), dtf);

                    /*hora saida*/
                    Scanner saida = new Scanner(System.in);
                    System.out.println("Entre com a hora  Final");
                    dtf = DateTimeFormatter.ofPattern("HH:mm");
                    LocalTime horaFinal = LocalTime.parse(saida.nextLine(), dtf);

                    /*taxa do horario*/
                    Scanner entradaDados = new Scanner(System.in);
                    System.out.println("Digite o valor da taxa do horario R$: ");
                    Taxa = entradaDados.nextDouble();

                    /*Formula da diferença das horas*/
                    long time = ChronoUnit.MINUTES.between(horaInicio, horaFinal);

                    /*calculo de minutos total convertidos para horas e minutos*/
                    long horas = time / 60;
                    long minutos = time % 60;
                    double valorPago = (time * Taxa) / 60;


                    /*impressao na tela dos resultados */
                    System.out.println("A data de Entrada: " + simpleDateFormat.format(date));
                    System.out.println("A hora de Entrada: " + horaInicio);
                    System.out.println("A hora de Saida: " + horaFinal);

                    /*calculo final para me retorna os minutos total trabalhados em  horas e minutos*/
                    String tempoFinal = String.format("A quantidade de horas trabalhadas e: %02d :%02d ", horas, minutos);

                    /*resultado da diferença das horas trabalhadas*/
                    System.out.println(tempoFinal);
                    System.out.printf("Valor a ser pago pelas horas Trabalhadas: R$ %.2f", valorPago);
                    System.out.println();
                    System.out.println("Deseja continuar (S/N)?");
                    resp = ler.next().toLowerCase().charAt(0);

                } catch (ParseException e) {
                    e.printStackTrace();

                    ler.close();
                }

            } while (resp != 'n');
            {
                System.out.println("Obrigado por usar o Registro de Horas de Trabalho em Java!");
            }
        }

    }


