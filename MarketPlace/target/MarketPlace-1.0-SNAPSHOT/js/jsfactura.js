/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function(){
   mostrarTabla(); 
});

var total = 0;

function mostrarTabla(){
    
    $.ajax({
      url: "ServletProducto",

      success: function( result ) {
        //console.log(result);
        var obj=JSON.parse(result);
        //console.log(obj);
        for(i=0;i<obj.length;i++){
            var s = "<tr> <td>"+obj[i].Id+"</td><td>"+obj[i].Nombre+"</td><td>"+obj[i].Precio+"</td><td>"+obj[i].cantidad+"</td><tr>";
            total = total + (obj[i].cantidad*obj[i].precio);
            $("#tablita").append(s);  
        }
        
        document.getElementById("#total").innerHTML = total;

      }

      

    });
}
