package clases;

public class Datos {
    public boolean validaUsuario(String usuario, String clave){
        if (usuario.equalsIgnoreCase("christian") && clave.equals("123"))
            return true;
        else
            return false;

    }
}