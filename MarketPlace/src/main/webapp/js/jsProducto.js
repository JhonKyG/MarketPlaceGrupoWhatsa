$(document).ready(function(){
   mostrar(); 
   
});


function enviar(){
 
 var idProducto=$("#idProducto").val();
 var precio=$("#precio").val();
 var categoria=$("#categoria").val();
 var descripcion=$("#descripcion").val();
 var nombre=$("#nombre").val();
 var url=$("#url").val();
 

 












 
$.ajax({
  url: "ServletProducto",
  type:"POST",
  data: {
    idProducto:idProducto,
    precio:precio,
    categoria:categoria,
    descripcion:descripcion,
    nombre:nombre,
    url:url
  },
  success: function( result ) {
    console.log(result);
    var obj=JSON.parse(result);

   
        

   
    
  }
});

}



function mostrar(){
    
    
 
$.ajax({
  url: "ServletProducto",





  success: function( result ) {

    var obj=JSON.parse(result);

    for(i=0;i<obj.length;i++){

        $("#pro").append('<div class="col-sm">\
                <div class="card" style="width: 18rem;">\
                    <div style="width: 100%; text-align: center;">\
                        <img src="'+obj[i].url+'" style="height: 250px; width: 130px;" alt="img">\
                    </div>\
                    <div class="card-body">\
                        <h5 class="card-title">'+obj[i].nombre+'</h5>\
                        <h6 class="card-text">'+obj[i].categoria+'</h6>\
                        <p class="card-text">'+obj[i].descripcion+'</p>\
                    </div>\
                    <ul class="list-group list-group-flush">\
                        <li class="list-group-item">'+obj[i].precio+'</li>\
                    </ul>\
                    <div class="card-body">\
                        <button class="submit-btn" id="car" onclick="carrito()">Añadir al carrito</button>\
                    </div>\
                </div>\
            </div>');        
    }
    
  }
  
 
});
}


function filtro(){
 var nombre=$("#buscar").val();


 

 
 
 $.ajax({
  url: "ServletProducto",
  data: {
    nombre:nombre
  },
  success: function( result ) {
    console.log(result);
    var obj=JSON.parse(result);
    console.log(obj);
    for(i=0;i<obj.length;i++){

        $("#pro").empty();
        $("#pro").append('<div class="col-sm">\
                <div class="card" style="width: 18rem;">\
                    <div style="width: 100%; text-align: center;">\
                        <img src="'+obj[i].url+'" style="height: 250px; width: 130px;" alt="img">\
                    </div>\
                    <div class="card-body">\
                        <h5 class="card-title">'+obj[i].nombre+'</h5>\
                        <h6 class="card-text">'+obj[i].categoria+'</h6>\
                        <p class="card-text">'+obj[i].descripcion+'</p>\
                    </div>\
                    <ul class="list-group list-group-flush">\
                        <li class="list-group-item">'+obj[i].precio+'</li>\
                    </ul>\
                    <div class="card-body">\
                        <button class="submit-btn" id="car" onclick="carrito()">Añadir al carrito</button>\
                    </div>\
                </div>\
            </div>');        
      }
        
  }
  
 
});

}

function carrito(){
    
    
 
$.ajax({
  url: "ServletProducto",
 

  success: function( result ) {

    var obj=JSON.parse(result);

    for(i=0;i<obj.length;i++){

        var li="";
          li = '<li id="li'+i+'">\
                <div class="row" style="background-color: white; display: flex; justify-content: center; align-items: center;\
		height: 80px">\
		<div class="col s4" align="center">\
		<img src="'+obj[i].url+'" style="width: 90%; height: 56px; vertical-align: middle;">\
		</div>\
		<div class="col s6">\
		<p style="font-size: 100%; line-height: 32px" class="canti'+i+'"><b>'+obj[i].nombre+'</b><br>\n\
                $'+obj[i].precio+' COP</p>\
		</div>\
		<div class="col s2" style="line-height: 14px">\
		<i class="material-icons" style="color: #64b5f6" onclick="r()">remove_circle</i>\
		<i class="material-icons" style="color: red" onclick="eliminar(\''+i+'\')">cancel</i>\
		</div>\
		</div></li>';
	$(".cart").append(li);    
          
          
    }
    
  }
  
 
});
}

function mostrarUsuario(){
    
 
$.ajax({
  url: "ServletObtenerUsuario",
 
  success: function( result ) {
    console.log(result);
    var obj=JSON.parse(result);

    for(i=0;i<obj.length;i++){

        $("#idUs").append(obj[i].id);
        $("#nombreUs").append(obj[i].nombre);
    }
    
  }
  
 
});
}

