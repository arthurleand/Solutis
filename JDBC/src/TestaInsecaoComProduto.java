import java.sql.Connection;

import modelo.Produto;

public class TestaInsecaoComProduto {

	public static void main(String[] args) {
		
		Produto comoda = new Produto("Cômoda","Vertical");
		
		try(Connection connection = new ConnectionFactory().recuperarConexao()) {
			
			String sql = "INSERT INTO PRODUTO (nome, descricao) VALUES (?, ?)";
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
