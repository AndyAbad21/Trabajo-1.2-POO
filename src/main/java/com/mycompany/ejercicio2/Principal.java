/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int anioActual=2022;
        int maximoDeHoraTrabajadas=150;
        int limite1, limite2, limite3;
        
        Empleado empleado1=new Empleado();
        empleado1.nombre="Juan";
        empleado1.anioIngreso=2003;
        empleado1.horasDeTrabajo=160;
        empleado1.costoHora=11.5;
        
        System.out.println("Anio Actual: " +anioActual);
        System.out.println("Calcular Ingresos: "+empleado1.calcularIngresos(anioActual)+" $");
        System.out.println("Maximo de hora trabajadas: "+ maximoDeHoraTrabajadas );
        System.out.println("Calcular Bono: "+empleado1.calcularBonoHorasExtra(maximoDeHoraTrabajadas)+" $");
        limite1=500;
        limite2=1000;
        limite3=2000;
        System.out.println("Limite 1: "+limite1+"\n"+"Limite 2: "+limite2+"/n"+"Limite 3: "+limite3);
        System.out.println("Calcular impuesto: "+empleado1.calcularImpuesto(limite1, limite2, limite3));
        System.out.println("Calcular a pagar: "+empleado1.calcularPagar()+" $");
        
        /*Empleado empleado1=new Empleado();
        empleado1.nombre="Juan";
        empleado1.anioIngreso=2010;
        empleado1.horasDeTrabajo=150;
        empleado1.costoHora=3.5;
        
       Empleado empleado2=new Empleado();
        empleado2.nombre="Pedro";
        empleado2.anioIngreso=2015;
        empleado2.horasDeTrabajo=500;
        empleado2.costoHora=2.0;
        
        Empleado empleado3=new Empleado();
        empleado3.nombre="Jose";
        empleado3.anioIngreso=2000;
        empleado3.horasDeTrabajo=50;
        empleado3.costoHora=2.0;*/
    }
}
