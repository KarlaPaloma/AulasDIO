package br.com.dio.calculadora;

public class Calculadora {

    // metodo que retorna uma soma
    public static void soma(double numero1, double numero2){
        double resultado = numero1 + numero2;
        System.out.println("A soma de " + numero1 + " + " + numero2 + " é: " + resultado);
    }

    // metodo que retorna uma subtração
    public static void subtracao(double numero1, double numero2){
        double resultado = numero1 - numero2;
        System.out.println("A subtração de "+ numero1 + " - " +numero2 + " é: "+ resultado);
    }

    // metodo que retorna uma divisão
    public static void divisao(double numero1 , double numero2){
        double resultado = numero1 / numero2;
        System.out.println("A divisão dos números é: " + numero1 + " / " + numero2 + " é: " + resultado);
    }

    //metodo que retorna uma multiplicação
    public static void multiplicacao(double numero1 , double numero2){
        double resultado = numero1 * numero2;
        System.out.println("A multiplicação dos números é: " + numero1 + " * " + numero2 + " é: " + resultado);

    }


}
