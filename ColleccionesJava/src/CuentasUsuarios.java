import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CuentasUsuarios {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Rodrigo" , "10203040", 1300);
        Cliente cliente2 = new Cliente("Shayra", "10203050" , 1500);
        Cliente cliente3 = new Cliente("Erick" , "1020304060" , 2000);
        Cliente cliente4 = new Cliente("Unknown" , "1000000000" , 1000);
        Cliente cliente5 = new Cliente("Rodrigo" , "10203040", 1300);
        //Cliente cliente5 = cliente1;

        Set<Cliente> clienteBanco = new HashSet<Cliente>();
        clienteBanco.add(cliente1);
        clienteBanco.add(cliente2);
        clienteBanco.add(cliente3);
        clienteBanco.add(cliente4);
        clienteBanco.add(cliente5);

        /*List<Cliente> listCliente = new ArrayList<>();
        listCliente.add(cliente1);
        listCliente.add(cliente2);
        listCliente.add(cliente3);
        listCliente.add(cliente4);
        listCliente.add(cliente5);*/


        for (Cliente cliente : clienteBanco) {
            System.out.println(cliente.getNombre() + " " + cliente.getNumeroCuenta()
            + " " + cliente.getSaldo());
        }

        /*for (Cliente listaCliente : listCliente) {
            System.out.println(listaCliente.getNombre() + " " + listaCliente.getNumeroCuenta()
                    + " " + listaCliente.getSaldo());
        }*/



    }
}
