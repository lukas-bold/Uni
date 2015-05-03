/*HTML-Code
<div id="wrapper">
    <div>Hallo</div>
    <div>Welt</div>
</div>*/

// element ist jetzt der DOM-Knoten #wrapper
var element = document.getElementById("wrapper");

// beim Event click auf element führe dosomething() aus
element.addEventListener("click",doSomething);


function doSomething(){
    // setze element Zähler elementsCount auf 0
    var elementsCount = 0;
    // setzte childrenCount auf die Anzahl der Kindknoten im Dom von element
    var childrenCount = element.childNodes.length;
    // setze Laufvariable i auf 0
    var i = 0;
    
    // solange i kleiner als childrenCount ist
    while(i<childrenCount) {
        // falls der aktuell behandelte childNode vom Typ Textknoten ist 
        if(element.childNodes[i].nodeType != 3) {
            // ...zähler den elemntsCount um 1 nach oben
            elementsCount++;
        }
        // zähle die Laufvariable um eins nach oben
        i++;
    }  // ENDE while
    
    // gib den elementsCount als Dialog in der Benutzeroberfläche aus
    alert(elementsCount);
}