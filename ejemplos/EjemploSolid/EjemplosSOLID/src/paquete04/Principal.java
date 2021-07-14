/*
 * O — Open/closed principle (Principio abierto/cerrado)
 */
package paquete04;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        ArrayList<Transporte> ts = new ArrayList();
        TransporteBus bus = new TransporteBus();
        bus.establecerCooperativaBus("24 Mayo");
        bus.establecerTarifa();
        
        TransporteTaxi taxi = new TransporteTaxi();
        taxi.establecerCooperativaTaxi("Yahuarcuna");
        taxi.establecerTarifa();
        
        TransporteTransvia t3 = new TransporteTransvia();
        
        TransporteAereo aereo = new TransporteAereo();
        
        TransporteMaritimo mar = new TransporteMaritimo();
        
        ts.add(t3);
        ts.add(aereo);
        ts.add(mar);
        
        TiposTransporte tipos = new TiposTransporte();
        tipos.establecerTransportes(ts);
        
        tipos.establecerPromedioTarifas();
        
        System.out.printf("Promedio de Tarifas: %.2f\n", 
                tipos.obtenerPromedioTarifas());
        
    }
}