package br.com.dio.calculadora;

public class Emprestimo {

    public static int getDuasParcelas() {
        return 2;
    }

    public static int getTresParcelas() {
        return 3;
    }

    public static double getTaxaDuasParcelas(int i, int i1) {
        return 0.50;
    }

    public static double getTaxaTresParcelas(int i, int tresParcelas) {
        return 1.45;
    }

    public static void calcular(double valor, int parcelas) {

        if (parcelas == 2) {

            double valorFinal = valor + (valor * getTaxaDuasParcelas(400, 2));

            System.out.println("O valor referente a duas parcelas será de R$ " + valorFinal);

        } else if (parcelas == 3) {

            double valorFinal = valor + (valor * getTaxaTresParcelas(500, Emprestimo.getTresParcelas()));

            System.out.println("O valor refente a três parcelas será de R$ " + valorFinal);

        } else {

            System.out.println("Quantidade de parcelas informada não é válida! ");
        }
    }
}
