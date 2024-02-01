/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cuenta_bancaria;

/**
 *
 * @author Fer
 */
public interface Cuenta {
    static final double TIPO_RETENCION = 0.19;
    double calcularInteres(double saldo, double tipo, fecha fechaHasta);
}
