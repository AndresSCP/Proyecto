<nav class="navbar navbar-expand-lg bg-light">
	<div class="container-fluid">
		<ul class="navbar-nav me-auto mb-2 mb-lg-0">
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" href="#" role="button"
				data-bs-toggle="dropdown" aria-expanded="false"> <img
					src="resources/assets/img/usuario.png" alt="Bootstrap" width="30"
					height="30">
			</a>
				<ul class="dropdown-menu">
					<li><a class="dropdown-item" href="perfil">Perfil</a></li>
					<li><hr class="dropdown-divider"></li>
					<li><a class="dropdown-item" href="/proyectoPersonal/">Salir</a></li>
				</ul></li>
			<li class="nav-item">
			<a class="nav-link active" aria-current="page" href="main">Principal</a>
			</li>
			
			<% if(session.getAttribute("role").equals("administrativo")) { %>
			    <li class="nav-item">
			        <a class="nav-link active" aria-current="page" href="administrativo">Administrar</a>
			    </li>
			<% } else { %>
			    <li class="nav-item d-none">
			        <a class="nav-link active disabled" aria-current="page">Administrar</a>
			    </li>
			<% } %>
			
			<li class="nav-item">
			<a class="nav-link disabled">Bienvenido:<%=session.getAttribute("usuario")%></a>
			</li>
		</ul>
	</div>
</nav>