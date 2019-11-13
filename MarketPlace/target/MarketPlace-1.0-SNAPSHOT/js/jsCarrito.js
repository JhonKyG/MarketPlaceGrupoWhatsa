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
          var cantidad=$("#cantidad").val();
          var s = "<tr> <td>"+obj[i].Id+"</td><td>"+obj[i].Nombre+"</td><td>"+obj[i].Precio+"</td><td>"+cantidad+"</td><tr>";
          $("#tablita").append(s);
          
          
        }
  });
  }
  

function sumar(){   
    var c = document.getElementById()('cant').value;
    c = parseInt(c)+1;
    document.getElementById("#cant").innerHTML = 2;
    
}

function restar(){
        document.getElementById("#cant").innerHTML = 2;    
}

