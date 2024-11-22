package dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
		
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/ejemplo";
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		   // Información de la conexión
		
        final String usuario = "root";
        final String contraseña = "1234";
        Connection dbConnection = null;
        Statement statement = null;

        try {
            // Cargar el driver MySQL
            Class.forName(DRIVER);
            
            // Establecer la conexión
            dbConnection = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexión exitosa");
            String selectTableSQL = "SELECT id,nombre,email FROM usuarios";
            statement = dbConnection.createStatement();
            ResultSet rs = statement.executeQuery(selectTableSQL);
            while (rs.next()) {
            	String id = rs.getString("id");
            	String nombre = rs.getString("nombre");
            	String email = rs.getString("email");
            	System.out.println(id);
            	System.out.println(nombre);
            	System.out.println(email);
            }
            
        } catch (ClassNotFoundException e) {
            System.out.println("Error: No se pudo cargar el driver de MySQL");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Error: Problema al conectar a la base de datos");
            e.printStackTrace();
        }finally {
        	if (statement!=null) {
				statement.close();
			}
        	if (dbConnection!=null) {
				dbConnection.close();
			}
        }
	}

}
