
public class Usuario {
    
    private String nombre;
    private String correo;
    private String usuario;
    private String password;

    public Usuario(String nombre, String correo, String usuario, String password) {
        this.nombre = nombre;
        this.correo = correo;
        this.usuario = usuario;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }


    



}
