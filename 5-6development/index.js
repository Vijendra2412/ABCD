var obj = {
    fname: "vj"
}
var obj2 = {
    lname : " Sharma"
}
obj2.__proto__ = obj
console.log(obj2.fname);
