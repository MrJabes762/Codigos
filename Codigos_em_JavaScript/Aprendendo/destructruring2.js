// Segudo exemplo é trabalhado a desestruturação dentro de Arrays
// Nesse caso vamos ter a desestruturação utilizando os colchetes para trabalhar tanto com o Array
// quanto a desestruturação 

const [a] = [10,11,21];

console.log(a);

const [a1, a2, a3] = [10,20,30];
console.log(a1,a2,a3);

// Em casos de Array dentros de Arrays
// Nesse exemplo eu pulei uma posição de proposito para pegar um elemento especifico 
const [, [, nota]] = [[, 8, 9], [9, 6 , 8]]; // Ignorar o primeiro elemento e ir pro segundo, ignorando tambem o primeiro e acessando o segundo elemento 
console.log (nota)