// Objetivo: Aprender sobre o método map
// Nesse arquivo, vamos ver como o método map funciona e como ele pode ser utilizado
// O método map é um método que percorre um array e retorna um novo array com os elementos modificados
// O método map recebe uma função de callback que é executada para cada elemento do array
// A função de callback recebe 3 parâmetros: o valor do elemento, o índice do elemento e o array original
// Nesse caso vamos fazer com que ele dobre o valor de cada elemento do array

const nums = [1, 2, 3, 4, 5];

// Exemplo básico de uso do map
const doubled = nums.map(num => num * 2);
console.log(doubled); // [2, 4, 6, 8, 10]

// Exemplo com função de callback tradicional
let resultado = nums.map(function(e) {
    return e * 2;
});

console.log(resultado); // [2, 4, 6, 8, 10]
console.log(nums, resultado); // [1, 2, 3, 4, 5] [2, 4, 6, 8, 10]

// Exemplo com funções arrow
const soma10 = e => e + 10; // função arrow que soma 10 a cada elemento
const triplo = e => e * 3; // função arrow que triplica cada elemento
const paraDinheiro = e => `R$ ${parseFloat(e).toFixed(2).replace('.', ',')}`; // função arrow que transforma cada elemento em uma string com o formato de dinheiro

// Exemplo de uso do map com funções arrow
let resultado2 = nums.map(soma10);
console.log(resultado2); // [11, 12, 13, 14, 15]


let resultado3 = nums.map(triplo);
console.log(resultado3); // [3, 6, 9, 12, 15]

let resultado4 = nums.map(paraDinheiro);
console.log(resultado4); // ["R$ 1,00", "R$ 2,00", "R$ 3,00", "R$ 4,00", "R$ 5,00"]

// Encadeando map
let resultado5 = nums.map(soma10).map(triplo).map(paraDinheiro);// primeiro soma 10, depois triplica e por fim transforma em dinheiro
console.log(resultado5); // ["R$ 33,00", "R$ 36,00", "R$ 39,00", "R$ 42,00", "R$ 45
