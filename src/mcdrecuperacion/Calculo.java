/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcdrecuperacion;

/**
 *
 * @author Lenovo
 */
public class Calculo {
      private int numero1;
    private int numero2;
    private String mensajeResultado;

    public Calculo() {
    }

    //setters
    public void setNumero1(int numero) {
        this.numero1 = numero;
        //si el nÃºmero es negativo cambiamos a cero y
        //establecemos la propiedad "mensajeResultado" a "Error"
        if (numero < 0) {
            mensajeResultado = "ERROR negativo";
        }
    }

    public void setNumero2(int numero) {
        this.numero2 = numero;
        //si el nÃºmero es negativo cambiamos a cero y
        //establecemos la propiedad "mensajeResultado" a "Error"
        if (numero < 0) {
            mensajeResultado = "ERROR negativo";
        }
    }

    //resultado MCD
    public String getMensajeResultado() {
        return mensajeResultado;
    }

    //getters
    
    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    //metodo para calcular el MCD
    public int obtenerMCD(int num1, int num2) {
        int resto;
        int numDiv1 = num1;
        int numDiv2 = num2;

        if (num1 < 0 || num2 < 0) {
            return 0;
        }

        try {
            do {
                resto = numDiv1 % numDiv2;
                numDiv1 = numDiv2;
                if (resto != 0) {
                    numDiv2 = resto;
                }
            } while (resto != 0);

            mensajeResultado = "Correcto";
            return numDiv2;
        } catch (Exception e) {
       
}     mensajeResultado = "ERROR exception";
            return 0;
        }
    
}
