package br.com.marcelo.sgp.servlets;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.marcelo.sgp.dao.PessoaDAO;
import br.com.marcelo.sgp.entidades.Pessoa;


@WebServlet(urlPatterns = "/listaPessoas")
public class ListaPessoasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PessoaDAO dao = new PessoaDAO();
		
		List<Pessoa> listaPessoas = dao.listarPessoas();
		for (Pessoa pessoa : listaPessoas) {
			System.out.println(pessoa.getNome());
		}
		RequestDispatcher rd = req.getRequestDispatcher("/listarPessoas.jsp");
		req.setAttribute("pessoas", listaPessoas);
		rd.forward(req, resp);
	
	}
}