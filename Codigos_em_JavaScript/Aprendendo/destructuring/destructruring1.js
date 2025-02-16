// Novo recurso do ES2015

const pessoa = { // Criação de um objeto literal
    nome: 'Julia',
    idade: 13,
    endereco: {
        logradouro: 'Rua da Mata',
        numero: 100,
        bairro: 'Elevator'
    }
}

const { nome, idade } = pessoa; // As chaves são os operadores de desestruturação
// Nesse método eu desestruturo o objeto extraindo somente o que eu preciso do objeto

console.log(nome, idade);

// Outra forma de extrair
/* Nessa forma a lógica é a mesma, porém dessa vez eu crio duas variáveis para chave valor, em que o nome e a idade
 são da estrutura e eu atribuo às variáveis que eu criei e depois trabalho em cima delas */
const { nome: n, idade: i } = pessoa;

console.log(n, i);

// Em caso de não existir o atributo no meu objeto
// Nesse caso o primeiro atributo vai dar undefined por não conter na minha estrutura do objeto
// o outro não faz parte do escopo, porém é como se eu criasse e atribuísse ela
const { sobrenome, humor = true } = pessoa;

console.log(sobrenome, humor);

// Para acessar o objeto dentro de outro objeto
// Chamo na mesma estrutura buscando as informações
const { endereco: { logradouro, numero, bairro } } = pessoa;

console.log(logradouro, bairro, numero);