package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import logica.productos;
import java.util.List;

public final class MostrarProductos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Mostrar Productos</title>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("        <h1>Lista de productos Disponibles </h1>\n");
      out.write("\n");

   List<productos> listaProductos = (List<productos>) request.getSession().getAttribute("listaProductos");
   if (listaProductos != null && !listaProductos.isEmpty()) {
      int cont = 1;
      for(productos producto : listaProductos) {

      out.write("\n");
      out.write("      <p><b>Producto ");
      out.print( cont );
      out.write("</b></p>\n");
      out.write("      <p>Nombre: ");
      out.print( producto.getNombre() );
      out.write("</p>\n");
      out.write("      <p>Cantidad: ");
      out.print( producto.getCantidad() );
      out.write("</p>\n");
      out.write("      <p>Categoría: ");
      out.print( producto.getCategoria() );
      out.write("</p>\n");
      out.write("      <p>Precio: ");
      out.print( producto.getPrecio() );
      out.write("</p>\n");
      out.write("      <p>--------------------------------------</p>\n");

         cont++;
      }
   } else {

      out.write("\n");
      out.write("      <p>No hay productos disponibles.</p>\n");

   }

      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
