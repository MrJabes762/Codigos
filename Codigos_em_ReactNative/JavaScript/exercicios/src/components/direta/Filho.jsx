import React from "react";
import { View, Text } from "react-native";
import estiloPadrao from "../Multi/estiloPadrao";

export default (props) => {
  return (
    <>
      <Text style={estiloPadrao.textoGrande}>{props.x}</Text>
      <Text style={estiloPadrao.textoGrande}>{props.y}</Text>
    </>
  );
};
