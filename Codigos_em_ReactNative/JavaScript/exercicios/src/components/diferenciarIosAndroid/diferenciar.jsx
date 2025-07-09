import React from "react";
import { View, Text, Platform } from "react-native";
import estiloPadrao from "../Multi/estiloPadrao";

export default (props) => {
  if (Platform.OS === "android") {
    return <Text style={estiloPadrao.textoGrande}> Android </Text>;
  } else if (Platform.OS === "ios") {
    return <Text style={estiloPadrao.textoGrande}> iOS </Text>;
  } else if (Platform.OS === "web") {
    return <Text style={estiloPadrao.textoGrande}> Web </Text>;
  } else {
    return <Text style={estiloPadrao.textoGrande}> Outro </Text>;
  }
};
