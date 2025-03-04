// Nessa parte teremos a reescrita do método forEach definindo o nosso comportamento

import { aprovados } from "./foreach1";

// O prototype "injeta" no Array o forEach2 para ser identificado, algo semelhante ao @Override do Java
Array.prototype.forEach2 = function(callback) {
    for (let i = 0; i < this.length; i++) { // O this está pegando a referência do objeto que for chamado
        callback(this[i], i, this); // O primeiro retorna o elemento, o segundo o índice percorrido e o terceiro o próprio array referenciado
    }
}

aprovados.forEach2(function(nome, indice, array) { // Percorrendo o array e imprimindo o nome e o índice
    console.log(`${indice + 1}) ${nome}`);
    console.log(array); // Podemos imprimir o próprio array
});
