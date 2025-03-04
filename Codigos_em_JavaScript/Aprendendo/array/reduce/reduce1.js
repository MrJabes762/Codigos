// O reduce é uma função que transforma um array em um unico elemento (pode ser um string, um array, um numero, uma letra...).

// Por parametro, nos teremos acumulador que será chamado de execução em execução somando uma iteração a outra.

// O que será acumulado vai depender do segundo parametro comumente chamado de indice ou valor atual.

// O resultado da primeira iteração é passado para a segunda iteracao e assim por diante até o limite do array.

let alunos = [
    {nome: 'Lucas', nota:8.1, bolsista:false},
    {nome: 'João', nota:9, bolsista:false},
    {nome: 'Carlos', nota:8, bolsista:false},
    {nome: 'Maria', nota:4.1, bolsista:false},
    {nome: 'Fernado', nota:8.9, bolsista:false},
    {nome: 'Elisvald', nota:5, bolsista:false},
    {nome: 'Juriscleison', nota:6.5, bolsista:false},
    {nome: 'Creusa', nota:8, bolsista:true},
    {nome: 'Oswald', nota:1, bolsista:false},
    {nome: 'Joeslinton', nota:7, bolsista:false},
    {nome: 'SugiroKimemamy', nota:6.9, bolsista:true},
    {nome: 'PythonÈMeuOvo', nota:7.8, bolsista:true},
    {nome: 'Schopenhauer', nota:3.5, bolsista:true},
    {nome: 'TacaMaePraVerSeQuica', nota:5.9, bolsista:true}
]

let resuldato = alunos.map (a => a.nota).reduce(function(acumulador,atual, indice){
    console.log(indice," - ",acumulador,atual);
    return acumulador + atual;
}, 5);// o segundo valor é valor inicial da iteracao 

const media = resuldato/alunos.length;

console.log(" Resultado = ",resuldato);

console.log(" Média = ", media);



