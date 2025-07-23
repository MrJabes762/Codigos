import React from "react";
import { View, Text } from "react-native";
import { styleNumero } from "./styleNumero";

export default (props) => {
  return (
    <>
      <View style = {styleNumero.ViewNumero}>
        <Text style = {styleNumero.textoMap}>
            {props.index + 1} = {props.numero}
        </Text>
      </View>
    </>
  );
};
