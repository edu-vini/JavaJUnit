package javajunit;

public class Calculadora {
    public static int somar(int a, int b){
        return a + b;
    }
    public static int multiplicar(int a, int b){
        return a * b;
    }

    public static int subtrair(int a, int b){
        return a - b;
    }

    public static double dividir(int a, int b){
        if(b == 0){
            throw new ArithmeticException("Tentando dividir algum número por zero!");
        }
        return (double) a / b;
    }
}
