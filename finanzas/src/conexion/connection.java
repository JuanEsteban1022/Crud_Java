package conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author juane
 */
public class connection {

    Connection cn;

    /**
     *
     * @return
     */
    public Connection conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost/finanzas", "root", "");
            System.out.println("Connected");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return cn;
    }
}
