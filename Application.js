"use strict";

let args = process.argv.slice(2);

const add = (n1, n2) => n1 + n2;

function main(args) {
    let n1 = Number(args[0]);
    let n2 = Number(args[1]);
    console.log(`Resultat ${add(n1, n2)}`)
}

main(args);

module.exports = {add};