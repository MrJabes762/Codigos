import React from "react";
import { Button } from "react-native";

export default (props) => {
  // O componente Filho recebe as propriedades min, max e funcao do PaiInd
  // E gerar um número aleatório entre min e max quando o botão é pressionado
  function gerarNumero(min, max) {
    const fator = max - min + 1;
    return parseInt(Math.random() * fator) + min;
  }
  // Aqui acontece o evento de callback, onde a função passada pelo PaiInd é chamada com o número gerado e uma mensagem
  return (
    <>
      <Button
        title="Executar"
        onPress={function () {
          const n = gerarNumero(props.min, props.max);
          props.funcao(n, 'O número gerado foi:');
        }}
      />
    </>
  );
};
