package br.com.marcelo.sgp.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.marcelo.sgp.dao.PessoaDAO;

@WebServlet(urlPatterns = "/novaPessoa")
public class PessoaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		
		PessoaDAO dao = new PessoaDAO();
		dao.incluirPessoa(nome, email);
		resp.sendRedirect("listaPessoas");
	}

}
