package paquete03;

import paquete01.Calificacion;

public class EjemploCuatro {
   public static void main(String[] args) {
        // crear un arreglo de objetos de tipo Calificacion
     Calificacion [] calificaciones = new Calificacion[2];
        
        Calificacion c = new Calificacion(10, "Computación");
        Calificacion c2 = new Calificacion(9, "Electrónica");
        Calificacion c3 = new Calificacion(5.1, "Base de datos");
        
        calificaciones[0] = c;
        calificaciones[1] = c2;
        calificaciones[2] = c3;
   
        //Promedio calificaciones 
        double suma=0;
    
        for (int i = 0; i < calificaciones.length; i++) {
            Calificacion objetoCalificacion = calificaciones[i];
            suma = suma + objetoCalificacion.obtenerNota();
            
        }
        
        double promedio = suma / calificaciones.length;
        
        System.out.printf("%.4f\n", promedio);
        
        /*--------------------------------------------------------*/
        
        for (int i = 0; i < calificaciones.length; i++) {
            Calificacion objetoCalificacion = calificaciones[i];
            System.out.printf("%s\n", objetoCalificacion.obtenerNombreMateria());
        }
    }

 }
