<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>login</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.13.2/themes/base/jquery-ui.min.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.13.2/themes/base/theme.min.css">
	<link rel="stylesheet" href="resources/css/style.css">

</head>
<body>
    <section class="h-100 gradient-form" id="loginsitio">
        <div class="container py-5 h-100">
          <div class="row d-flex justify-content-center align-items-center ">
            <div class="col-xl-10">
              <div class="card rounded-3 text-black">
                <div class="row g-0">
                  <div class="col-lg-6">
                    <!-- columna izquierda -->
                    <div class="row">
                      <div class="card-body p-md-5 mx-md-4">
                        <div class="text-center">
                          <img src="resources/assets/img/alerta.jpg"
                            style="width: 100px;" alt="logo">
                          <h4 class="mt-1 mb-5 pb-1">MyAlert!</h4>
                        </div>     
                        <form action="login" method="POST">
                          <p>Por favor ingresa a tu cuenta</p>
        
                          <div class="form-outline mb-4">
                            <input class="form-control" id="username" name="username" minlength="3" type="text" placeholder="Escribe tu usuario" required >
                            <label for="username">Usuario</label>
                          </div>
        
                          <div class="form-outline mb-4">
                            <input class="form-control" id="password" type="password" name="password" placeholder="Escribe tu contraseña"required>
                            <label for="password">Contraseña</label> 
                          </div>
                      
                          <div class="text-center pt-1 mb-5 pb-1"> 
                            <input class="submit btn btn-primary btn-block fa-lg gradient-custom-2 mb-3" type="submit" value="Ingresa">
                            <a class="text-muted" href="main">Olvidaste tu Contraseña?</a>
                          </div>
        
                          <div class="d-flex justify-content-center pb-4">
                            <p class="mb-0 me-2">No tienes una cuenta?</p>
                            <a type="button" class="btn btn-outline-danger" href="registro">Crea una nueva</a>
                          </div>
        
                        </form> 
                        <hr margin="50px">

                        <!-- Footer + boton Jquery -->

                        <div class="row">
                          <div class="text-center">
                            <button class="btn btn-secondary gradient-custom-2" type="button" id="mostrartexto">
                              Acerca de MyAlert!
                            </button>
                           </div>
                        <div class="text-center pb-3">
                        <p class="parrafo small mb-0" style="display: none" id="mostrar">Mantente alerta con MyAlert!, esta una comunidad que
                          busca mantener alerta e informados
                          a sus usuarios de eventos que afecten la seguridad en su zona, comparte lo que veas en tu ubicacion al instante!</p>
                        </div>  
                        <hr>
                        <p class="text-center text-muted">© 2023 Andres, Inc</p>
                        </div>   
                      </div>
                    </div>
                  </div>

                  <!-- columna derecha -->

                  <div class="col-lg-6 d-flex align-items-center justify-content-center gradient-custom-2" id="columnaderecha">

                     <div class="text-white" >
                        <img class="img-responsive img-rounded" src="resources/assets/img/mapaA1.gif" alt="" id="fotomapa"> 
                     </div> 
                       
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
    </section>
      <!-- scripts -->
      <script src="https://code.jquery.com/jquery-3.6.3.min.js" integrity="sha256-pvPw+upLPUjgMXY0G+8O0xUf+/Im1MZjXxxgOcBQBXU=" crossorigin="anonymous"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.13.2/jquery-ui.min.js"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.0/jquery.validate.min.js"></script>
      <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
      <script src="resources/scripts/main.js"></script>
</body>
</html>