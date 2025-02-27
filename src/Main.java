import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        // rondas
        int max = 50;
        int min = 1;
        int numero;
        int user;
        int i = 0;


        Random ale = new Random();

        numero = ale.nextInt(max - min + 1) + min;

        Scanner teclado = new Scanner(System.in);
        System.out.print(numero);
        System.out.println();

        while (i < 3) {
            System.out.print("Escriba un numero: ");
            user = teclado.nextInt();
            System.out.println(user);

            if (user  > numero) {
                System.out.print("El numero a Adivinar es menor");
                System.out.println();
            }
                else if (user < numero) {
                System.out.print("El  numero a adivinar es mayor");
                System.out.println();
            }
                else if  (user == numero){
                System.out.print("Gano");
                System.out.println();
                break;
            }
                else {
                System.out.print("Perdio, el numero era: " + numero);
                System.out.println();
            }
            i++ ;
            }

        }
        }
