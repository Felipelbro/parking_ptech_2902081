package org.ptech081.parking;
import org.ptech081.parking.entities.*;

import org.ptech081.parking.entities.Carro;

public class Main {
    public static void main(String[] args) {
        
        //Crear carros con los constructores
        Carro carrito1 = new Carro("BPC 448", 
        TipoVehiculo.CAMION);
        Carro carrito2 = new Carro();
        carrito2.placa = "SAW 090";
        carrito2.tipoVehiculo = TipoVehiculo.MOTO;

        //Crear clientes
        Cliente cliente1 = new Cliente("Daniel", "Cespedes", 120120120L);

//invocar el metodo addCar 
        cliente1.addCar(carrito1);
        cliente1.addCar("SAW 090", TipoVehiculo.MOTO);

//recorrer los carros del cliente 

for( Carro c:  cliente1.misCarros ){
    System.out.println(c.placa + " " +"---"+ "" + c.tipoVehiculo);
    
}
    
    }
}