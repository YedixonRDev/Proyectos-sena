package servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Movimiento;

@WebServlet(name = "ProcesarMovimiento", urlPatterns = {"/ProcesarMovimiento"})
public class ProcesarMovimiento extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Procesar datos si es necesario
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<Movimiento> listaMovimientos = new ArrayList<>();
        ListaMovimiento.add(new Movimiento("Gastos", "1000", "Harina"));
        ListaMovimiento.add(new Movimiento("Tranferencias", "50000", "Pan y Pollo"));
        ListaMovimiento.add(new Movimiento("Prestamo", "10000", "Prestamo jose"));

        HttpSession miSesion = request.getSession();
        miSesion.setAttribute("listaMovimientos", ListaMovimiento.getListaMovimientos());

        response.sendRedirect("mostrarMovimientos.jsp");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

        String idMovimiento = request.getParameter("idMovimiento");
        String tipoMovimiento = request.getParameter("tipoMovimiento");
        String concepto = request.getParameter("concepto");
        String monto = request.getParameter("monto");

        System.out.println("ID Movimiento: " + idMovimiento);
        System.out.println("Tipo de Movimiento: " + tipoMovimiento);
        System.out.println("Concepto: " + concepto);
        System.out.println("Monto: " + monto);

        // Puedes realizar operaciones adicionales, como guardar en una base de datos
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
