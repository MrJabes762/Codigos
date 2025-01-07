console.log(typeof Object)// uma função 
console.log(typeof new Object ())// uma função mas um objeto 

const Cliente  = function () {}

// Um objeto é uma coleção de chave e valor 

console.log (typeof Cliente)// será gerado uma funçao 
console.log (typeof new Cliente)// será gerado um objeto Cliente 

class Produto {}// Padrão ES 2015 (ES6) - A classe internamente é uma função 

console.log(typeof Produto) // vai me retornar uma função mesmo sendo uma classe
console.log(typeof new Produto ()) // Vai me retornar um objeto Produto 