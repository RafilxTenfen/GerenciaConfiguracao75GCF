package GerenciaConfiguracao75GCF;

import java.util.Scanner;

public class Pitagoras {

    private int numberA;
    private int numberB;

    public Pitagoras(int numberA, int numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public void imprime() {
        double c = Math.sqrt((numberA * numberA) + (numberB * numberB));

        System.out.println("O valor da hipotenusa é: " + c);
    }


    public static void main(String[] args) {
        System.out.println("Pitagoras \nInforme o valor de A:");
        Scanner s = new Scanner(System.in);
        int valorA = s.nextInt();
        System.out.println("Informe o valor de B:");
        int valorB = s.nextInt();
        new Pitagoras(valorA, valorB).imprime();
        s.close();
    }
}
