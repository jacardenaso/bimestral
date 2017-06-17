/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//Vamos a hacer el request a nuestro servicio usando ajax con jquery

    
    $.ajax({
            url:'direccion',
            type:'get',
            success:function(json){
                
                
                console.log('Numero de elementos encontrados' + json.length);
                for(var i=0;i<json.length;i++){
                    
                    $("#tablita").append(("<tr><td>"+json[i].id+" </td><td>"+json[i].numero+"  </td><td>"+json[i].calle+"  </td><td> "+json[i].cp+" </td> <td>"+json[i].municipio+"</td></tr>"));
                    
                }
            } 
 
        
    });
    
    

$("#guardarDireccion").click(function (){
        //Aplicamos el metodo post usando la uri del servicio
        var numero=$("#numero").val();
        var calle=$("#calle").val();
        var cp=$("#cp").val();
        var municipio=$("#municipio").val();
        
        $.post("direccion/"+numero+'/'+calle+'/'+cp+'/'+municipio,function (json){
            console.log(json.id);
            
            
        
});
});
    
    
$("#buscarPorId").click(function (){
        //Aplicamos el metodo post usando la uri del servicio
        var id=$("#id").val();
 
        
        $.get("direccion/"+id,function (json){
            console.log(json.municipio);
            $("#numero2").val(json.municipio);
             $("#calle2").val(json.calle);
              $("#cp2").val(json.cp);
               $("#municipio2").val(json.municipio);
            
        
});
});


//$("#actualizar").click(function (){
 //       //Aplicamos el metodo post usando la uri del servicio
    //    var id=$("#id").val();
        
       // $.ajax({
          //  type="PUT",
            //url="direccion/"+id+'/'+numero+'/'+calle+'/'+cp+'/'+
 
        
                    
        
//});
//});


