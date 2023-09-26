import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String resposta = "s";
        while (resposta.equals( "s")) { //aten~]ao ao equals
            System.out.println("Calcular novo IMC? S/N");
            resposta = entrada.nextLine();

        if (resposta.equals("s")) {
            System.out.println("Entre com o seu peso em Kg:");
            float peso = entrada.nextFloat();
            entrada.nextLine();
            System.out.println("Entre com a altura em metros:");
            float altura = entrada.nextFloat();
            entrada.nextLine(); //atenção ao next line

            float imc = peso / (altura * altura);
            System.out.printf("O seu IMC é: " + imc);

            String classificacao = "";

            if (imc < 18.5) classificacao = "MAGREZA";
            else if (imc < 24.9) classificacao = "NORMAL";
            else if (imc > 25 && imc < 29.9) classificacao = "SOBREPESO";
            else if (imc > 30 && imc < 39.9) classificacao = "OBSIDADE";
            else classificacao = "OBESIDADE GRAVE";

            System.out.println("A classificação é: " + classificacao);
           }
        }
    }
}