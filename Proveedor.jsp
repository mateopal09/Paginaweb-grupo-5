<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="UTF-8">
<title>Proveedores Page</title>
</head>
<body>
	<h1>Proveedores</h1>
	<h1></h1>
	<p>
		NIT <input type="number">
	</p>
	<p>
		Nombre proveedor: <input type="text">
	</p>
	<p>
		Dirección <input type="text">
	</p>
	<p>
		Telefono: <input type="password">
	</p>
	<p>
		Ciudad: <input type="text">
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