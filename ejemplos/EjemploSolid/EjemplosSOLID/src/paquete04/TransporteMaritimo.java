/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author xavierchavez
 */
public class TransporteMaritimo extends Transporte{
    private String cooperativaMaritimo;

    public void establecerCooperativaBus(String n) {
        cooperativaMaritimo = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 2.00 + 0.20;
    }

    public String obtenerCooperativaBus() {
        return cooperativaMaritimo;
    }
}
