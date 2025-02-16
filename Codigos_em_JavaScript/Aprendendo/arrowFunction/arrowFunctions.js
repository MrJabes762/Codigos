// Comparação de parâmetros para ver se é estritamente igual ao parâmetro passado
// Esse exemplo é para mostrar a comparação entre escopos e validar verdadeiro ou falso

let comparaComThis = function(param) {
    console.log(this === param);
};

comparaComThis(global);
comparaComThis(this);

const obj = {};
comparaComThis = comparaComThis.bind(obj);
comparaComThis(global);
comparaComThis(obj);

// Se fizermos uma arrow function, o this não apontará para o global e sim para o contexto da execução
let comparaComThisArrow = param => console.log(this === param);

comparaComThisArrow(global);
comparaComThisArrow(module.exports);
comparaComThisArrow(this);

comparaComThisArrow = comparaComThisArrow.bind(obj);
comparaComThisArrow(obj);
comparaComThisArrow(module.exports);