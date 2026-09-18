package org.example;

class Main {
    public static Integer encontrarMaior(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            return null;
        }
        int maior = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        return maior;
    }
    public static void main(String[] args) {
        int[] numeros = {12, 45, 7, 89, 23, 56};
        Integer resultado = encontrarMaior(numeros);
        System.out.println("O maior número é: " + resultado);
        int[] numeros1 = {34, 85, 12, 9, 24, 24, 63, 123, 53, 63, 123, 7654, 13, 75, 123, 75};
        Integer resultado1 = encontrarMaior(numeros1);
        System.out.println("O maior número é: " + resultado1);
    }
}
