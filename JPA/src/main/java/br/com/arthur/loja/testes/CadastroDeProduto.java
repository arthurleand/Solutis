package br.com.arthur.loja.testes;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;

import br.com.arthur.loja.dao.CategoriaDao;
import br.com.arthur.loja.dao.ProdutoDao;
import br.com.arthur.loja.modelo.Categoria;
import br.com.arthur.loja.modelo.Produto;
import br.com.arthur.loja.util.JPAUtil;

public class CadastroDeProduto {

	public static void main(String[] args) {

		// cadastrarProduto();
		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDao produtodao = new ProdutoDao(em);
		Produto p = produtodao.buscarPorId(1l);
		// System.out.println(p.getNome());

		BigDecimal buscarPreco = produtodao.buscarPreçoPorNome("Redmi Note 7");
		System.out.println("Preço do Produto: " + buscarPreco);

	}

	private static void cadastrarProduto() {
		Categoria celulares = new Categoria("celulares");

		Produto celular = new Produto("Redmi Note 7", "64GB", new BigDecimal("1200"), celulares);

		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDao produtodao = new ProdutoDao(em);
		CategoriaDao categoriadao = new CategoriaDao(em);

		em.getTransaction().begin();

		categoriadao.casdastrar(celulares);
		produtodao.casdastrar(celular);

		em.getTransaction().commit();
		em.close();
	}

}
