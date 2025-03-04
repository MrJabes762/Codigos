Array.prototype.filter2 = function(callback){
    let novoArray = [];
    for (let index = 0; index < this.length; index++) {
       if (callback(this[index], index, this)){
            novoArray.push(this[index]);
       }
    }
    return novoArray;
}

const produtos = [
    { nome: 'Notebook', preco: 2499, fragil: true },
    { nome: 'Ipad Pro', preco: 4199, fragil: true },
    { nome: 'Copo de Vidro', preco: 12.49, fragil: true },
    { nome: 'Copo de Plástico', preco: 18.99, fragil: false },
    { nome: 'Caneta', preco: 7.50, fragil: false },
    { nome: 'Caderno', preco: 18.99, fragil: false },
    { nome: 'Kit de Lápis', preco: 41.22, fragil: true },
    { nome: 'Borracha', preco: 3.45, fragil: false },
    { nome: 'Estojo', preco: 12.99, fragil: false },
    { nome: 'Mochila', preco: 89.99, fragil: false },
    { nome: 'Lápis', preco: 1.99, fragil: false },
    { nome: 'Caneta Bic', preco: 2.99, fragil: false },
    { nome: 'Caneta Pilot', preco: 3.99, fragil: false },
    { nome: 'Caneta Stabilo', preco: 4.99, fragil: false },
    { nome: 'Caneta Compactor', preco: 5.99, fragil: false },
    { nome: 'Caneta Faber Castell', preco: 6.99, fragil: false },
    { nome: 'Caneta Crown', preco: 7.99, fragil: false },
    { nome: 'Caneta Crown', preco: 8.99, fragil: false },
    { nome: 'Caneta Crown', preco: 9.99, fragil: false },
    { nome: 'Caneta Crown', preco: 10.99, fragil: false },
    { nome: 'Caneta Crown', preco: 11.99, fragil: false },
    { nome: 'Caneta Crown', preco: 12.99, fragil: false },
    { nome: 'Caneta Crown', preco: 13.99, fragil: false },
    { nome: 'Caneta Crown', preco: 14.99, fragil: false },
    { nome: 'Caneta Crown', preco: 15.99, fragil: false },
    { nome: 'Caneta Crown', preco: 16.99, fragil: false },
    { nome: 'Caneta Crown', preco: 17.99, fragil: false },
    { nome: 'Caneta Crown', preco: 18.99, fragil: false },
    { nome: 'Caneta Crown', preco: 19.99, fragil: false },
    { nome: 'Caneta Crown', preco: 20.99, fragil: false },
    { nome: 'Caneta Crown', preco: 21.99, fragil: false },
    { nome: 'Caneta Crown', preco: 22.99, fragil: false },
    { nome: 'Caneta Crown', preco: 23.99, fragil: false },
    { nome: 'Caneta Crown', preco: 24.99, fragil: false },
    { nome: 'Caneta Crown', preco: 25.99, fragil: false },
    { nome: 'Caneta Crown', preco: 26.99, fragil: false },
];

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