package one.digitalinnovation.classes.cliente;

public class ProgramaCliente {
    public static void main(String[] args){

        final var cliente = new Cliente(33);

        cliente.getIdade();
        cliente.getPeso();

        //System.out.println(cliente.relatorio());
    }
}
