// nessa parte teremos a reescrita do metodo forEach definindo o nosso comportamento
// O prototype "injeta" em no Array o foreach2 para ser identificada algo semelhante ao @Ovewired do Java
Array.prototype.forEach2 = function (callback){
    for (let i = 0; i < this.length; i++){// o this ta pegando a referencia do objeto que for chamado 
        callback(this[i], i, this);// o primeiro retorna o elemento , o segundo o indice percorrido e o terceiro o proprio array referenciado
    }
}

const aprovados = ['luiz', 'lsSantos', 'Elivaldo','Fernando'];

aprovados.forEach2(function(nome, indice, array) {// Percorrendo o Array imprimindo o nome e o indice 
    console.log (`${indice + 1} ) ${nome}`);
    console.log(array);// podemos imprimir o proprio array e passarmos a propria declaração 'array'
});