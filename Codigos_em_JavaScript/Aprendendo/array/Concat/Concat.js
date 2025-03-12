// A função concat() é usada para concatenar arrays e/ou valores em um novo array.
// Os arrays originais não são alterados. 
const filhas = ['Valeska', 'Cibalena'];
const filhos = ['Uoxiton', 'Uesclei', 'Raquel Dos Teclados'];
const todos = filhas.concat(filhos);
const todos2 = filhas.concat(filhos, 'Fulano',1,+2,'Sheila','Edinalva');// alem de concatenar os arrays, também adiciona um novo valor ao array
console.log(todos); 
console.log(todos2);
console.log([].concat([1, 2], [3, 4], 5, [[6, 7]])); // ele concatena os 2 primeiros arrays, depois adiciona o 5, e por fim adiciona a matriz que vira um array [[6, 7]] como um array dentro do array