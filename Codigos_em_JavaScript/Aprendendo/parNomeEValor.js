// par nome valor || Chave e valor 
const saudacao = 'Opa'; // ELa é definida em um contexto lexico - local / escopo  fisico em que a variavel foi definida 
console.log (saudacao); // se fosse um var o valor poderia ser sobrescrito 

function exec (){
    const saudacao = 'De novo'; // contexto restrito / escopo local - apenas na função 
    return saudacao;
}

// Embora ambas possuam a mesma declaração por estarem em contextos diferentes não atrapalham o funcionamento 
console.log (exec());

const cliente = {//Criando um objeto na notação literal de Objetos (formato JSON)
    nome: 'Eu',
    idade: 35,
    estadoCivil: 'Solticio',
    endereco: {// Outro Ovjeto dentro de outro Objeto (Uma composição)
        rua:'Rua Eufrasina Couto',
        bairro: 'Salgadeira',
        numero:'150 A',
        estado: 'Bahia'
    }
}

console.log(cliente)