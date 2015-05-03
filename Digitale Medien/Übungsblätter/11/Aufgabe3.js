var input = document.getElementById("zahl");

input.addEventListener('keyup', checkNumber);

function checkNumber(){
    console.log('dsjfn');
    if(isNaN(input.value.slice(-1)) && input.value !== ""){
        input.value = input.value.substring(0, input.value.length -1);
        alert('ungueltige Eingabe!');
    }
}