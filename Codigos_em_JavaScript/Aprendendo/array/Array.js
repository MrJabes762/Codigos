// O Array (internamente) em Java Script é um Objeto os seus atributos e valores são setados em seus indices 
// È uma estrutura dinâmica e heterogenia que crece e diminu: posso colocar qualquer tipo de objeto 
// Mas é uma boa prática sempre trabalhar com dados do mesmo tipo - homogenio 

console.log(typeof Array, typeof new Array (), typeof []);

let aprovados = new Array ('Bia','Carlos','Ana'); // essa é uma das formas não muito usuais de se criar um array 
console.log(aprovados);

aprovados = ['Bia', 'Lucas', 'Ana']; // anotação comumente utilizada
console.log(aprovados);

aprovados = [{nome:'Bia', nota:8.9,} , {nome:'Joao', nota:9}];// Array de Objetos
console.log(aprovados);

//Acessando Elementos 
console.log(aprovados[0]);
console.log(aprovados[1]);

//Adicionando Elementos
aprovados[2] = {nome:'Paulo', nota: 9.99};// na Poxima - esse é mais usado para editar infos
aprovados.push({nome:'Jabes', nota:7.5});// na ultima posição
console.log(aprovados);
console.log('Tamano do Array = ' + aprovados.length); //Mostrar o tamanho do Array

aprovados[5] = {nome:'Jorge', nota: 8.8};

console.log(aprovados, 'Tamanho ' + aprovados.length)

//Ordenação
aprovados.sort();
console.log(aprovados);

//Deletar
delete aprovados[2];
console.log(aprovados);

aprovados = ['Bia', 'Joao','Carlos','Eduarda'];
aprovados.sort();// ordenei
console.log(aprovados);

// A função splice pode adicionar, remover elementos em um array, adicionar e remover ao mesmo tempo
aprovados.splice(1,1, 'Elevaldo', 'Jeurs');// primeiro parametro é o indece, e até qunto se remove remover
console.log(aprovados);