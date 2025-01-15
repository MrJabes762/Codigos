class Lancamento {
    constructor(nome = 'Generico', valor = 0){
        this.nome = nome;
        this.valor = valor;
    }
}

class CicloFinanceiro {
    constructor(mes,ano){
        this.mes = mes;
        this.ano = ano;
        this.lancamentos = [];
    }
    
    addLancamentos(...lancamentos){ // receber um ou mais elementos do mesmo array contendotributos varios a
        lancamentos.forEach(l => this.lancamentos.push(l));
    }

    sumario(){
        let valorConsolidado = 0;
        this.lancamentos.forEach(l => {
            valorConsolidado += l.valor;
        });
        return valorConsolidado;
    }
}

const salario = new Lancamento('Salario', 60000);
const contaDeAgua = new Lancamento ('Agua', -300);

const contas = new CicloFinanceiro (6, 2019);

contas.addLancamentos(salario,contaDeAgua);
console.log(contas.sumario())