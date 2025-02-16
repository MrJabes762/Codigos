function Pessoa() {
    this.idade = 0;

    setInterval(function() { // a função setInterval executa uma função dentro de um intervalo de tempo
        this.idade++;
        console.log(this.idade);
    }.bind(this), 1000); // sem o bind ele não identificaria o valor da variável do objeto em execução
}

new Pessoa();