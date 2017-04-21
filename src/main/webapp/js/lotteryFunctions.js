function restCall () {
    $.ajax({
        type: "GET",
        dataType: "jsonp",
        url: "http://localhost:8080/lottery/purchaseTicket",
        success: function(data){
            alert(data);
        }
    });
}