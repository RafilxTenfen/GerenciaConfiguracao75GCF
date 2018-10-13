package GerenciaConfiguracao75GCF;

import java.util.Scanner;

public class Fatorial {

    private int number;

    public Fatorial(int number) {
        this.number = number;
    }

    public void imprime() {
        String valor = "";
        int total = 1;
        for (int i = this.number; i >= 1; i--) {
            if(i == 1) {
                valor += " " + i + " = ";
            } else {
                valor += " " + i + " x";
            }
            total *= i;
        }
        valor += total;
        System.out.println(valor);
    }


    public static void main(String[] args) {
        System.out.println("Informe um número para ver o seu Fatorial");
        Scanner s = new Scanner(System.in);

        int valor = s.nextInt();
        new Fatorial(valor).imprime();
    }
}
