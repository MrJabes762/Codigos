import { carrinho } from "./map2";

Array.prototype.map2 = function(callback) {
    const novoArray = [];
    for (let i = 0; i < this.length; i++) {
        novoArray.push(callback(this[i],i,this));
    }
    return novoArray;
}

// Retornar um array apenas com os preços

let precos = carrinho.map2(function(e) {
    return JSON.parse(e).preco;
});
console.log(precos); 