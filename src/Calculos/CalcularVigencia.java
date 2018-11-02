/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculos;

import java.util.Date;
//import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import static java.time.Duration.between;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author familia
 */
public class CalcularVigencia {
   
    public static int getAñosVigencia(Calendar vigencia){
        Date fechaActual = new Date();
        int duracion;
        Calendar calendario = Calendar.getInstance();
        duracion = vigencia.get(Calendar.YEAR) - calendario.get(Calendar.YEAR);
        return duracion;
    
    }
    //Los Date se escriben como Date(1995,25,10)
    public static Calendar CalcularVigencia(Date fechaNacimiento, String categoriaLicencia) {
        Boolean primeraVez = true;
        Date fechaActual = new Date();
        Calendar calendar = Calendar.getInstance();
        int edad = fechaActual.getYear() - (fechaNacimiento.getYear()-1900); // Restamos 1900 porque getYear es 1900 + el año que le pasas
        
        switch(categoriaLicencia){
            case "Primera vez":
                primeraVez = true;
                break;
            case "Renovación":
                primeraVez = false;
                break;
        }
        
        if(edad <21 && primeraVez){
            calendar.add(Calendar.YEAR, 1);
        }
        else{
            if(edad < 21){
                calendar.add(Calendar.YEAR, 3);
            }
            else{
                if(edad >= 21 && edad <46){
                    calendar.add(Calendar.YEAR, 5);
                }
                else{
                    if(edad >=46 && edad < 60){
                        calendar.add(Calendar.YEAR, 4);
                    }
                    else{
                        if(edad >=60 && edad < 70){
                            calendar.add(Calendar.YEAR, 3);
                        }
                        else{
                            if(edad >= 70){
                                calendar.add(Calendar.YEAR, 1);
                            }
                        }
                    }
                }
            }
        }
        calendar.set(Calendar.DAY_OF_MONTH,fechaNacimiento.getDate());
        calendar.set(Calendar.MONTH,fechaNacimiento.getMonth());
        return calendar;
        

    }

}