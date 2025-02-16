// Arrow Functions são funções anônimas. Para chamá-las, sempre é preciso armazenar em uma variável
/* Sua lógica é algo semelhante a uma expressão Lambda do Java, exemplo:
// getBotao.setOnClickListener(v -> salvarInformacoes(dados));
 em vez de: 
 getBotao.setOnClickListener(
    @Override
     public void onClick(v) {
        salvarInformacoes(dados);
     }
 );*/

let dobro = function(a) { // versão normal
    return 2 * a;
}

dobro = (a) => { // reduzida
    return 2 * a;
}

dobro = a => 2 * a; // mais reduzida quando se tem um único parâmetro. O return está implícito

console.log(dobro(Math.PI));

let ola = function() { // quando se coloca o bloco com chave é esperado ter um return associado à função
    return 'Olá'; // se não houver isso, é undefined
}

console.log(ola);

ola = () => 'Olá';

console.log(ola);
console.log(ola());
