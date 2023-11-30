package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Formulario de Productos</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h1>Datos del Producto</h1>\n");
      out.write("    <form action=\"SvProductos\" method=\"POST\">\n");
      out.write("        <p><label>Nombre: </label> <input type=\"text\" name=\"nombre\" required></p>\n");
      out.write("        <p><label>Cantidad: </label> <input type=\"text\" name=\"cantidad\" required></p>\n");
      out.write("        <p><label>Categoría: </label> <input type=\"text\" name=\"categoria\" required></p>\n");
      out.write("        <p><label>Precio: </label> <input type=\"text\" name=\"precio\" required></p>\n");
      out.write("        <button type=\"submit\">Enviar</button>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    <h1>Ver lista de Productos Disponibles</h1>\n");
      out.write("    <p>Para ver los productos disponibles, haga Click en el Siguiente botón</p>\n");
      out.write("    <form action=\"MostrarProductos.jsp\" method=\"GET\">\n");
      out.write("        <button type=\"submit\">Mostrar Resultados</button>\n");
      out.write("    </form>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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
