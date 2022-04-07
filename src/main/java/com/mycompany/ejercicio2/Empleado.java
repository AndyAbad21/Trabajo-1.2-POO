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
public class Empleado
{
    String nombre;
    int horasDeTrabajo;
    Double costoHora;
    int anioIngreso;
;
    public Empleado()
    {
       /*static Double ingresosF=0.0;
        /*Double bonoF;
        int diferenciaDeHoras;
        Double impuestosF;
        Double valorF;*/
    }
    
    public Double calcularIngresos(int anioActual)
    {
        Double ingresosF;
        int aniosTrabajados;
        
        aniosTrabajados=(anioActual-anioIngreso);
        ingresosF=(((2*aniosTrabajados)*(horasDeTrabajo*costoHora))/100)+(horasDeTrabajo*costoHora);
        
        return ingresosF;
    }
    
    public Double calcularBonoHorasExtra(int maximoHorasTrabajadas)
    {
        Double bonoF;
        int diferenciaDeHoras;
        if(horasDeTrabajo>maximoHorasTrabajadas)
        {
            diferenciaDeHoras=horasDeTrabajo-maximoHorasTrabajadas;
            bonoF=(diferenciaDeHoras*costoHora)*2;
            return bonoF;
        }else {
            bonoF=0.0;
            return bonoF;
        }
    }
    
    public Double calcularImpuesto(int limite1, int limite2, int limite3)
    {
       Double impuestoF=0.0;
       Double ingresosT=horasDeTrabajo*costoHora;
     
        if(ingresosT>=0 & ingresosT<=limite1)
            impuestoF=ingresosT;
        
        if(ingresosT>=limite1 & ingresosT<=limite2)
            impuestoF=(5*ingresosT)/100;
            
        if(ingresosT>=limite2 & ingresosT<=limite3)
            impuestoF=(12*ingresosT)/100;
        
        if(ingresosT>limite3)
            impuestoF=(25*ingresosT)/100;
        return impuestoF;
    }
    
    public Double calcularPagar(double ingresosF, Double bonoF, double impuestoF )
    {
        Double valorF;
        
        valorF=ingresosF+bonoF-impuestoF;
        
        return valorF;
    }
}
