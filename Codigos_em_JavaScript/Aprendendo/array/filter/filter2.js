import { produtos } from "./filter1";

// Filtrando os produtos que são caros

const produtosCaros = produto => produto.preco > 15;

// Filtrando os produtos que são frágeis

const produtosNaoFragil = produto => produto.fragil == false;

// Criando uma função para filtrar os produtos que são copos

const produtosCaneta = produto => produto.nome.includes('Caneta');

let produtosCanetaNaoFragilCaros = produtos.filter(produtosCaros).filter(produtosNaoFragil).filter(produtosCaneta);

console.log(produtosCanetaNaoFragilCaros);

// Calculando a média dos preços dos produtos filtrados sem usar reduce
let valorTotal = 0;
for (let i = 0; i < produtosCanetaNaoFragilCaros.length; i++) {
    valorTotal += produtosCanetaNaoFragilCaros[i].preco;
}

console.log("Valor total dos produtos filtrados:", valorTotal);

let media = valorTotal / produtosCanetaNaoFragilCaros.length;

console.log("Média dos preços dos produtos filtrados:", media);

// Calculando a média dos preços dos produtos sem Reduce e com ForEach

valorTotal = 0;

produtosCanetaNaoFragilCaros.forEach(produto => valorTotal += produto.preco);

console.log("Valor total dos produtos filtrados com ForEach:", valorTotal);

media = valorTotal / produtosCanetaNaoFragilCaros.length;

console.log("Média dos preços dos produtos filtrados com ForEach:", media);
