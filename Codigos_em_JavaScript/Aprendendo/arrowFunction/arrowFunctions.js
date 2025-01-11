//Comparação de parametros para ver se é estritamente igual ao parametro passado 
//Esse exempl é pra mostrar a comparaçao entre escopos e validar verdadeiro ou falso

let comparaComTHis = function (param) {
    console.log(this === param);
};

comparaComTHis(global);
comparaComTHis(this);

const obj = {};
comparaComTHis = comparaComTHis.bind(obj);
comparaComTHis(global);
comparaComTHis(obj);

// Se fizemos uma function o this não apotará para o clobal e sim para o contexto da execução 
let comparaComTHisArrow = param => console.log(this === param);

comparaComTHisArrow(global);
comparaComTHisArrow(module.exports);
comparaComTHisArrow(this);

comparaComTHisArrow = comparaComTHisArrow.bind(obj);
comparaComTHisArrow(obj);
comparaComTHisArrow(module.exports);