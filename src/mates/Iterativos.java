package mates;

public class Iterativos {
    public static int suma(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + suma(n - 1);
        }
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }

    public static int sumlista(int[] lista) {
        return sumlistaRecursivo(lista, lista.length - 1);
    }

    private static int sumlistaRecursivo(int[] lista, int index) {
        if (index == 0) {
            return lista[0];
        } else {
            return lista[index] + sumlistaRecursivo(lista, index - 1);
        }
    }

    public static double media(int[] lista) {
        return (double) sumlista(lista) / lista.length;
    }

    public static double desviacion(int[] lista) {
        double media = media(lista);
        return Math.sqrt(sumatoriaDesviacion(lista, media, lista.length - 1) / lista.length);
    }

    private static double sumatoriaDesviacion(int[] lista, double media, int index) {
        if (index < 0) {
            return 0;
        } else {
            return Math.pow(lista[index] - media, 2) + sumatoriaDesviacion(lista, media, index - 1);
        }
    }

    public static int sumpares(int n) {
        if (n <= 1) {
            return 0;
        } else if (n % 2 != 0) {
            return sumpares(n - 1);
        } else {
            return n + sumpares(n - 2);
        }
    }

    public static int sumpareslista(int[] lista) {
        return sumpareslistaRecursivo(lista, lista.length - 1);
    }

    private static int sumpareslistaRecursivo(int[] lista, int index) {
        if (index < 0) {
            return 0;
        } else if (lista[index] % 2 == 0) {
            return lista[index] + sumpareslistaRecursivo(lista, index - 1);
        } else {
            return sumpareslistaRecursivo(lista, index - 1);
        }
    }
}
