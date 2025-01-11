//Arrow Functins são funções anônimas  para chama-las sempre é preciso armazenar em uma variável 
/* sua lógica é algo semelhante a uma expressão Lambda do Java exemplo:
// getBotao.setOnClickListenner ( v -> salvarInformacoes (dados) );
 em vez de: 
 getBotao.setOnclickListenner (
    @Override
     public void onClick (v) {
        salvarInforacoes (dados);
     }
 );*/

let dobro = function (a){// versão normal
    return 2*a;
}

dobro = (a) => {// reduzida
    return 2*a;
}

dobro = a => 2 *a;// mais reduzida quando se tem um unico parametro. O return está implicito

console.log (dobro(Math.PI));

let ola = function () {// quando se coloca o bloco com chave é esperado ter um return associado a função 
    return 'Olá';// se não ouver isso é undefined
}

console.log (ola);

ola = () => 'Ola'

console.log (ola);

console.log (ola());
