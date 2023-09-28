function validar(){
    let usr = document.getElementById("usuario").value
    let pwd = document.getElementById("clave").value
    
    if (pwd != "1234"){
        console.log(usr)
        console.log(pwd)
        
        var toastLiveExample = document.getElementById('clavemala')
        var toast = new bootstrap.Toast(toastLiveExample)
        toast.show()
 
    }
    else{
        window.open("index.html", "_self");
    }
}

function inicio() {
    window.open("login.html", "_self");        
}

function verificar(){
    let usr = document.getElementById("usuario").value
        
    if (!(usr == "oscar") && !(usr == "")){
        console.log(usr)
      
        
        var toastLiveExample = document.getElementById('noexiste')
        var toast = new bootstrap.Toast(toastLiveExample)
        toast.show()
 
    }
    else{
        if (usr == ""){
            var toastLiveExample = document.getElementById('vacio')
            var toast = new bootstrap.Toast(toastLiveExample)
            toast.show()
     
        }
        else
        {
            var toastLiveExample = document.getElementById('enviado')
            var toast = new bootstrap.Toast(toastLiveExample)
            toast.show()

        }
    }
}