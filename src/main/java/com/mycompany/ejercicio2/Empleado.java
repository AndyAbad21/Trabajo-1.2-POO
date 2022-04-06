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
       impuestoF=bonoF;
        
        return impuestosF;
    }
    
    public Double calcularPagar()
    {
        Double valorF=0.0;
        /*
        valorF=ingresosF+bonoF-impuestoF;
        */
        return valorF;
    }
}
