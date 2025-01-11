//Funções anônimas são funções sem nome 

const soma = function (a,b){
    return a + b;
}

const subtracao = function (a,b){
    return a-b;
}

// detalhe é que quando se passa algo pela fução há a determinação de um valor padrão 
const imprimirResutado = function (a, b, operacao = soma){// atribuindo uma função dentro da outra passando os parametros
    console.log(operacao(a,b));
}
imprimirResutado(2,3);
imprimirResutado(2,3,soma);
imprimirResutado(2,3,subtracao);
imprimirResutado(2,3, function(a,b){// passando uma função declarada na hora
    return a * b;
})
imprimirResutado(2,3, (a,b) => a/b);// uma Arrow function reduzida

const pessoa = {
    falar: function (){// acessando uma função dentro de um atributo de um objeto 
        console.log('Opa');
    }
}

pessoa.falar();