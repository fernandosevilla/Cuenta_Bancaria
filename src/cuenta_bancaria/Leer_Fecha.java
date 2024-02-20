/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuenta_bancaria;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 * @author Fer
 */

public class Leer_Fecha {
    public static LocalDate leerFechaPorTeclado() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese una fecha en formato dd/mm/aaaa: ");
        String fechaIngresada = teclado.nextLine();

        // se crea el patrón con el formato de la fecha
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            // conversión de String a LocalDate con el formato previamente creado
            LocalDate fecha = LocalDate.parse(fechaIngresada, formatoFecha);

            // Si la conversión no ha funcionado la fecha contiene null
            if (esFechaValida(fecha)) {
                return fecha;
            } else {
                System.out.println("Fecha no válida.");
            }
        } catch (DateTimeParseException e) {
            System.out.println("Formato de fecha incorrecto. Se debe introducir en formato dd/mm/aaaa.");
        }
        return null;
    }
    
    // Método para validar si una fecha es válida
    public static boolean esFechaValida(LocalDate fecha) {
        // Puedes agregar reglas adicionales de validación aquí si es necesario
        return fecha != null;
    }
    
    /*
    public static void main(String[] args) {
        // Definir dos fechas de la clase LocalDate
        LocalDate fechaInicio=null, fechaFin=null;
        
        do {
            System.out.print("Introducir la fecha inicial del periodo :");
            fechaInicio = leerFechaPorTeclado();
        } while(fechaInicio == null);
        
        do {
            System.out.print("Introducir la fecha final del periodo :");
            fechaFin = leerFechaPorTeclado();
        } while(fechaFin==null);
        
        // Calcular los días transcurridos entre las dos fechas
        long diasTranscurridos = ChronoUnit.DAYS.between(fechaInicio, fechaFin);

        // Imprimir el resultado
        System.out.println("Días transcurridos entre " + fechaInicio + " y " + fechaFin + ": " + diasTranscurridos + " días.");
    }
    */
}