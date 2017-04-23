function restCall () {
    $.ajax({
        type: "GET",
        dataType: "json",
        url: "http://localhost:8080/lottery/purchaseTicket",
        success: function(data){
            $("#a1").attr("src", "img/"+data.drawnNumbers[0]+".gif?150x80");
            $("#a2").attr("src", "img/"+data.drawnNumbers[1]+".gif?150x80");
            $("#a3").attr("src", "img/"+data.drawnNumbers[2]+".gif?150x80");
            $("#b1").attr("src", "img/"+data.drawnNumbers[3]+".gif?150x80");
            $("#b2").attr("src", "img/"+data.drawnNumbers[4]+".gif?150x80");
            $("#b3").attr("src", "img/"+data.drawnNumbers[5]+".gif?150x80");
            if(data.winning == true) {
                $("#d1").attr("class", "panel panel-success");
                $("#d2").attr("class", "panel panel-success");
                $("#d3").attr("class", "panel panel-success");
                $("#d4").attr("class", "panel panel-success");
                $("#d5").attr("class", "panel panel-success");
                $("#d6").attr("class", "panel panel-success");
            } else {
                $("#d1").attr("class", "panel panel-danger");
                $("#d2").attr("class", "panel panel-danger");
                $("#d3").attr("class", "panel panel-danger");
                $("#d4").attr("class", "panel panel-danger");
                $("#d5").attr("class", "panel panel-danger");
                $("#d6").attr("class", "panel panel-danger");
            }
        }
    });
}