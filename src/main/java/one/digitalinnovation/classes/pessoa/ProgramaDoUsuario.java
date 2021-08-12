package one.digitalinnovation.classes.pessoa;

import one.digitalinnovation.classes.usuario.SuperUsuario;

public class ProgramaDoUsuario {

    public static void main(String[] args){

            final var batman = new SuperUsuario("batman", "11234");

            batman.getLogin();

            //batman.getSenha();  // ERRO devido a senha esta como protected na classe SuperUsuario
            // String nomeDoCliente = batman.nome;//erro pois é publico somente para quem esta no mesmo pacote
    }
}
