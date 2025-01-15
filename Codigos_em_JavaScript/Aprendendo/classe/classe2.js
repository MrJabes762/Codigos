//Herança

class Avo {
    constructor(sobrenme){
        this.sobrenme = sobrenme;
    }
}

class Pai extends Avo {
    constructor(nome, sobrenme, profissao = 'Professor'){
        super(sobrenme);
        this.nome = nome;
        this.profissao = profissao;
    }
}

class Filho extends Pai {
    constructor(){
        super('Alex', 'Silva')
    }
}

const filho = new Filho();
console.log(filho);