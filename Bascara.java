package GerenciaConfiguracao75GCF;

import java.util.Scanner;

public class Bascara {

    private int numberA;
    private int numberB;
    private int numberC;

    public Bascara(int numberA, int numberB, int numberC) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.numberC = numberC;
    }

    public void imprime() {
        double x1 = 0;
        double x2 = 0;

        double formula = Math.sqrt((numberB * numberB) - (4 * numberA * numberC));
        x1 = (-numberB + formula) / (2 * numberA);
        x2 = (-numberB - formula) / (2 * numberA);

        System.out.println("O valor de x1: " + x1);
        System.out.println("O valor de x2: " + x2);
    }


    public static void main(String[] args) {
        System.out.println("Bascara \nInforme o valor de A:");
        Scanner s = new Scanner(System.in);
        int valorA = s.nextInt();
        System.out.println("Informe o valor de B:");
        int valorB = s.nextInt();
        System.out.println("Informe o valor de C:");
        int valorC = s.nextInt();
        new Bascara(valorA, valorB, valorC).imprime();
        s.close();
    }
}
