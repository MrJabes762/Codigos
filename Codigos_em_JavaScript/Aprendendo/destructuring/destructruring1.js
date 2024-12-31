// Novo Recursos do ES2015

const pessoa = {// Criação de um objeto literal
    nome: 'Julia',
    idade: 13,
    endereco:{
        logradouro:'Rua da Mata ',
        numero:100,
        bairro:'Elevator'
    }
}

const { nome , idade} = pessoa; // As chaves são os operadores de desestruturação 
// nesse método  eu desestruturo o objeto extraindo somente o que eu preciso do objeto

console.log(nome, idade);

// Outra forma de extrair 
/* Nessa forma a logica é a mesma porem dessa vez eu crio duas variaveis par chave valor, em que o nome e a idade 
 é da estrutura e o e atrubuo ás variaveis que eu criei e depois trabalho em cima delas  */
const { nome: n, idade: i } = pessoa;

console.log(n, i);

// em caso de não existir o atributo no meu objeto
// Nesse caso o primeiro atributo vai dar udefined por não conter na minha estrutura do objeto 
// o outro não faz parte do escopo porem é como se eu crisse e atribuiss ela 
const { sobrenome, humor = true} = pessoa;

console.log (sobrenome, humor);

// Para acessaro Objeto dentro de outro objeto
// Chamo na mesma estrutura buscando as informações 
const { endereco: {logradouro, numero, bairro}} = pessoa;

console.log(logradouro,bairro,numero)