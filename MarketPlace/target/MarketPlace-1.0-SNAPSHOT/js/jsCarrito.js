function jaja(){
    $("#car").click(function(){
        console.log("aaa");
       funconPrincipal();
  });
}

function funcionPrincipal(){
    
   $.ajax({
        url: "ServletProducto",
        type:"POST",
        data: {
          idproducto:idproducto,
          cantidad:cantidad
        },
        success: function( result ) {
          console.log(result);
          var obj=JSON.parse(result);
          var cantidad=$("#cant").val();
          var s = "<tr> <td>"+obj[i].Id+"</td><td>"+obj[i].Nombre+"</td><td>"+obj[i].Precio+"</td><td>"+cantidad+"</td><tr>";
          $("#tablita").append(s);
          
        }
  });
  }
  

function sumar(){   
    var cantidad=$("#cant").val();
    c = parseInt(cantidad)+1;
    document.getElementById("#cant").innerHTML = c;
    
}

function restar(){
    var cantidad=$("#cant").val();
    c = parseInt(cantidad)-1;
    document.getElementById("#cant").innerHTML = c;    
}

