package mx.uv.db;

// DTO
public class Usuario {
    private String noUsuario;
    private String usuario;
    private String pass;
    private boolean maestro;


    public Usuario(String noUsuario, String usuario, String pass, boolean maestro) {
        this.noUsuario = noUsuario;
        this.usuario = usuario;
        this.pass = pass;
        this.maestro = maestro;
    }


    public String getNoUsuario() {
        return this.noUsuario;
    }

    public void setNoUsuario(String noUsuario) {
        this.noUsuario = noUsuario;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return this.pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean isMaestro() {
        return this.maestro;
    }

    public boolean getMaestro() {
        return this.maestro;
    }

    public void setMaestro(boolean maestro) {
        this.maestro = maestro;
    }


    @Override
    public String toString() {
        return "{" +
            " noUsuario='" + getNoUsuario() + "'" +
            ", usuario='" + getUsuario() + "'" +
            ", pass='" + getPass() + "'" +
            ", maestro='" + isMaestro() + "'" +
            "}";
    }
    

    

    
}
