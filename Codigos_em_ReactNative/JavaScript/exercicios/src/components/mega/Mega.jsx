import React, { Component } from "react";
import { Text, TextInput, TouchableOpacity, View } from "react-native";
import { styleMega } from "./styleMega";
import estiloPadrao from "../Multi/estiloPadrao";
import If from "../if/if";
import Numero from "./numero/Numero";

export default class Mega extends Component {
  // quando o componente for chamado, ele irá chamar a função render() retornando um JSX
  constructor(props) {
    super(props);
    this.state = {
      quantidade: props.qtdNumeros,
      numeros: [],
    };
  }

  alterarQtdNumeros = (qtde) => {
    // Converte para número, ou 0 se vazio
    const valor = parseInt(qtde) || 0;
    this.setState({ quantidade: valor });
  };

  gerarNumeroNaoContido = (nums) => {
    // Aplicando recursividade
    const numero = parseInt(Math.random() * 60) + 1;
    return nums.includes(numero) ? this.gerarNumeroNaoContido(nums) : numero;
  };

  limparArray = () => {
    this.setState({ numeros: [] });
  };

  gerarNumeros = () => {
    const numeros = Array(this.state.quantidade)
      .fill()
      .reduce((nums) => [...nums, this.gerarNumeroNaoContido(nums)], [])
      .sort((a, b) => a - b); // Ordena os números em ordem crescente
    this.setState({ numeros });
  };

  exibirNumeros = () => {
    return this.state.numeros.map((numero, index) => {
      return <Numero index={index} numero={numero} />;
    });
  };

  render() {
    // Retomando o this: Ele pega o valor do atributo da classe em instanciada naquele momento
    return (
      <>
        <Text style={estiloPadrao.textoGrande}>
          Gerador da Mega-Sena
          <If test={this.state.quantidade}>
            {" "}
            = Números: {this.state.quantidade}
          </If>
        </Text>
        <View style={styleMega.ViewInputButtom}>
          <View style={styleMega.ViewInput}>
            <TextInput
              keyboardType={"numeric"}
              style={styleMega.TextInput}
              placeholder="Quantidade de Números"
              value={this.state.quantidade}
              onChangeText={this.alterarQtdNumeros}
            />
          </View>
          <TouchableOpacity onPress={this.gerarNumeros} style={styleMega.botao}>
            <Text>Gerar</Text>
          </TouchableOpacity>
        </View>
        <View style={styleMega.viewExibirNumeros}>{this.exibirNumeros()}</View>
      </>
    );
  }
}
