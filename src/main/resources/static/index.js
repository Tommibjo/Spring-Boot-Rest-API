/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/* global url */
 
/* 
 * This method retreives all the comments from Spring Boot RESTcontroller to display
 * */

/*
 * 
 * Nyt tarvitee saada "JSON Grouping" ( https://stackoverflow.com/questions/37630350/grouping-same-date-json-data-together-using-java ) kondikseen.

 *
 */

const request = new XMLHttpRequest();
request.open('get', "http://localhost:8080/comment");
request.send();
request.onload = () => {
    if (request.status === 200) {
        alert("Javascript loads");
        var comment = JSON.stringify(JSON.parse(request.response));
        document.getElementById("AllComments").innerHTML = comment;
    } 
};

request.onerror = () => {
    alert("Error");
};

