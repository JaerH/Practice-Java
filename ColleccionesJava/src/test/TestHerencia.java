package test;

import herencia.Cliente;
import herencia.Empleado;

import java.text.ParseException;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) throws ParseException {
        Empleado empleado = new Empleado("Erick", 10000);
        Cliente cliente = new Cliente("Shayra" ,30, 'F', "Av.Moche", true, 16, 5, 2021 );
        System.out.println("empleado = " + empleado);
        System.out.println("cliente = " + cliente);

    }
}
