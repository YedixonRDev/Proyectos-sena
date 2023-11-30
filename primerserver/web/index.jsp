<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Formulario de Productos</title>
</head>
<body>
    <h1>Datos del Producto</h1>
    <form action="SvProductos" method="POST">
        <p><label>Nombre: </label> <input type="text" name="nombre" required></p>
        <p><label>Cantidad: </label> <input type="text" name="cantidad" required></p>
        <p><label>Categoría: </label> <input type="text" name="categoria" required></p>
        <p><label>Precio: </label> <input type="text" name="precio" required></p>
        <button type="submit">Enviar</button>
    </form>

    <h1>Ver lista de Productos Disponibles</h1>
    <p>Para ver los productos disponibles, haga Click en el Siguiente botón</p>
    <form action="MostrarProductos.jsp" method="GET">
        <button type="submit">Mostrar Resultados</button>
    </form>
</body>
</html>
