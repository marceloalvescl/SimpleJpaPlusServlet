package br.com.marcelo.sgp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

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
	
	public List<Pessoa> listarPessoas(){
		
		EntityManager em = new JPAUtil().getEntityManager();
		
		em.getTransaction().begin();
		
		Query query = em.createQuery("select p from Pessoa p");
		List<Pessoa> lista = query.getResultList();
		
		em.getTransaction().commit();
		em.close();
		
		return lista;
	}

	public Pessoa selecionarPessoa(Integer id) {
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();

		Query query = em.createQuery("select p from Pessoa p where p.id = :pId");
		query.setParameter("pId", id);
		Pessoa pessoa = (Pessoa) query.getSingleResult();
		
		em.getTransaction().commit();
		em.close();
		
		return pessoa;
	}
	
	public void alterarPessoa(Pessoa pessoa) {
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		Query query = em.createQuery("update Pessoa p "
				+ "set p.email = :pEmail, "
				+ "p.nome = :pNome "
				+ "where p.id = :pId");
		query.setParameter("pEmail", pessoa.getEmail());
		query.setParameter("pNome", pessoa.getNome());
		query.setParameter("pId", pessoa.getId());
		
		query.executeUpdate();
		
		em.getTransaction().commit();
		em.close();
		
		System.out.println(pessoa.getNome());
	}
	
}
