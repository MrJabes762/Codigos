import React from "react";
import { View, Text } from "react-native";
import { stylesFlexboxV4 } from "./styleFlexboxV4";

export default (props) => {
  return (
    <View style={stylesFlexboxV4.container}>
      <View style={stylesFlexboxV4.v0}/>
      <View style={stylesFlexboxV4.v1}/>
      <View style={stylesFlexboxV4.v2}/>
    </View>
  );
};
