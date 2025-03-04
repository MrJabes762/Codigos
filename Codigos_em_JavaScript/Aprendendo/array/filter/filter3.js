import { produtos } from "./filter1";

Array.prototype.filter2 = function(callback){
    let novoArray = [];
    for (let index = 0; index < this.length; index++) {
       if (callback(this[index], index, this)){
            novoArray.push(this[index]);
       }
    }
    return novoArray;
}

// Filtrando os produtos que são caros

const produtosCaros = produto => produto.preco > 15;

// Filtrando os produtos que são frágeis

const produtosNaoFragil = produto => produto.fragil == false;

// Criando uma função para filtrar os produtos que são copos

const produtosCaneta = produto => produto.nome.includes('Caneta');

console.log(produtos
    .filter2(produtosCaros)
    .filter2(produtosNaoFragil)
    .filter2(produtosCaneta)
);