/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//Vamos a hacer el request a nuestro servicio usando ajax con jquery

$("#guardarDireccion").click(function (){
        //Aplicamos el metodo post usando la uri del servicio
        $.post("direccion/12/calle13/55130/Ecatepuk",function (json){
            console.log(json.id);
            
            
        });
    
    
    
    
}
        );
