package aplicacion;
import mates.Iterativos;

public class Main {
    public static void main(String[] args) {
        System.out.println("Suma de 5: " + Iterativos.suma(5));
        System.out.println("Factorial de 5: " + Iterativos.factorial(5));
        System.out.println("Potencia de 2^3: " + Iterativos.potencia(2, 3));
        int[] lista = {1, 2, 3, 4, 5};
        System.out.println("Suma de la lista: " + Iterativos.sumlista(lista));
        System.out.println("Media de la lista: " + Iterativos.media(lista));
        System.out.println("Desviación estándar de la lista: " + Iterativos.desviacion(lista));
        System.out.println("Suma de pares hasta 10: " + Iterativos.sumpares(10));
        System.out.println("Suma de pares en la lista: " + Iterativos.sumpareslista(lista));
    }
}
