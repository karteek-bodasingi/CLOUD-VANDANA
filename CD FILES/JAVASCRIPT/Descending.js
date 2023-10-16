var Array=[];
var size = prompt();
for(var i=0; i<size; i++) 
{
	Array[i] = prompt();
}
Array.sort(compare);
function compare(a,b){
    return b-a;
}
document.write(Array);