console.log("Hello world");
let a = 5;
let b = 6.7;
var c;

if (a < b){
    console.log("hi");

}
else if (a < b) {
    console.log("bye");
}
else {
    console.log("goodbye");
}
function sum(x = 10, y){
    console.log(x + y);
    return x + y;
}
sum(undefined, 6);