// Herança

class Avo {
    constructor(sobrenome) {
        this.sobrenome = sobrenome;
    }
}

class Pai extends Avo {
    constructor(nome, sobrenome, profissao = 'Professor') {
        super(sobrenome);
        this.nome = nome;
        this.profissao = profissao;
    }
}

class Filho extends Pai {
    constructor() {
        super('Alex', 'Silva');
    }
}

const filho = new Filho();
console.log(filho);