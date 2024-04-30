package PAQUETE;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Calculadora {
    
    private double numero1;
    private double numero2;
    private String operador;
    
    //Constructores
    public Calculadora() {
    }

    public Calculadora(double numero1, double numero2, String operador) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operador = operador;
    }
    
    //Getters and setters

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }
    
    
    //To String

    @Override
    public String toString() {
        return "Calculadora{" + "numero1=" + numero1 + ", numero2=" + numero2 + ", operador=" + operador + '}';
    }

    
    
    public double getSuma(){
        double resultado;
        resultado=numero1+numero2;
        return resultado;
    }
    
    public double getResta(){
        double resultado;
        resultado=numero1-numero2;
        return resultado;
    }
    
    public double getMultiplicacion(){
        double resultado;
        resultado=numero1*numero2;
        return resultado;
    }
    
    public double getDivision(){
        double resultado;
        resultado=numero1/numero2;
        return resultado;
    }
    
    
    
}
