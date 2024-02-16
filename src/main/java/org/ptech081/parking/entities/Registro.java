package org.ptech081.parking.entities;
import java.time.LocalDate;
import java.time.LocalTime;

public class Registro {
    
///Atributos intrinsecos
    public LocalDate fechaInicio;
    public LocalTime horaInicio;
    public LocalDate fechaFinal;
    public LocalTime horaFinal;
    public Long valor;

///Atributos de relacion
    public Cupo cupo;
    public Carro carro;
    public Cliente cliente;
    public Empleado empleado;
  
///Constructor por defecto

    public Registro() {
    }

    public Registro(LocalDate fechaInicio, LocalTime horaInicio, LocalDate fechaFinal, LocalTime horaFinal, Long valor,
            Cupo cupo, Carro carro, Cliente cliente, Empleado empleado) {
        this.fechaInicio = fechaInicio;
        this.horaInicio = horaInicio;
        this.fechaFinal = fechaFinal;
        this.horaFinal = horaFinal;
        this.valor = valor;
        this.cupo = cupo;
        this.carro = carro;
        this.cliente = cliente;
        this.empleado = empleado;
    }

}
