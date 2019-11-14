/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


console.clear();
/*

const loginBtn = document.getElementById("login");
const signupBtn = document.getElementById("signup");

loginBtn.addEventListener("click", e => {
	let parent = e.target.parentNode.parentNode;
	Array.from(e.target.parentNode.parentNode.classList).find(element => {
		if (element !== "slide-up") {
			parent.classList.add("slide-up");
		} else {
			signupBtn.parentNode.classList.add("slide-up");
			parent.classList.remove("slide-up");
		}
	});
});

signupBtn.addEventListener("click", e => {
	let parent = e.target.parentNode;
	Array.from(e.target.parentNode.classList).find(element => {
		if (element !== "slide-up") {
			parent.classList.add("slide-up");
		} else {
			loginBtn.parentNode.parentNode.classList.add("slide-up");
			parent.classList.remove("slide-up");
		}
	});
});

*/

function enviar(){
 
 var id=$("#id").val();
 var nombre=$("#nombre").val();
 var cedula=$("#cedula").val();
 var correo=$("#correo").val();
 var celular=$("#celular").val();
 var contrasena=sha256($("#contrasena").val());
 
$.ajax({
  url: "ServletUsuario",
  type:"POST",
  data: {
    id:id,
    nombre:nombre,
    cedula:cedula,
    correo:correo,
    celular:celular,
    contrasena:contrasena
  },
  success: function( result ) {
    console.log(result);
    var obj=JSON.parse(result);
    
    
  }
});

}

function filtro(){
 var cedula=$("#user").val();
 var contrasena=sha256($("#psw").val());
 
 console.log(cedula);
 console.log(contrasena);
 
 $.ajax({
  url: "ServletUsuarioLogin",
  type:"POST",
  data: {
    cedula:cedula,
    contrasena:contrasena
  },
  success: function( result ) {
    console.log(result);
    var obj=JSON.parse(result);
    console.log(obj);
    for(i=0;i<obj.length;i++){
        
        setCookie("cookieUsuario",cedula,24*60*60*1000);
          
    }
   
  },
  complete: function(res){
      console.log(res);
    var obj=JSON.parse(res.responseText);
    console.log(obj);
    if(obj.length>0){
        window.location.replace("oferta.html");
    }
  }
});

}



