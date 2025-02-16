// Funções anônimas são funções sem nome

const soma = function(a, b) {
    return a + b;
}

const subtracao = function(a, b) {
    return a - b;
}

// Detalhe é que quando se passa algo pela função há a determinação de um valor padrão
const imprimirResultado = function(a, b, operacao = soma) { // atribuindo uma função dentro da outra passando os parâmetros
    console.log(operacao(a, b));
}

imprimirResultado(2, 3);
imprimirResultado(2, 3, soma);
imprimirResultado(2, 3, subtracao);
imprimirResultado(2, 3, function(a, b) { // passando uma função declarada na hora
    return a * b;
});
imprimirResultado(2, 3, (a, b) => a / b); // uma arrow function reduzida

const pessoa = {
    falar: function() { // acessando uma função dentro de um atributo de um objeto
        console.log('Opa');
    }
}

pessoa.falar();