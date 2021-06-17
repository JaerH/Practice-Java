package herencia;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Cliente extends Persona{
    private int idCliente;
    private Date fechaRegistro;
    private String fechaActual;
    private boolean vip;
    private static int contadorCliente;

    /*public Cliente(String nombre, char genero, int edad, String direccion, Date fechaRegistro, boolean vip ) throws ParseException {
        super(nombre, genero, edad, direccion);
        this.idCliente = ++contadorCliente;
        //this.fechaRegistro = new SimpleDateFormat("dd/MM/yyyy").parse(fechaRegistro);

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
        String fecha = dateFormat.format(fechaRegistro);
        this.fechaActual = fecha;
        this.vip = vip;
    }*/
    SimpleDateFormat sdf = new SimpleDateFormat("EEE dd/MM/yyyy");

    public Cliente(String nombre, int edad, char genero, String direccion, boolean vip, int dia, int mes, int anio){
        super(nombre, genero, edad, direccion);
        this.idCliente = ++contadorCliente;
        GregorianCalendar gc = new GregorianCalendar(anio, mes, dia);
        this.fechaRegistro = gc.getTime();
        this.vip = vip;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getFechaRegistro() {
        return sdf.format(fechaRegistro);
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", fechaRegistro=" + getFechaRegistro() +
                ", vip=" + vip +
                ", " + super.toString() +
                '}';
    }
}
