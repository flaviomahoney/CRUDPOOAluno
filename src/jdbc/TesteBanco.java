package jdbc;
import java.sql.Connection;
import java.sql.Statement;

public class TesteBanco {

	public static void main(String[] args) {
		
		try {
			
			Connection banco = ConnectionFactory.getConnection();
			System.out.println("Conexão OK!!!!");
			createNewTable(banco);
			//readTableTest(banco);
		}
		catch(Exception e)
		{
			System.out.println("Erro na Conexão<<>>");
			System.out.println(e);
		}

	}

	public static void createNewTable(Connection banco) {
		
		String sql = "CREATE TABLE IF NOT EXISTS aluno (\n"
				+ "  matricula varchar(45) NOT NULL, \n"
				+ "  nome varchar(45) NOT NULL, \n"
				+ "  cidade varchar(50) NOT NULL \n"
				+ ");";
		
		try {
			Statement stmt = banco.createStatement();
			
			// create new table
			stmt.execute(sql);
			
			System.out.println("Tabela Criada");
		}
		catch(Exception e) {
			System.out.println("Erro ao criar tabela");
			System.out.println(e);
		}
		
	}

}










