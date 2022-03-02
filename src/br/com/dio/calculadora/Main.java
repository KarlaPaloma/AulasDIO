package br.com.dio.calculadora;

public class Main {

    public static void main(String[] args) {

        //Calculadora
        //Quando coloca o nome da classe com o "." ele acessa o metodo.
        System.out.println(">> Calculadora");
        Calculadora.soma(10, 5);
        Calculadora.subtracao(30, 2);
        Calculadora.divisao(100, 2);
        Calculadora.multiplicacao(2, 6);

        System.out.println(">> Mensagem");
        Mensagem.mensagemManha(8);
        Mensagem.mensagemTarde(14);
        Mensagem.mensagemNoite(18);

        System.out.println(">> Empréstimo");
        Emprestimo.calcular(400, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(500, Emprestimo.getTresParcelas());
        Emprestimo.calcular(200, 0);

        System.out.println(">> Calculando áreas");
        Quadrilatero.area(2);
        Quadrilatero.area(2,3);
        Quadrilatero.area(2,3,4);
    }
}
