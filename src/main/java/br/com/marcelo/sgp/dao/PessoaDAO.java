package br.com.marcelo.sgp.dao;

import javax.persistence.EntityManager;

import br.com.marcelo.sgp.util.JPAUtil;
import br.com.marcelo.sgp.entidades.Pessoa;

public class PessoaDAO {
	
	public void incluirPessoa(String nome, String email) {
		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin();

		Pessoa pessoa = new Pessoa();
		pessoa.setNome(nome);
		pessoa.setEmail(email);
		
		em.persist(pessoa);
		
		em.getTransaction().commit();
		em.close();
	}
	
}
