function validateForm() {
    var usuario = document.getElementById('Usuario').value;
    if (usuario == "") {
        let mensaje01 = " El campo Usuario no puede estar vacío"
        let labelusuario = document.getElementById('labelusuario')
        labelusuario.textContent= labelusuario.textContent+mensaje01
        labelusuario.classList.add("text-danger")
        return false;
    
    }
    var Email = document.getElementById('Email').value;
    if (Email == "") {
        let mensaje02 = " El campo Email no puede estar vacío" 
        let labelemail = document.getElementById('labelemail')
        labelemail.textContent= labelemail.textContent+mensaje02
        labelemail.classList.add("text-danger")
        return false;
    }
    var Password = document.getElementById('Password').value;
    if (Password == "") {
        let mensaje03 = " El campo Contraseña no puede estar vacío"
        let labelpassword = document.getElementById('labelpassword')
        labelpassword.textContent= labelpassword.textContent+mensaje03
        labelpassword.classList.add("text-danger")
        return false;
    }

    var RPassword = document.getElementById('RPassword').value;
    if (RPassword == "") {
        alert("Escribe nuevamente tu Contraseña");
        return false;
    }

    if (RPassword != Password) {
        alert ("La contraseña no coincide")
    }
               // JQuery

    if ( $('#cajacheckbox').prop('checked')){
    alert ("Registro Correcto")   
     } 
    else { alert ("debes marcar la casilla de Terminos de servicio")

     }
}   
    // mostrar texto boton  
    $('#mostrartexto').click(() => {
    $('#mostrar').toggle('fold');
    })

    // login
    $(document).ready(() => {
    $("#basic-form").validate();
    });

