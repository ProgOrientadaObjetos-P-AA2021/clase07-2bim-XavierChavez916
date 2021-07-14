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
public class TransporteTransvia extends Transporte{
    private String cooperativaTransvia;
    
    
    public void establecerCooperativaTransvia(String n){
        cooperativaTransvia = n;
    }
    
    
    @Override
    public void establecerTarifa(){
        tarifa = 0.40 + (0.40*0.5);
    }
    
    
    public String obtenerCooperativaTaxi(){
        return cooperativaTransvia;
    }
        
}
