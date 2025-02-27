import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // rondas
        int max = 10;
        int min = 1;
        int dado1;
        int dado2;
        int suma1 = 0;
        int suma2 = 0;
        int rondas;

        Random ale = new Random();

        rondas = ale.nextInt(max - min + 1) + min;
        //dado1 = ale.nextInt(6 - min + 1) + min;
        //dado2 = ale.nextInt(6 - min + 1) + min;

        // System.out.println("NUM: " + num);
        for (int i = 0; i < rondas; i++) {
            dado1 = ale.nextInt(6 - min + 1) + min;
            dado2 = ale.nextInt(6 - min + 1) + min;
            suma1 = suma1 + dado1;
            suma2 = suma2 + dado2;
            System.out.println();

        }
        System.out.print("suma1: " + suma1);
        System.out.println();
        System.out.print("suma2: " + suma2);
        System.out.println();

        if (suma1>= suma2) {
            System.out.print("El dado 1 es el ganador");
        }else   {
            System.out.print("El dado 2 es el ganador");
        }

        }
    }
