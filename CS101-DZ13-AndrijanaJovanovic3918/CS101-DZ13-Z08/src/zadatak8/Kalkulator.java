/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak8;

/**
 *
 * @author Andrijana Jovanovic
 */
public class Kalkulator {
    private double a;
    private double b;

    public Kalkulator() {
    }

    public Kalkulator(double a, double b) {
        this.a = a;
        this.b = b;
    }
        public Kalkulator(Kalkulator k) {
        this.a = k.a;
        this.b = k.b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a){
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Kalkulator{" + "a=" + a + ", b=" + b + '}';
    }
    public double sabiranje(){
        return a + b;
      
    }
    public double oduzimanje(){
        return a - b;
      
    }
    public double mnozenje(){
        return a * b;
        
    }
    public double deljenje() throws ArithmeticException{
        if(b != 0){
            return a / b;
        }else{
            throw new ArithmeticException("Deljenje nulom nije moguce!!!");
        }
  }
}