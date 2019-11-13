//$(document).on('ready', funcionPrincipal);

/*
   $(document).ready(function(){
     $("p").click(function(){
       $(this).hide();
     });
   });
 */


/*$(document).ready(function(){
   $("#boton1").click(function(){
       //funconPrincipal();
       var s = "<tr> <td>hola</td> <td>holax2</td><td>XD</td><td>:v</td> \n\\n\
\n\
<tr>";

    $("table").append(s);
  });
});*/
function jaja(){
    $("#car").click(function(){
        console.log("aaa");
       //funconPrincipal();
       var s = "<tr> <td>hola</td> <td>holax2</td><td>XD</td><td>:v</td> \n\\n\
\n\
<tr>";

    $("#tablita").append(s);
  });
}

function funcionPrincipal(){
 
 

   $.ajax({
        url: "ServletProducto",
        type:"POST",
        data: {
          idproducto:idproducto
        },
        //etCookie(idproducto);
        success: function( result ) {
          console.log(result);
          var obj=JSON.parse(result);
        }
  });
  }
  

function sumar(){
    
    //var c = document.getElementById()('cant').value;
    //c = parseInt(c)+1;
    document.getElementById("#cant").innerHTML = 2;
    
}

function restar(){
    
    //var c = document.getElementById()('cant').value;
    //c = parseInt(c)-1;
    document.getElementById("#cant").innerHTML = 2;
    
}

