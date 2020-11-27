package calculadora;

public class Calculadora {
    public double sumar(double a, double b){
        return a+b;
    }

    public double restar(double a, double b){
        return a-b;
    }

    public double multiplicar(double a, double b){
        return a*b;
    }

    public double dividir(double dividendo, double divisor){
        return dividendo/divisor;
    }

    public double potenciar(double base, double exponente){
        return Math.pow(base,exponente);
    }

}
