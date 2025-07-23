import React from "react";
import { View, Text } from "react-native";
import { stylesFlexboxV3 } from "./styleFlexboxV3";
import Quadrado from "../Quadrado";

export default (props) => {
  return (
    <View style={stylesFlexboxV3.container}>
      <Quadrado />
      <Quadrado cor={"red"} />
      <Quadrado cor={"#0F0"} />
      <Quadrado cor={"#00F"} />
      <Quadrado cor={"#009"} />
      <Quadrado cor={"#900"} />
      <Quadrado cor={"#090"} />
    </View>
  );
};
