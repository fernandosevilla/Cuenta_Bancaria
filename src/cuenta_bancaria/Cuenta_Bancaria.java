/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuenta_bancaria;
import java.time.LocalDate;

/**
 * @author Fer
 */

public class Cuenta_Bancaria implements Cuenta {   
    double saldo;
    double tipo;
    LocalDate fechaDesde;
    LocalDate fechaHasta;
    double beneficio;
    double ganancias;
    
    public static void main(String[] args) {
        Cuenta_Bancaria cuenta1 = new Cuenta_Bancaria();
        cuenta1.saldo = 3000;
        
        cuenta1.tipo = 0.75;
        System.out.print("Escribe la fecha de inicio: ");
        cuenta1.fechaDesde = Leer_Fecha.leerFechaPorTeclado();
        System.out.print("Escribe la fecha fin: ");
        cuenta1.fechaHasta = Leer_Fecha.leerFechaPorTeclado();
        cuenta1.beneficio = Cuenta.calcularInteres(cuenta1.saldo, cuenta1.tipo, cuenta1.fechaDesde, cuenta1.fechaHasta);
        cuenta1.ganancias += cuenta1.beneficio;
        cuenta1.saldo += cuenta1.ganancias;
        System.out.println("El saldo tras las ganancias son: " + cuenta1.saldo);
    }
}