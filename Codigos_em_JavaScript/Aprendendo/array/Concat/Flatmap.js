Array.prototype.flatMap = function(callback) {
    return Array.prototype.concat.apply([], this.map(callback));// apply é uma função que recebe 2 parametros, o primeiro é o this que é o array que chamou a função, e o segundo é o array que será concatenado
}
const escoola = [{
    nome: 'Turma M1',
    alunos: [{
        nome: 'Gustavo',
        nota: 8.1
    }, {
        nome: 'Ana',
        nota: 9.3
    }]
}, {
    nome: 'Turma M2',
    alunos: [{
        nome: 'Rebeca',
        nota: 8.9
    }, {
        nome: 'Roberto',
        nota: 7.3
    }]
}];
const getNotaDoAluno = aluno => aluno.nota;
const getNotasDaTurma = turma => turma.alunos.map(getNotaDoAluno); 
const notas1 = escoola.map(getNotasDaTurma);
console.log(notas1);

const notas1Flatmap = escoola.flatMap(getNotasDaTurma);
console.log(notas1Flatmap);