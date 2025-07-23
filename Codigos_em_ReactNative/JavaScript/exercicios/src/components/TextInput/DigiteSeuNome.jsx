import React, { useState } from "react";
import { View, Text, TextInput } from "react-native";
import estiloPadrao from "../Multi/estiloPadrao";
import If from "../if/if";
import Familia from "../relacao/Familia";
import Membro from "../relacao/Membro";

export default (props) => {
  const [nome, setNome] = useState("");
  return (
    <View>
      <Text>
        {props.campo} = {nome}
      </Text>
      <TextInput
        placeholder="Digite seu nome"
        value={nome}
        onChangeText={setNome}
      />
      <If test={nome !== ""}>
        <Text style={estiloPadrao.txtG}>
          Olá {nome}! Bem-vindo ao nosso aplicativo!
        </Text>
        <Familia>
          <Membro nome={nome} sobrenome="Titular" />
          <Membro nome="Alexia" sobrenome="Secundario" />
          <Membro nome="Jairo" sobrenome="Terciario" />
        </Familia>
      </If>
    </View>
  );
};
