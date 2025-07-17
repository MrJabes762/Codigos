import React, { useState } from "react"; // sempre que se for utilizar JSX é necessário importar o React
// O safeAreaView é um componente que garante que o conteúdo da aplicação não fique escondido por baixo da barra de status ou notificações do dispositivo.
import { Text, SafeAreaView, TextInput } from "react-native";
import { stylesApp } from "./styleApp";
import PrimeiroComponente from "./src/components/componente1/Componente1";
import SegundoComponente from "./src/components/componente2/Componente2";
import CompPadrao, { Comp4, Comp5 } from "./src/components/Multi/Multi"; // Importando o componente Comp principal e os componentes Comp4 e Comp5
import MinMax from "./src/components/minMax/MinMax";
import Aleatorio from "./src/components/aleatorio /Aleatorio";
import Titulo from "./src/components/frag/Titulo";
import Botao from "./src/components/botao/Botao";
import Contador from "./src/components/contador/Contador";
import Pai from "./src/components/direta/Pai";
import PaiInd from "./src/components/indireta/PaiInd";
import ContadorV2 from "./src/components/contadorv2/ContadorV2";
import Diferenciar from "./src/components/diferenciarIosAndroid/diferenciar";
import ParImpar from "./src/components/ParImpar/ParImpar";
import Familia from "./src/components/relacao/Familia";
import Membro from "./src/components/relacao/Membro";
import UsuarioLogado from "./src/components/usuarioLogado/UsuarioLogado";
import ListaProdutos from "./src/components/produtos/ListaProdutos";
import ListaProdutosV2 from "./src/components/produtos/ListaProdutosV2/ListaProdutosV2";
import DigiteSeuNome from "./src/components/TextInput/DigiteSeuNome";
import estiloPadrao from "./src/components/Multi/estiloPadrao";
import If from "./src/components/if/if";
import FlexboxV1 from "./src/components/layout/flexboxV1/FlexboxV1";
import FlexboxV2 from "./src/components/layout/flexboxV2/FlexboxV2";
import FlexboxV3 from "./src/components/layout/flexboxV3/FlexboxV3";

export default function App() {
  const [exercicio, setExercicio] = useState(""); // Estado para controlar o exercício atual
  return (
    <SafeAreaView style={stylesApp.container}>{/*Naturalmente este componente aplica flexbox em sua construção*/}
      <Text style={estiloPadrao.textoGrande}>Exercicio: {exercicio}</Text>
      <TextInput
        placeholder="Digite o exercício"
        value={exercicio}
        onChangeText={setExercicio}
      />
      <If test={exercicio === "Componente Iniciais"}>
        {/*Componentes Iniciais o Primeiro é o Padrão e o Segundo cita a fragmentação*/}
        <PrimeiroComponente />
        <SegundoComponente />
      </If>
      <If test={exercicio === "Componentes Multi"}>
        {/*Componentes Multi*/}
        <CompPadrao />
        <Comp4 />
        <Comp5 />
      </If>
      <If test={exercicio === "Exibindo Valores Desestruturados"}>
        {/*Exibindo Valores Desestruturados*/}
        <MinMax min={4} max={3} />
      </If>
      <If test={exercicio === "Numeros Aleatorios"}>
        {/*Numeros Aleatorios com Desestruturação*/}
        <Aleatorio min={1} max={60} />
        <Aleatorio min={1} max={40} />
      </If>
      <If test={exercicio === "Exemplos Basicos de Botão"}>
        {/*Exemplos Basicos de Botão*/}
        <Botao />
      </If>
      <If test={exercicio === "Propriedades de Leitura"}>
        {/*Propriedades de Leitura*/}
        <Titulo
          principal="Ola esse é o texto"
          secundario="Esse é o texto secundário"
        />
      </If>
      <If test={exercicio === "Contador Contador Com Propriedades"}>
        {/* Contador Com Propriedades*/}
        <Contador iniciar={10} passo={2} />
      </If>
      <If test={exercicio === "Contador Sem Propriedades"}>
        {/* Contador Sem Propriedades*/}
        <Contador />
      </If>
      <If test={exercicio === "Comunicação Direta"}>
        {/*Comunicação Direta */}
        <Pai x={10} y={20} />
      </If>
      <If test={exercicio === "Comunicação Indireta"}>
        {/* Comunicação Indireta */}
        <PaiInd inicial={10} final={20} />
      </If>
      <If test={exercicio === "Comunicação Direta e Indireta"}>
        {/* Comunicação Direta e Indireta */}
        <ContadorV2 nome={"Alexia"} valor={12} />
      </If>
      <If test={exercicio === "Diferenciar Ios e Android"}>
        <Diferenciar />
        {/* Renderização Condicional */}
      </If>
      <If test={exercicio === "Par ou Impar"}>
        {/* Renderização Condicional Par ou Impar */}
        <ParImpar props={2} />
      </If>
      <If test={exercicio === "Familia e Membros"}>
        {/* Renderização de Componentes Filhos com o props.children */}
        <Familia>
          <Membro nome="Python" sobrenome="È Meu Ovo" />
          <Membro nome="Html" sobrenome="Não é Linguagem de Programação" />
          <Membro nome="JavaScript" sobrenome="Tem inveja do Java" />
        </Familia>
        <Familia>
          <Membro nome="React" sobrenome="JS/CORE" />
          <Membro nome="React" sobrenome="Native" />
          <Membro nome="React" sobrenome="Native for Web" />
        </Familia>
      </If>
      <If test={exercicio === "Renderização Condicional 2"}>
        {/*Renderização condicional 2 - a partir de um componente*/}
        <UsuarioLogado
          usuario={{
            nome: "Bia",
            sobrenome: "Silva",
            email: "biasilva321@gmail.com",
          }}
        />
      </If>
      <If test={exercicio === "Renderização Lista 1"}>
        {/*Renderização de Lista de Produtos com Key*/}
        <ListaProdutos />
      </If>
      <If test={exercicio === "Renderização Lista 2"}>
        {/*Renderização de Lista de Produtos com Flatlist e Estilo Personalizado*/}
        <ListaProdutosV2 />
      </If>
      <If test={exercicio === "Componente Controlado"}>
        {/*Componente controlado com Renderização de TextInput*/}
        <DigiteSeuNome campo="Nome" />
      </If>
      <If test = {exercicio === "Flexbox Quadrado"}>
        {/*Quadrado com Flexbox*/}
        <FlexboxV1/>
      </If>
      <If test = {exercicio === "Flexbox 2"}>
        {/*Flexbox 2 */}
        <FlexboxV2/>
      </If>
      <If test = {exercicio === "Flexbox 3"}>
        {/*Flexbox 3*/}
        <FlexboxV3/>
      </If>
    </SafeAreaView>
  );
}
