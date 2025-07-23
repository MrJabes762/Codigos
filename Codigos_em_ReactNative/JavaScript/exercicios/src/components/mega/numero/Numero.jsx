import React from "react";
import { View, Text } from "react-native";
import { styleNumero } from "./styleNumero";

export default ({index , numero}) => {
  return (
    <>
      <View style = {styleNumero.ViewNumero}>
        <Text style = {styleNumero.textoMap}>
            {index + 1} = {numero}
        </Text>
      </View>
    </>
  );
};
