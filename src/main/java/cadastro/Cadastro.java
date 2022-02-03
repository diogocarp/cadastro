package cadastro;

import java.io.IOException;
import java.time.LocalTime;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import model.Pessoa;


@WebServlet("/cadastrar")
public class Cadastro extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String nome = req.getParameter("nome");
		String email = req.getParameter("email");
		String sobrenome = req.getParameter("sobrenome");
		String numero = req.getParameter("numero");
		String genero = req.getParameter("genero");
		LocalTime horaAgora = LocalTime.now();
		
		
		System.out.println(nome);
		System.out.println(sobrenome);
		System.out.println(email);
		System.out.println(numero);
		System.out.println(genero);
		System.out.println(horaAgora);
		
		
		Pessoa person = new Pessoa();
		
		person.setNome(nome);
		person.setEmail(email);
		person.setSobrenome(sobrenome);
		person.setGenero(genero);
		person.setNumero(numero);
		
		
		
		
		switch (genero) {
		case "feminino": 
			
			genero = "Sra.";
			 
			
			
			break;
			
		case "masculino":
			
			genero = "Sr.";
			
		default:
			break;
			
		}
		
		
		String retorno;
		
		if(horaAgora.getHour() < 12) {
		
			
			retorno = "Bom dia!";
			
		
		
		}else if(horaAgora.getHour() < 18){
			
			
			retorno = "Boa Tarde!";
			
		}else {
			
			retorno = "Boa noite!";			
			
		}
	
		req.setAttribute("genero", genero);
		
		req.setAttribute("retorno", retorno);
		
		req.setAttribute("pessoa", person);
		
		req.getRequestDispatcher("finalizado.jsp").forward(req, resp);
		
	}
	
	
	
	
}
