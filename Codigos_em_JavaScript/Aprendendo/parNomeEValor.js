// par nome valor || chave e valor
const saudacao = 'Opa'; // Ela é definida em um contexto léxico - local / escopo físico em que a variável foi definida
console.log(saudacao); // se fosse um var o valor poderia ser sobrescrito

function exec() {
    const saudacao = 'De novo'; // contexto restrito / escopo local - apenas na função
    return saudacao;
}

// Embora ambas possuam a mesma declaração, por estarem em contextos diferentes não atrapalham o funcionamento
console.log(exec());

const cliente = { // Criando um objeto na notação literal de objetos (formato JSON)
    nome: 'Eu',
    idade: 35,
    estadoCivil: 'Solteiro',
    endereco: { // Outro objeto dentro de outro objeto (uma composição)
        rua: 'Rua Eufrasina Couto',
        bairro: 'Salgadeira',
        numero: '150 A',
        estado: 'Bahia'
    }
}

console.log(cliente);