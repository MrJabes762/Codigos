import React, { useState } from "react";
import { TouchableOpacity, Text, View } from "react-native";
import estiloPadrao from "../Multi/estiloPadrao";
import { stylesContador } from "./styleContador";

export default ({iniciar = 0, passo = 1}) => {
  const [numero, setNumero] = useState(iniciar);
  const incrementar = () => setNumero(numero + passo);
  const decrementar = () => setNumero(numero - passo);

  return (
    <>
      <View style={stylesContador.container}>
        <Text style={estiloPadrao.textoGrande}>{numero}</Text>
        <View style={stylesContador.botoes}>
          <TouchableOpacity
            style={stylesContador.viewBotao}
            onPress={incrementar}
          >
            <Text style={estiloPadrao.textoGrande}>+</Text>
          </TouchableOpacity>
          <TouchableOpacity
            style={stylesContador.viewBotao}
            onPress={decrementar}
          >
            <Text style={estiloPadrao.textoGrande}>-</Text>
          </TouchableOpacity>
        </View>
      </View>
    </>
  );
};
