const quaseArray = { 0: 'Lucas', 1: 'Jão', 2: 'Duarda' }; // um objeto com tais atributos
console.log(quaseArray);

Object.defineProperty(quaseArray, 'toString', { // definindo um comportamento para o toString desse objeto
    value: function() {
        return Object.values(this);
    },
    enumerable: false
});

console.log(quaseArray[0]);

const meuArray = ['Lucas', 'Jão', 'Duarda'];

console.log(quaseArray.toString(), meuArray); // chamando o método toString, o comportamento do objeto é o mesmo do array criado

