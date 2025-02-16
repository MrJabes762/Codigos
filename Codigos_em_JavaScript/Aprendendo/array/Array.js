// O Array (internamente) em JavaScript é um objeto, seus atributos e valores são setados em seus índices
// É uma estrutura dinâmica e heterogênea que cresce e diminui: posso colocar qualquer tipo de objeto
// Mas é uma boa prática sempre trabalhar com dados do mesmo tipo - homogêneo

console.log(typeof Array, typeof new Array(), typeof []);

let aprovados = new Array('Bia', 'Carlos', 'Ana'); // essa é uma das formas não muito usuais de se criar um array
console.log(aprovados);

aprovados = ['Bia', 'Lucas', 'Ana']; // anotação comumente utilizada
console.log(aprovados);

aprovados = [{ nome: 'Bia', nota: 8.9 }, { nome: 'Joao', nota: 9 }]; // Array de objetos
console.log(aprovados);

// Acessando elementos
console.log(aprovados[0]);
console.log(aprovados[1]);

// Adicionando elementos
aprovados[2] = { nome: 'Paulo', nota: 9.99 }; // na próxima - esse é mais usado para editar infos
aprovados.push({ nome: 'Jabes', nota: 7.5 }); // na última posição
console.log(aprovados);
console.log('Tamanho do Array = ' + aprovados.length); // Mostrar o tamanho do array

aprovados[5] = { nome: 'Jorge', nota: 8.8 };

console.log(aprovados, 'Tamanho ' + aprovados.length);

// Ordenação
aprovados.sort();
console.log(aprovados);

// Deletar
delete aprovados[2];
console.log(aprovados);

aprovados = ['Bia', 'Joao', 'Carlos', 'Eduarda'];
aprovados.sort(); // ordenei
console.log(aprovados);

// A função splice pode adicionar, remover elementos em um array, adicionar e remover ao mesmo tempo
aprovados.splice(1, 1, 'Elevaldo', 'Jeurs'); // primeiro parâmetro é o índice, e até quanto se remove
console.log(aprovados);