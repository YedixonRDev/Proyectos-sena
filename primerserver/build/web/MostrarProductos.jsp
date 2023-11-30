<%@ page import="logica.productos" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Mostrar Productos</title>
</head>
<body>
    <h1>Lista de productos Disponibles</h1>
    <% 
        List<productos> listaProductos = (List<productos>) request.getSession().getAttribute("listaProductos");
        if (listaProductos != null && !listaProductos.isEmpty()) {
            int cont = 1;
            for(productos producto : listaProductos) {
    %>
            <p><b>Producto <%= cont %></b></p>
            <p>Nombre: <%= producto.getNombre() %></p>
            <p>Cantidad: <%= producto.getCantidad() %></p>
            <p>Categoría: <%= producto.getCategoria() %></p>
            <p>Precio: <%= producto.getPrecio() %></p>
            <p>--------------------------------------</p>
    <% 
                cont++;
            }
        } else {
    %>
        <p>No hay productos disponibles.</p>
    <% } %>
</body>
</html>

