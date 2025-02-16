// Nesse exemplo será criada uma função que receberá um objeto já pronto com esses valores
function rand({ min = 0, max = 1000 }) { // definindo valores padrões
    console.log(min, max);
    const valor = Math.random() * (max - min) + min;
    return Math.floor(valor);
}

console.log(rand({ max: 100, min: 40 })); // daquele intervalo solicitado no rand eu pego um menor ainda através de um objeto
// Outras formas
const obj = { max: 10, min: 8 }; // criando um objeto e passando para dentro
console.log(rand(obj));
console.log(rand({ min: 990 }));
console.log(rand({}));