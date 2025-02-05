const aprovados = ['luiz', 'lsSantos', 'Elivaldo','Fernando'];

//O forEach, semelhante modo ao for, percorre todos os elementos do Array afim de executar alguma instrução 
//È um loop de repetição mais coeso 

aprovados.forEach(function(nome, indice, array) {// Percorrendo o Array imprimindo o nome e o indice 
    console.log (`${indice + 1} ) ${nome}`);
    console.log(array);// podemos imprimir o proprio array e passarmos a propria declaração 'array'
})

console.log (aprovados);// como um array é exibido 

aprovados.forEach((indice,nome) => console.log(indice + 1, nome))// outra forma usando AeroFunction


//Podemos passar tambem funções para dentro do forEach que serão executadas para cada elemento

const exibirAprovados = aprovado => console.log (aprovado);

aprovados.forEach(exibirAprovados);