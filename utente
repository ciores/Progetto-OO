package net.codejava;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class contacprogram {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		String jdbcURL="jdbc:postgresql://localhost:5432/utente";
        String username="postgres";
        String password="onedirection123";
        try {
		Connection connection=DriverManager.getConnection(jdbcURL, username, password);
		System.out.println("Connected to PostgreSQL server");
		String sql="SELECT * FROM contacts";
		Statement statement=connection.createStatement();
		ResultSet result= statement.executeQuery(sql);
		while (result.next()) {
			int codice=result.getInt("codice");
			String nome=result.getString("nome");
			String cognome=result.getString("cognome");
			String punti=result.getString("punti");
			String email=result.getString("email");
			System.out.printf("%d-%s-%s-%s/n", codice, nome, cognome, punti, email);
			
		}
		connection.close();
        } catch (SQLException e) {
        	System.out.println("Error in connecting to Postgres server");
        	e.printStackTrace();
        }
		
	}

}
