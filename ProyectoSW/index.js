var btnIniciarSesion = document.getElementById("btnIniciarSesion");
btnIniciarSesion.addEventListener("click", () => {
    axios.post("http://localhost:4567/validarUsuario", {
        usuario: document.getElementById("usuario").value,
        pass: document.getElementById("pass").value
    })
        .then(function (res) {
            if(res.data == 1){
                alert("Maestro");
            }else if(res.data == 0){
                alert("Alumno");
            }else if(res.data == -1){
                alert("Usuario o contraseñas invalidos");
            }
        })
        .catch(function (error) {
            console.log(error)
        })
});