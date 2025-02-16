// Segundo exemplo é trabalhada a desestruturação dentro de arrays
// Nesse caso vamos ter a desestruturação utilizando os colchetes para trabalhar tanto com o array
// quanto a desestruturação

const [a] = [10, 11, 21];

console.log(a);

const [a1, a2, a3] = [10, 20, 30];
console.log(a1, a2, a3);

// Em casos de array dentro de arrays
// Nesse exemplo eu pulei uma posição de propósito para pegar um elemento específico
const [, [, nota]] = [[, 8, 9], [9, 6, 8]]; // Ignorar o primeiro elemento e ir para o segundo, ignorando também o primeiro e acessando o segundo elemento
console.log(nota);