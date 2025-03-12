import { alunos } from "./reduce/reduce1";

// Imperativo - Menos reutilização de código, realiza mais passos: busca da nota e reliza atribuicao + soma
let total1 = 0;
for (let i = 0; i < alunos.length; i++){
    total1 += alunos[i].nota;
}
console.log(total1/alunos.length);

// Declarativo - Mais reutilização de código, cada função pode ser reutilizada em outros contextos
const getNota = aluno => aluno.nota;
const soma = (total, atual) => total + atual;

const total2 = alunos.map(getNota).reduce(soma);
console.log(total2/alunos.length);

