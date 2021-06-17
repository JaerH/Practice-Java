public class Bolsa1 implements Bolsa{

    public static void main(String[] args) {
        Bolsa1 bolsa1 = new Bolsa1();
        System.out.println(bolsa1.ejemploTexto(new Cliente()));
       
    }

    @Override
    public Bolsa insertar(Object elemento) {

        Bolsa bolsa = new Bolsa1();
        bolsa.insertar(10);
        return bolsa;
    }

    public void ejemplo(){
        System.out.println("Ejemplo");
    }

    public String ejemploTexto(Cliente cliente){
        final String  texto =  cliente.dameTexto();
        return texto;
    }
}
