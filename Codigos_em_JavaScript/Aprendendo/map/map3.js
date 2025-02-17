
Array.prototype.map2 = function(callback) {//Aqui estamos criando uma função map2 que é um método de Array
    const novoArray = [];
    for (let i = 0; i < this.length; i++) {
        novoArray.push(callback(this[i],i,this));
    }
    return novoArray;
}

const carrinho = [//Aspas simples delimitam strings como todo, cada atributo é delimitado por aspas duplas
    '{"nome": "Borracha", "preco": 3.45}',
    '{"nome": "Caderno", "preco": 13.90}',
    '{"nome": "Kit de lápis", "preco": 41.22}',
    '{"nome": "Caneta", "preco": 7.50}'
];

// Retornar um array apenas com os preços

let precos = carrinho.map2(function(e) {
    return JSON.parse(e).preco; //
});
console.log(precos); 