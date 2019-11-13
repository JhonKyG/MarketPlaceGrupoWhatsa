console.clear();

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


function enviar(){
 
 var idEmpresa=$("#idEmpresa").val();
 var nombre=$("#nombre").val();
 var nit=$("#nit").val();
 var correo=$("#correo").val();
 var celular=$("#celular").val();
 var contrasena=sha256($("#contrasena").val());
 
 
$.ajax({
  url: "ServletEmpresa",
  type:"POST",
  data: {
    idEmpresa:idEmpresa,
    nombre:nombre,
    nit:nit,
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
 var nit=$("#user").val();
 var contrasena=sha256($("#psw").val());
 
 
 $.ajax({
  url: "ServletEmpresaLogin",
  type:"POST",
  data: {
    nit:nit,
    contrasena:contrasena
  },
  success: function( result ) {
    console.log(result);
    var obj=JSON.parse(result);
    console.log(obj);
    for(i=0;i<obj.length;i++){
        window.location.href = "producto.html";
  }
  }
});

}