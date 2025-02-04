const quaseArray = { 0: 'Lucas', 1:'Jão', 2:'Duarda'}// um objetos com tais atributos
console.log(quaseArray);

Object.defineProperty(quaseArray,'toString', {//definindo um comportamento para o to String desse Objeto
    value: function() {
        return Object.values(this);
    },
    enumerable:false
});

console.log(quaseArray[0]);

const meuArray = ['Lucas','Jão','Duarda'];

console.log(quaseArray.toString(),meuArray);// chamando o método to string o comportamento do objeto é o mesmo do array criado

