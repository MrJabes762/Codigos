import React, { useState } from "react";
import { View, Text } from "react-native";
import estiloPadrao from "../Multi/estiloPadrao";
import ContadorDisplay from "./ContadorDisplay";
import { stylesContadorV2 } from "./styleContadorV2";
import ContadorBotões from "./ContadorBotões";

export default (props) => {
  const [num, setNumero] = useState(props.valor);

  const incrementar = () => setNumero(num + 1);
  const decrementar = () => setNumero(num - 1);


  return(
  <>
  <View style = {stylesContadorV2.container}>
    <Text style={[estiloPadrao.textoGrande, stylesContadorV2.texto]}>Contador V2</Text>
    <ContadorDisplay nome={props.nome} valor={num}/>
    <ContadorBotões incrementar = {incrementar} decrementar = {decrementar}/>
  </View>
  </>
  );
};
