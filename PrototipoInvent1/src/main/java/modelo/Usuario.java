package modelo;

/**
 *La clase usuario genera los parametros de un usuario con sus getter y setter para los llamados desde otra clase.
 * @author jd_6
 */
public class Usuario {
    
    /**
     * @param id crea un entero con el parametro id de usuario
     * @param usuario crea un String con el valor de nombre de usuario
     * @param contrasenia genera la contraseña ingresada por el usuario para el registro
     */
    private int id;
    private String usuario;
    private String contrasenia;
    private String correo;

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    
    
}
