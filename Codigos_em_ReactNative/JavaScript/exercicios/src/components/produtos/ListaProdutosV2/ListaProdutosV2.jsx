import React from "react";
import { View, Text, FlatList } from "react-native";
import estiloPadrao from "../../Multi/estiloPadrao";
import Produtos from "../produtos";
import { stylesProdutoV2 } from "./styleProdutoV2";

export default (props) => {

  // Função para renderizar cada item da lista pode ser feita diretamente ou por uma função separada
  const produtoRender = ({item}) => {// Seria chamado no render item dessa forma = {produtoRender}
    return (
      <Text>{item.id}) {item.nome} = {item.preco.toFixed(2)}</Text>
    );
  }
  return (
    <>
      <Text style={estiloPadrao.textoGrande}>ListaProdutosV2</Text>
      <FlatList
        data = {Produtos}
        keyExtractor={item => {`${item.id}`}}
        renderItem={({item}) => {
            return (
                <Text>{item.id}) {item.nome} = {item.preco.toFixed(2)}</Text>
            );
        }}
        style = {stylesProdutoV2.lista}
        showsVerticalScrollIndicator = {false}
      />
      
    </>
  );
};
