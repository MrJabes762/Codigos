import React from "react";
import { Text, TouchableOpacity, Button } from "react-native";
import { stylesBotao } from "./stylesBotao";

export default (props) => {
  function acao() {
    console.warn("Ação do botão 1");
  }
  const executar4 = () => {
    console.warn("Ação do botão 4");
  }
  return (
    <>
      <Button
        title="Clique Aqui 1"
        onPress={acao} // se eu chamar a função acao sem os parênteses, ela não será executada imediatamente, mas sim quando o botão for pressionado
      />
      <Button
        title="Clique Aqui 2"
        onPress={function () {
          // Criando uma função anonima diretamente no onPress
          console.warn("Ação do botão 2");
        }}
      />
      <Button
        title="Clique Aqui 3"
        onPress={() => {
          // Criando uma Arrow Function diretamente no onPress
          console.warn("Ação do botão 3");
        }}
      />
      <Button
        title="Clique Aqui 4"
        onPress={executar4} // Chamando uma uma Arrow Function no onPress
      />
    </>
  );
};
