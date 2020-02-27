package br.com.marcelo.sgp.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.marcelo.sgp.dao.PessoaDAO;
import br.com.marcelo.sgp.entidades.Pessoa;

@WebServlet(urlPatterns = "/alterarPessoa")
public class AlterarPessoaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PessoaDAO dao = new PessoaDAO();
		Integer id = Integer.parseInt(req.getParameter("id"));
		Pessoa pessoa = dao.selecionarPessoa(id);
		
		String nome = req.getParameter("novoNome");
		String email = req.getParameter("novoEmail");
		
		pessoa.setNome(nome);
		pessoa.setEmail(email);
		
		dao.alterarPessoa(pessoa);
		resp.sendRedirect("listaPessoas");
	}
	
	

}
