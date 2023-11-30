package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.productos;

@WebServlet(name = "SvProductos", urlPatterns = {"/SvProductos"})
public class SvProductos extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<productos> listaProductos = new ArrayList<>();
        listaProductos.add(new productos("Pollo", "10", "Asado", "40000"));
        listaProductos.add(new productos("Pollo", "5", "Broaster", "30000"));
        listaProductos.add(new productos("Pan", "10", "Agridulce", "800"));

        HttpSession miSesion = request.getSession();
        miSesion.setAttribute("listaProductos", listaProductos);

        response.sendRedirect("mostrarProductos.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        String nombre = request.getParameter("nombre");
        String cantidad = request.getParameter("cantidad");
        String categoria = request.getParameter("categoria");
        String precio = request.getParameter("precio");

        System.out.println("El nombre del producto es: " + nombre);
        System.out.println("La cantidad es: " + cantidad);
        System.out.println("La categoría es: " + categoria);
        System.out.println("El precio es: " + precio);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}


