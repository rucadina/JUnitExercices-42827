package org.example;

public class Digitos {

    public double CalculoDigito(int a){
        int dig = 0;
        int soma = 0;
        int count = 0;
        while(a > 0) {
            dig = a % 10;
            a /= 10;
            soma+= dig;
            count++;
        }

        return soma/count;
    }
}
