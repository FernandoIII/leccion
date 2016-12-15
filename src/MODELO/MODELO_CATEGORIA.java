/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

/**
 *
 * @author PERSONAL
 */
public class MODELO_CATEGORIA {

    String nombre;
    double edad;

    public MODELO_CATEGORIA(String nombre, double edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public MODELO_CATEGORIA() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }
//    metodo para sumar la edad mas una decada

    public double edad() {
        double salida;
        salida = this.edad + 10;

        return salida;
    }
//    metodo para categorizar

    public double categoria() {
        double categoria_a = 0;
        double categoria_b;
        double categoria_c;
        double categoria_d;
        if ((this.edad > 0) || (this.edad < 25)) {
            categoria_a = this.edad;
        } else {
            if ((this.edad > 26) || (this.edad < 50)) {
                categoria_a = this.edad;
            } else {
                if ((this.edad > 51) || (this.edad < 75)) {
                    categoria_a = this.edad;
                } else {
                    if ((this.edad > 51) || (this.edad < 75)) {
                        categoria_a = this.edad;

                    }

                }
            }

        }
        return categoria_a;
    }

    
    
}

//Preguntar el nombre del usuario y su edad, mostrar cuantos años tendría
//en una década más y clasificar según su edad en A [0-25], B[26-50],
//C[51-75], D[76-100]. La salida por pantalla debería ser algo como la
//siguiente: