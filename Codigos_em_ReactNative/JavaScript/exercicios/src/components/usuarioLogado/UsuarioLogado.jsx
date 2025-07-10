import React from "react";
import { View, Text } from "react-native";
import estiloPadrao from "../Multi/estiloPadrao";
import If from "../if/if";

export default props => {
  const usuario = props.usuario || {};
  
  return (
    <>
    {/*Se o usuario for válido e seus atributos existirem ele renderiza*/}
    <If test = {usuario && Object.keys(usuario).length > 0}>
      <Text style={estiloPadrao.textoGrande}>
        Olá {usuario.nome} {usuario.sobrenome}!
        Seu email é: {usuario.email}
      </Text>
    </If>
    </>
  );
};
