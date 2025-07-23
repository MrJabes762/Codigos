import React from "react";
import { View, Text } from "react-native";
import estiloPadrao from "../Multi/estiloPadrao";

export default ({ props = 0 }) => {
  return (
    <>
      <View>
        <Text style={estiloPadrao.textoGrande}>O Resultado é: </Text>
        {props % 2 === 0 ? (
          <Text style={estiloPadrao.textoGrande}>Par</Text>
        ) : (
          <Text style={estiloPadrao.textoGrande}>Impar</Text>
        )}
      </View>
    </>
  );
};
