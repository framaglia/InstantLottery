function restCall () {
    $.ajax({
        type: "GET",
        dataType: "json",
        url: "http://localhost:8080/lottery/purchaseTicket",
        success: function(data){
            $("#a1").attr("src", "img/"+data.drawnNumbers[0]+".png?150x80");
            $("#a2").attr("src", "img/"+data.drawnNumbers[1]+".png?150x80");
            $("#a3").attr("src", "img/"+data.drawnNumbers[2]+".png?150x80");
            $("#b1").attr("src", "img/"+data.drawnNumbers[3]+".png?150x80");
            $("#b2").attr("src", "img/"+data.drawnNumbers[4]+".png?150x80");
            $("#b3").attr("src", "img/"+data.drawnNumbers[5]+".png?150x80");
        }
    });
}