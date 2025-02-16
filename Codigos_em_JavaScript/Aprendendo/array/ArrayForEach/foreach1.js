const aprovados = ['luiz', 'lsSantos', 'Elivaldo', 'Fernando'];

// O forEach percorre todos os elementos do array e executa uma instrução para cada elemento
// É um loop de repetição mais coeso

aprovados.forEach(function(nome, indice, array) { // Percorrendo o array e imprimindo o nome e o índice
    console.log(`${indice + 1}) ${nome}`);
    console.log(array); // Podemos imprimir o próprio array
});

console.log(aprovados); // Como um array é exibido

aprovados.forEach((nome, indice) => console.log(`${indice + 1}) ${nome}`)); // Outra forma usando arrow function

// Podemos passar também funções para dentro do forEach que serão executadas para cada elemento

const exibirAprovados = aprovado => console.log(aprovado);

aprovados.forEach(exibirAprovados);