function addnum() {
    var a = parseInt(document.getElementById("number_1").value);
    var b = parseInt(document.getElementById("number_2").value);
    if (isNaN(a) || isNaN(b)) {
        alert("Please enter valid numbers.");
        return;
    }
    document.getElementById("result").value = a + b;
}

function subnum(){
    var a=parseInt(document.getElementById("number_1").value);
    var b= parseInt(document.getElementById("number_2").value);
    if(isNaN(a) || isNaN(b)){
        alert("Please enter valid numbers.");
        return;
    }
    document.getElementById("result").value= a-b;
}

function mulnum(){
    var a=parseInt(document.getElementById("number_1").value);
    var b= parseInt(document.getElementById("number_2").value);
    if(isNaN(a) || isNaN(b)){
        alert("Please enter valid numbers.");
        return;
    }
    document.getElementById("result").value= a*b;
}

function divnum(){
    var a=parseInt(document.getElementById("number_1").value);
    var b= parseInt(document.getElementById("number_2").value);
    if(isNaN(a) || isNaN(b)){
        alert("Please enter valid numbers.");
        return;
    }
    if(b==0){
        alert("Cannot divide by 0");
        return;
    }
    document.getElementById("result").value= a/b;
}