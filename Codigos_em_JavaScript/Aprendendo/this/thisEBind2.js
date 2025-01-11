function Pessoa (){
    this.idade = 0;

    setInterval(function(){// a function set Interval executa uma dunção dentro de um intervalo de tempo
        this.idade++;
        console.log(this.idade);
    }.bind(this),1000);// sem o bind ele não identificaria o valor da variavel do objeto em execução 
}

new Pessoa();