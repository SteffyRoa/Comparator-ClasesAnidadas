package com.principal;

import com.clasesanidadas.Empleado;
import com.comparator.ComparatorEdad;
import com.comparator.ComparatorNombre;
import com.comparator.ComparatorSueldo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
          List<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new Empleado("Elias",35,25));
        listaEmpleados.add(new Empleado("Tercio",55,69));
        listaEmpleados.add(new Empleado("Xalostoc",65,6925));
        listaEmpleados.add(new Empleado("Rolas",45,15));
        listaEmpleados.add(new Empleado("Andromeda",34,111));
        listaEmpleados.add(new Empleado("Sr.Carbons",33,2.22));
        listaEmpleados.add(new Empleado("Eusebio",32,150.25));
        
         System.out.println("\n Lista Empleados con Comparator - NOMBRE:\n");
         //vamos a decirle que la camos a ordenar
        //aplicar el orden y es por eso que implemntamos la interface Coparable en la clase Empleado
        //*************NOMBRE********************
        Collections.sort(listaEmpleados,new ComparatorNombre());
        for(Empleado e: listaEmpleados)System.out.println(e);
        //vamos a decirle que la camos a ordenar
        //aplicar el orden y es por eso que implemntamos la interface
        // ********EDAD********************
        
        
        
    }
    
}
