<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Formulario del Libro Diario</title>
</head>
<body>
    <h1>Datos del Movimiento en el Libro Diario</h1>
    <form action="ProcesarMovimiento" method="post">
       
        <p><label>Tipo de Movimiento: </label> <input type="text" name="tipoMovimiento" required></p>
        <p><label>Concepto: </label> <input type="text" name="concepto" required></p>
        <p><label>Monto: </label> <input type="text" name="monto" required></p>
        <button type="submit">Enviar</button>
        
        <h1>Ver lista de Movimientos</h1>
    <p>Para ver los movimientos, haga Click en el Siguiente botón</p>
    <form action="MostrarMovimientos.jsp" method="GET">
        <button type="submit">Mostrar Resultados</button>
    </form>
  
</body>
</html>
