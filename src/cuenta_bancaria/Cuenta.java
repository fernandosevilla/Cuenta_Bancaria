/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cuenta_bancaria;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author Fer
*/

public interface Cuenta {
    static final double TIPO_RETENCION = 0.19;

    static double calcularInteres(double saldo, double tipo, LocalDate fechaDesde, LocalDate fechaHasta) {
        long diferenciaDias = ChronoUnit.DAYS.between(fechaDesde, fechaHasta);
        double beneficio = (saldo * tipo * diferenciaDias) / (100 * 365);
        
        if (beneficio > 0) {
            beneficio *= 1 - TIPO_RETENCION;
        }
        
        return beneficio;
    }
}