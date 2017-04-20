/**
 * Created by francesco on 19/04/17.
 */
function restCall () {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function(response) {
        if (this.readyState == 4 && this.status == 200) {
            console.log(response);
        }
    };
    xhttp.open("POST", "http://localhost:8080/bingo/bet", true);
    xhttp.setRequestHeader("Content-Type", "application/json");
    xhttp.setRequestHeader("Accept", "application/json");
    xhttp.send("[1,2,3]");
};


window.maglia = restCall;

