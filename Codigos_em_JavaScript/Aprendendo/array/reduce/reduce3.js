import { alunos } from "./reduce1";

Array.prototype.reduce2 = function(callback,valorInicial){
    const indiceInicial = valorInicial ? 0 : 1
    let acumulador = valorInicial || this[0]
    for (let index = indiceInicial; index < this.length; index++) {
        acumulador = callback(acumulador,this[index],index, this);
    }
    return acumulador;
};

const alunosBolsas = aluno => aluno.bolsista;
const todosBolsistas = (resultado, bolsista) => resultado && bolsista;

let alunosBolsasQtdDeAlunosBolsistasESeTodosSaoBolsistas = alunos.map(alunosBolsas).reduce2(todosBolsistas, true);

console.log(alunosBolsasQtdDeAlunosBolsistasESeTodosSaoBolsistas)