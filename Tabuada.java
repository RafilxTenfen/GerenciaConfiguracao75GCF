package GerenciaConfiguracao75GCF;

import java.util.Scanner;

public class Tabuada {

    private int number;

    public Tabuada(int number) {
        this.number = number;
    }

    public void imprime() {
        for (int i = 1; i < 11; i++) {
            System.out.println(i + " x " + this.number + " = " + (i*this.number));
        }
    }

    public static void main(String[] args) {
        System.out.println("Informe um número para ver a sua tabuada");
        Scanner s = new Scanner(System.in);

        int valor = s.nextInt();
        new Tabuada(valor).imprime();
    }

}