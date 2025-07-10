import React from "react";
import { View, Text } from "react-native";
import estiloPadrao from "../Multi/estiloPadrao";
import Produtos from "./produtos";
import produtos from "./produtos";

export default (props) => {
  function ListaProdutos() {
    return produtos.map((produto) => {
      return (
        <View key={produto.id}>
          <Text>
            {produto.id}) {produto.nome}: R$ {produto.preco.toFixed(2)}
            {/*Casas depois da virgula*/}
          </Text>
        </View>
      );
    });
  }
  return (
    <>
      <Text style={estiloPadrao.textoGrande}> Lista de Produtos </Text>
      {produtos.map((produto) => {
        return (
          <View key={produto.id}>
            <Text key={produto.id}>
              {produto.id}) {produto.nome}: R$ {produto.preco.toFixed(2)}
              {/*Casas depois da virgula*/}
            </Text>
          </View>
        );
      })}
      {ListaProdutos()}{/*Segunda Forma*/}
    </>
  );
};
