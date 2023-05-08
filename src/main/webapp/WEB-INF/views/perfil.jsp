<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Perfil</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
<link rel="stylesheet" href="resources/css/styleRegistro.css">
</head>
<body>
	<%@include file="components/navbar.jsp"%>
	<section class="vh-100 bg-image">
<div class="container rounded bg-white mt-5 mb-5">
    <div class="row">
        <div class="col-md-3 border-right">
            <div class="d-flex flex-column align-items-center text-center p-3 py-5">
            <img class="rounded-circle mt-5" width="150px" src="https://st3.depositphotos.com/15648834/17930/v/600/depositphotos_179308454-stock-illustration-unknown-person-silhouette-glasses-profile.jpg">
            <span class="font-weight-bold">${cliente.username}</span>
            <span class="text-black-50">${cliente.emailCliente}</span>
            <span> 
            </span>
            </div>
        </div>
        <div class="col-md-5 border-right">
            <div class="p-3 py-5">
                <div class="d-flex justify-content-between align-items-center mb-3">
                    <h4 class="text-right">Datos de Perfil</h4>
                </div>
                <div class="row mt-2">
                    <div class="col-md-6">
					    <label class="labels">Nombre</label>
					    <input type="text" class="form-control" placeholder="Nombre" value="${cliente.nombreCliente}">
					    <input type="hidden" id="nombreCliente" name="nombreCliente" value="${cliente.nombreCliente}" />
					</div>
                    <div class="col-md-6">
	                    <label class="labels">Apellido</label>
	                    <input type="text" class="form-control" placeholder="Apellido" value="${cliente.apellidoCliente}">
	                    <input type="hidden" id="apellidoCliente" name="apellidoCliente" value="${cliente.apellidoCliente}" />
                    </div>
                </div>   
                <div class="row mt-3">
                    <div class="col-md-12">
	                    <label class="labels">Nickname</label>           
	                    <input type="text" class="form-control" placeholder="username" value="${cliente.username}">
		                <input type="hidden" id="username" name="username" value="${cliente.username}" />
		            </div>
                    <div class="col-md-12">
	                    <label class="labels">Email</label>
	                    <input type="text" class="form-control" placeholder="Email" value="${cliente.emailCliente}">
		                <input type="hidden" id="Email" name="Email" value="${cliente.emailCliente}"/>
		            </div>		                
                    <div class="col-md-12">
	                    <label class="labels">Genero</label>
	                    <input type="text" class="form-control" placeholder="Genero" value="${cliente.genero}">
		                <input type="hidden" id="Genero" name="Genero" value="${cliente.genero}"/>
                    </div>                  
                <div class="mt-5 text-center"><button class="btn btn-primary profile-button" type="button">Guardar Cambios</button></div>
            </div>
            
        </div>
    </div>
</div>
</div>
</section>
		<!-- Footer -->
	<%@include file="components/footer.jsp"%>
	
	<script src="https://code.jquery.com/jquery-3.6.3.min.js"
		integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU="
		crossorigin="anonymous"></script>
	<script
		src="https://maps.googleapis.com/maps/api/js?libraries=geometry,places&key=AIzaSyAvBQ1Q9FjYfxdWJF6KPmO822RMMbY2w2o"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
		integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js"
		integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V"
		crossorigin="anonymous"></script>
	<script src="scripts/main.js"></script>
</body>
</html>