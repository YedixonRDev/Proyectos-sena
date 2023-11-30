<%@ page import="logica.Movimiento" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Mostrar Movimientos</title>
</head>
<body>
    <h1>Lista de Movimientos en el Libro Diario</h1>
    <% 
        List<Movimiento> listaMovimientos = (List<Movimiento>) request.getSession().getAttribute("listaMovimientos");
        if (listaMovimientos != null && !listaMovimientos.isEmpty()) {
            int cont = 1;
            for(Movimiento movimiento : listaMovimientos) {
    %>
            <p><b>Movimiento <%= cont %></b></p>
            <p>Tipo de Movimiento: <%= movimiento.getTipoMovimiento() %></p>
            <p>Concepto: <%= movimiento.getConcepto() %></p>
            <p>Monto: <%= movimiento.getMonto() %></p>
            <p>--------------------------------------</p>
    <% 
                cont++;
            }
        } else {
    %>
        <p>No hay movimientos disponibles en el Libro Diario.</p>
    <% } %>
</body>
</html>
