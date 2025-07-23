import React from "react";
import { View, Text } from "react-native";
import estiloPadrao from "../Multi/estiloPadrao";
import { stylesContadorDisplay } from "./styleContadorDisplay";

export default (props) => {
  return (
    <View style={stylesContadorDisplay.Display}>
      <Text
        style={[estiloPadrao.textoGrande, stylesContadorDisplay.DisplayTexto]}
      >
        Olá {props.nome}, o valor do contador é {props.valor}
      </Text>
    </View>
  );
};
