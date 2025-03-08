// Desafio 1: Todos alunos são bolsistas 

import { alunos } from "./reduce1";

const alunosBolsas = aluno => aluno.bolsista;
const todosBolsistas = (resultado, bolsista) => resultado && bolsista;

let alunosBolsasQtdDeAlunosBolsistasESeTodosSaoBolsistas = alunos.map(alunosBolsas).reduce(todosBolsistas, true);

console.log("Tamanho do array ",alunos.length);

console.log ("Todos os alunos são bolsistas ? ", alunosBolsasQtdDeAlunosBolsistasESeTodosSaoBolsistas);

// Desafio 2: Algum aluno é bolsista?

const algumBolsista = (resultado, bolsista) => resultado || bolsista;

let peloMenosAlgumAlunoEBolsita = alunos.map(alunosBolsas).reduce(algumBolsista, false);

console.log("Pelo menos algum aluno é Bolsista ?", peloMenosAlgumAlunoEBolsita);