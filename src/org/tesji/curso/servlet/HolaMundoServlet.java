package org.tesji.curso.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/holaMundo")
public class HolaMundoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public HolaMundoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * Peticiones por medio de una URL
     */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      System.out.println("Bienvenido desde mi Servlet");
      int valor1 = 10;
      int valor2 = 20;
      int resultado = valor1 + valor2;
      System.out.println("Resultado: " + resultado);
      
      response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title> </title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Ejemplo HTML desde Java</h1>");
		out.println("Resultado operacion: " + resultado );
		out.println("Son las: " + LocalDateTime.now());
		out.println("</body>");
		out.println("</html>");
	
	}


	/**
	 * Peticiones por medio de un formulario
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
