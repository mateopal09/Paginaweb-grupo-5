<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="UTF-8">
<title>Clientes Page</title>
<link rel="stylesheet" type="text/css" href="estilo.css">
</head>
<body>

<ul class="menu">
	<li><a href="Usuarios.jsp">Usuarios</a></li>
	<li><a href="cliente.jsp">Clientes</a></li>
	<li><a href="Proveedor.jsp">Proveedores</a></li>
	<li><a href="#">Productos</a></li>
	<li><a href="#">Ventas</a></li>
	<li><a href="#">Reportes</a></li>
	</ul>
	
	<h1>Clientes</h1>

	<p>
		Cedula: <input type="number">
	</p>
	<p>
		Nombre completo: <input type="text">
	</p>
	<p>
		Correo Electrónico: <input type="email">
	</p>
	<p>
		Usuario: <input type="text">
	</p>
	<p>
		Contraseña: <input type="password">
	</p>
	<form method="post" name="Consultar" id="button">
		<input type="submit" name="Consultar" value="Consultar">
	</form>
	<form method="post" name="Crear" id="button">
		<input type="submit" name="Crear" value="Crear">
	</form>
	<form method="post" name="Actualizar" id="button">
		<input type="submit" name="Actualizar" value="Actualizar">
	</form>
	<form method="post" name="Borrar" id="button">
		<input type="submit" name="Borrar" value="Borrar">
	</form>


</body>
</html>