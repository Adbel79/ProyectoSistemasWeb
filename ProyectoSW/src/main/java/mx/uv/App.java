package mx.uv;

import static spark.Spark.*;
import java.util.UUID;
import com.google.gson.*;

import javafx.stage.Window;
import mx.uv.db.UsuarioDAO;
import mx.uv.db.Usuario;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Gson gson = new Gson();
    public static void main( String[] args )
    {
        options("/*", (request, response) -> {

            String accessControlRequestHeaders = request.headers("Access-Control-Request-Headers");
            if (accessControlRequestHeaders != null) {
                response.header("Access-Control-Allow-Headers", accessControlRequestHeaders);
            }

            String accessControlRequestMethod = request.headers("Access-Control-Request-Method");
            if (accessControlRequestMethod != null) {
                response.header("Access-Control-Allow-Methods", accessControlRequestMethod);
            }

            return "OK";
        });

        before((request, response) -> response.header("Access-Control-Allow-Origin", "*"));
        post("/validarUsuario", (req, res) -> {
            // Insertamos un nuevo usuario
            String json = req.body();
            Usuario usuario = gson.fromJson(json, Usuario.class);
            
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            int resultado = usuarioDAO.validarUsuario(usuario);
            System.out.println(resultado);
            return resultado;
            
    
        });
    }
}
