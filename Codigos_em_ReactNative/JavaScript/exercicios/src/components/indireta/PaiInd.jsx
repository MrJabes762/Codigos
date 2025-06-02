import React from "react";
import Filho from "./Filho";
import { Text } from "react-native";
import estiloPadrao from "../Multi/estiloPadrao";

export default (props) => {
  const [valor, setValor] = React.useState(0);
  const [texto, setTexto] = React.useState("");
  function exibirvalor(numero, texto) {
    setValor(numero);
    setTexto(texto);
  }
  return (
    <>
      <Text style={estiloPadrao.textoGrande}>
        {texto} {valor}
      </Text>
      {/*Aqui nos temos 2 tipos de comunicação: 
        direta passando min e max para o filho 
        e indireta passando a função exibirvalor para o filho
      */}
      <Filho min={props.inicial} max={props.final} funcao={exibirvalor} />
    </>
  );
};
