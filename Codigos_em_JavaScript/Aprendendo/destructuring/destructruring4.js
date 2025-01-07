// Dessa vez substituindo as chaves por couchetes 
// será passado um array para dentro de uma função para a desestruturação 

function rand([min = 0, max = 1000]) {// desestruturando um array e passando para uma função. Os limites definidos são padrões 
    if (min > max) {
        [min, max] = [max, min] // invertendo limites de um array
    }
    const valor = Math.random() * (max - min) + min;
    return Math.floor(valor)
}

console.log(rand([60, 40]));// passando um primeiro o maxim e depois o minimo 
console.log(rand([990]));// somente o minimo
console.log(rand ([, 100]));// somente o segundo valor 
console.log(rand([])); // Valores padrões