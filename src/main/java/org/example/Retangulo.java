package org.example;

public class Retangulo {

    public int area(int base, int altura){
        return (base*altura);
    }

    public int perimetro(int base, int altura){
        return altura*2+base*2;
    }

    public boolean isTriangle(int a, int b, int c){
        return a+b>c && b+c>a && c+a>b;
    }

}
