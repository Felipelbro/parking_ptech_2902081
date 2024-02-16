package org.ptech081.parking;
import org.ptech081.parking.entities.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

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
    Cupo cupo1 = new Cupo('A');
    Cupo cupo2 = new Cupo('B');
    
///Crear 2 registros E/S
    LocalDate fechaInicio = LocalDate.now();
    LocalTime horaInicio = LocalTime.now();
    LocalDate fechaFinal = LocalDate.of(2024, Month.MARCH, 24);
    LocalTime horaFinal = LocalTime.of(11 , 30 , 00);

        List<Registro> misRegistros = new ArrayList<Registro>();
//crear registro
        Registro registro1 = new Registro( fechaInicio , horaInicio , fechaFinal, horaFinal , 5000L , cupo1 , cliente1.misCarros.get(0) ,cliente1 );



        LocalDate fechaInicio1 = LocalDate.now();
        LocalTime horaInicio1 = LocalTime.now();
        LocalDate fechaFinal1 = LocalDate.of(2024, Month.FEBRUARY, 28);
        LocalTime horaFinal1 = LocalTime.of(15 , 30 , 00);
    
        Registro registro2 = new Registro( fechaInicio1 , horaInicio1 , fechaFinal1, horaFinal1 , 3000L , cupo2 , cliente1.misCarros.get(1) ,cliente1 );
    
    
    //añadir el registro a la lista 
        misRegistros.add(registro1);
        System.out.println("Registro de E/S parking");
        for(Registro r : misRegistros){
           System.out.println("Cliente: " + r.cliente.nombre + " " + r.cliente.apellidos + "|" + r.carro.placa + " " + r.carro.tipoVehiculo + "|" + r.valor + "|" + r.fechaInicio + " " + r.horaInicio + "|" ); 
        }



}

    }
