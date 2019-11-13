var contQR;
        $(document).ready(function(){
            filtroSaldo(); 
        });
        
 function filtroSaldo(){
   
   var sal = getCookie("cookieUsuario");
   console.log(sal);
 
 $.ajax({
  url: "ServletSaldo",
  data: {
    sal:sal
  },
  success: function( result ) {
    console.log(result);
    var obj=JSON.parse(result);
    console.log(obj);
    for(i=0;i<obj.length;i++){
        //console.log(obj[i].nombre);
        $("#saldo").append(obj[i].saldo);        
      }
        
  }
  
 
});

}
      
        
        let scanner = new Instascan.Scanner(
            {
                video: document.getElementById('preview')
            }
        );
        scanner.addListener('scan', function(content) {
            contQR=content;
            alert('Enviado a: ' + content);
            window.open(content, "_blank");
        });
        Instascan.Camera.getCameras().then(cameras => 
        {
            if(cameras.length > 0){
                scanner.start(cameras[0]);
            } else {
                console.error("error!");
            }
        });
        
function verificar(){
 
 console.log(contQR);
 
 $.ajax({
  url: "ServletUsuario",
  data: {
    contQR:contQR
  },
  success: function( result ) {
    console.log(result);
    var obj=JSON.parse(result);
    console.log(obj);
    for(i=0;i<obj.length;i++){
       console.log("el usuario"+obj[i].cedula+"si existe");
       
    }
  }
  
});

}

function actualizarSaldo(){
 
 var montoEnviar=$("#monto").val();
 var cedula = getCookie("cookieUsuario");
 
$.ajax({
  url: "ServletModificarSaldo",
  data: {
    montoEnviar:montoEnviar,
    cedula:cedula
  },
  success: function( result ) {
    console.log(result);
    var obj=JSON.parse(result);
    
    
  }
});

}
