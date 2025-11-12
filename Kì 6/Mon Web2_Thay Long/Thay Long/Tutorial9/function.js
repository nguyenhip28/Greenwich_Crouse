//declare function with "function" keyword (old syntax)
let sayHello = function (name) {
    console.log("Hello " + name)
}
sayHello("Huy Dev")

//declare function without "function" keyword using arrow symbol
let sayHi = (name) => {
    console.log(`Hi ${name}`)
}
sayHi("Greenwich")