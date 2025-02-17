
const carrinho = [//Aspas simples delimitam strings como todo, cada atributo é delimitado por aspas duplas
    '{"nome": "Borracha", "preco": 3.45}',
    '{"nome": "Caderno", "preco": 13.90}',
    '{"nome": "Kit de lápis", "preco": 41.22}',
    '{"nome": "Caneta", "preco": 7.50}'
]

// Retornar um array apenas com os preços

let precos = carrinho.map(function(e) {
    return JSON.parse(e).preco; //O método JSON.parse() analisa uma string JSON, construindo o valor ou objeto JavaScript descrito pela string
});

console.log(precos);//[ 3.45, 13.9, 41.22, 7.5 ]

// Outra forma

//Primeiro ele converte para objeto e depois pega o preço por uma função arrow anonima 
const paraObjeto = json => JSON.parse(json);

const precos2 = carrinho.map(paraObjeto).map(function(e) {
    return e.preco;
});

console.log(precos2);//[ 3.45, 13.9, 41.22, 7.5 ]

//Outra forma

const paraObjeto2 = json => JSON.parse(json);
const apenasPreco = produto => produto.preco;

const resultado = carrinho.map(paraObjeto2).map(apenasPreco);// De forma encadeada ele converte para objeto e depois pega o preço

console.log(resultado);//[ 3.45, 13.9, 41.22, 7.5 ]

// Outra forma para pegar o nome

const paraObjeto3 = json => JSON.parse(json);
apenasNome = produto => produto.nome;

const resultado2 = carrinho.map(paraObjeto3).map(apenasNome);
console.log(resultado2);//[ 'Borracha', 'Caderno', 'Kit de lápis', 'Caneta' ]