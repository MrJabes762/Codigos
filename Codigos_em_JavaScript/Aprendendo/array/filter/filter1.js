// Sempre que for transformar um array em outro array com a mesma quantidade de elementos, porém com os elementos filtrados, usamos o filter.
// Sempre que for transformar um array em outro array com a mesma quantidade de elementos, porém com os mesmos elementos, usamos o map (alterados ou não).


export const produtos = [
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
let produtosCaros = produtos.filter(function(p){
    return p.preco > 1000;
});

console.log(produtosCaros);

// Outro exemplo
// Filtrando os produtos que são frágeis

let produtosFragil = produtos.filter(function(p){
    return p.fragil == true;
});

console.log(produtosFragil);

// Outro exemplo
// Criando uma função para filtrar os produtos que são copos

const copos = produto => produto.nome.includes("Copo");// O método includes() determina se uma matriz contém um determinado elemento, retornando true ou false apropriadamente.


let produtosCopos = produtos.filter(copos);

console.log("Produtos Copos",produtosCopos);

// Outro exemplo
// Filtrando os produtos que são baratos

let produtosBaratos = produtos.filter(function(p){
    return p.preco < 90
});

console.log(produtosBaratos);

// Outro exemplo
// Filtrando os produtos que são baratos e não são frágeis
const produtosNaoFragil = produto => {
    if (produto.fragil == false) {
        console.log(produto);
        return produto.fragil == false;
    }
};
const funcaoBaratoNaoFragil = produto => produto.preco < 18;
let produtosBaratosDosNaoFragil = produtos.filter(produtosNaoFragil).filter(funcaoBaratoNaoFragil);

console.log("Produtos Baratos e Não Frageis menor que 18 ", produtosBaratosDosNaoFragil);

// Outro 
// Filtrando os produtos que são Caneta e baratos

const produtosCanetaBaratos = produto => produto.preco < 1000 && produto.nome.includes("Caneta");

let produtosCanetaBaratosFiltrados = produtos.filter(produtosCanetaBaratos);

console.log("Produtos Caneta Baratos", produtosCanetaBaratosFiltrados);