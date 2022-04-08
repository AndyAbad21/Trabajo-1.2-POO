/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio2;


/**
 *
 * @author Andy Abad
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
        
        System.out.println("Nombre: "+empleado1.nombre);
        System.out.println("Horas trabajadas: "+empleado1.horasDeTrabajo);
        System.out.println("Costo hora: "+empleado1.costoHora);
        System.out.println("Anio Ingreso: "+empleado1.anioIngreso+"\n");
        System.out.println("Anio Actual: " +anioActual);
        System.out.println("Calcular Ingresos: "+empleado1.calcularIngresos(anioActual)+" $");
        System.out.println("Maximo de hora trabajadas: "+ maximoDeHoraTrabajadas );
        System.out.println("Calcular Bono: "+empleado1.calcularBonoHorasExtra(maximoDeHoraTrabajadas)+" $");
        limite1=500;
        limite2=1000;
        limite3=2000;
        System.out.println("Limite 1: "+limite1+"\n"+"Limite 2: "+limite2+"\n"+"Limite 3: "+limite3);
        System.out.println("Calcular impuesto: "+empleado1.calcularImpuesto(limite1, limite2, limite3));
        System.out.println("Calcular a pagar: "+empleado1.calcularPagar(empleado1.calcularIngresos(anioActual), empleado1.calcularBonoHorasExtra(maximoDeHoraTrabajadas), empleado1.calcularImpuesto(limite1, limite2, limite3))+" $"+"\n");
        
        
        Empleado empleado2=new Empleado();
        empleado2.nombre="Pedro";
        empleado2.anioIngreso=2010;
        empleado2.horasDeTrabajo=100;
        empleado2.costoHora=9.0;
        
        System.out.println("Nombre: "+empleado1.nombre);
        System.out.println("Horas trabajadas: "+empleado2.horasDeTrabajo);
        System.out.println("Costo hora: "+empleado2.costoHora);
        System.out.println("Anio Ingreso: "+empleado2.anioIngreso+"\n");
        System.out.println("Anio Actual: " +anioActual);
        System.out.println("Calcular Ingresos: "+empleado2.calcularIngresos(anioActual)+" $");
        System.out.println("Maximo de hora trabajadas: "+ maximoDeHoraTrabajadas );
        System.out.println("Calcular Bono: "+empleado2.calcularBonoHorasExtra(maximoDeHoraTrabajadas)+" $");
        System.out.println("Limite 1: "+limite1+"\n"+"Limite 2: "+limite2+"\n"+"Limite 3: "+limite3);
        System.out.println("Calcular impuesto: "+empleado2.calcularImpuesto(limite1, limite2, limite3));
        System.out.println("Calcular a pagar: "+empleado2.calcularPagar(empleado1.calcularIngresos(anioActual), empleado1.calcularBonoHorasExtra(maximoDeHoraTrabajadas), empleado1.calcularImpuesto(limite1, limite2, limite3))+" $"+"\n");
        
        Empleado empleado3=new Empleado();
        empleado3.nombre="Jose";
        empleado3.anioIngreso=2000;
        empleado3.horasDeTrabajo=50;
        empleado3.costoHora=15.0;
        
        System.out.println("Nombre: "+empleado1.nombre);
        System.out.println("Horas trabajadas: "+empleado3.horasDeTrabajo);
        System.out.println("Costo hora: "+empleado3.costoHora);
        System.out.println("Anio Ingreso: "+empleado3.anioIngreso+"\n");
        System.out.println("Anio Actual: " +anioActual);
        System.out.println("Calcular Ingresos: "+empleado3.calcularIngresos(anioActual)+" $");
        System.out.println("Maximo de hora trabajadas: "+ maximoDeHoraTrabajadas );
        System.out.println("Calcular Bono: "+empleado3.calcularBonoHorasExtra(maximoDeHoraTrabajadas)+" $");
        System.out.println("Limite 1: "+limite1+"\n"+"Limite 2: "+limite2+"\n"+"Limite 3: "+limite3);
        System.out.println("Calcular impuesto: "+empleado3.calcularImpuesto(limite1, limite2, limite3));
        System.out.println("Calcular a pagar: "+empleado3.calcularPagar(empleado1.calcularIngresos(anioActual), empleado1.calcularBonoHorasExtra(maximoDeHoraTrabajadas), empleado1.calcularImpuesto(limite1, limite2, limite3))+" $"+"\n");
        
    }
}
