const pessoa = {
    saudacao: 'Bom dia',
    falar() { // novo recurso do ES6 que permite criar funções dentro de objetos dessa forma
        console.log(this.saudacao);
    }
}

pessoa.falar(); // no momento da execução a palavra impressa é 'Bom dia' por conta de ser o texto declarado em tempo de execução
const falar = pessoa.falar;
falar(); // na tentativa de armazenar uma função em uma variável há um conflito entre paradigmas funcionais e orientados a objetos
// uma vez que, a função não é chamada a partir do contexto de pessoa

// Nesse caso usamos o bind
const falarDePessoa = pessoa.falar.bind(pessoa); // passando o objeto do qual se referencia para mostrar a função
falarDePessoa();