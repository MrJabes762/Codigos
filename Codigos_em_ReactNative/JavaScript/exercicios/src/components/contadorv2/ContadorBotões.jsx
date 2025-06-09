import { TouchableOpacity, View, Text } from "react-native";
import React from "react";
import { stylesContadorBotões } from "./styleContadorBotões";
import estiloPadrao from "../Multi/estiloPadrao"; // Adicionado import

export default (props) => {

  return (
    <>
      <View style={stylesContadorBotões.botoes}>
        <TouchableOpacity
          style={stylesContadorBotões.viewBotao}
          onPress={props.incrementar}
        >
          <Text style={estiloPadrao.textoGrande}>+</Text>
        </TouchableOpacity>
        <TouchableOpacity
          style={stylesContadorBotões.viewBotao}
          onPress={props.decrementar}
        >
          <Text style={estiloPadrao.textoGrande}>-</Text>
        </TouchableOpacity>
      </View>
    </>
  );
};
