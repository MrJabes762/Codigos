import React from 'react'; // sempre que se for utilizar JSX é necessário importar o React
// O safeAreaView é um componente que garante que o conteúdo da aplicação não fique escondido por baixo da barra de status ou notificações do dispositivo.
import { Text, SafeAreaView} from 'react-native';
import { stylesApp } from './styleApp';
import PrimeiroComponente from './src/components/componente1/Componente1';
import SegundoComponente from './src/components/componente2/Componente2';
import CompPadrao, { Comp4, Comp5 } from './src/components/Multi/Multi'; // Importando o componente Comp principal e os componentes Comp4 e Comp5 
import MinMax from './src/components/minMax/MinMax';
import Aleatorio from './src/components/aleatorio /Aleatorio';
import Titulo from './src/components/frag/Titulo';
import Botao from './src/components/botao/Botao';
import Contador from './src/components/contador/Contador';
import Pai from './src/components/direta/Pai';
import PaiInd from './src/components/indireta/PaiInd';
import ContadorV2 from './src/components/contadorv2/ContadorV2';
import Diferenciar from './src/components/diferenciarIosAndroid/diferenciar';
import ParImpar from './src/components/ParImpar/ParImpar';
import PaiRelacao from './src/components/relacao/PaiRelacao';
import Filho from './src/components/relacao/Filho';
import UsuarioLogado from './src/components/usuarioLogado/UsuarioLogado';
import ListaProdutos from './src/components/produtos/ListaProdutos';


export default function App() {
  return (
    <SafeAreaView style={stylesApp.container}>
      {/*Componentes Iniciais o Primeiro é o Padrão e o Segundo cita a fragmentação*/}
      <PrimeiroComponente/>
      <SegundoComponente/>
      {/*Componentes Multi*/}
      <CompPadrao/>
      <Comp4/>
      <Comp5/>
      {/*Exibindo Valores Desestruturados*/}
      <MinMax min= {4} max = {3}/>
      {/*Numeros Aleatorios com Desestruturação*/}
      <Aleatorio min = {1} max = {60}/>
      <Aleatorio min = {1} max = {40}/>
      {/*Exemplos Basicos de Botão*/}
      {/*<Botao
      />*/}
      {/*Propriedades de Leitura*/}
      {/*<Titulo 
        principal = "Ola esse é o texto"
        secundario = "Esse é o texto secundário"
      />*/}
      {/* Contador Com Propriedades*/}
      {/*<Contador
        iniciar = {10}
        passo = {2}
      />*/}
      {/* Contador Sem Propriedades*/}
      {/*<Contador/>*/}
      {/*Comunicação Direta */}
      {/*<Pai x = {10} y = {20}/>*/}
      {/* Comunicação Indireta */}
      {/*<PaiInd inicial = {10} final = {20}/>*/}
      {/*Comunicação Direta e Indireta*/}
      {/*<ContadorV2 nome = {"Alexia"} valor = {12}/>*/}
      <Diferenciar/>
      {/* Renderização Condicional */}
      <ParImpar props = {2}/>
      {/* Renderização de Componentes Filhos com o props.children */}
      {/*<PaiRelacao>
        <Filho nome = "Python" sobrenome = "È Meu Ovo"/>
        <Filho nome = "Html" sobrenome = "Não é Linguagem de Programação"/>
        <Filho nome = "JavaScript" sobrenome = "Tem inveja do Java"/>
      </PaiRelacao>
      <PaiRelacao>
        <Filho nome = "React" sobrenome = "É o Melhor"/>
        <Filho nome = "React Native" sobrenome = "É o Melhor para Mobile"/>
        <Filho nome = "React JS" sobrenome = "É o Melhor para Web"/>
      </PaiRelacao>*/}
      {/*Renderização condicional 2 - a partir de um componente*/}
      {/*<UsuarioLogado usuario={{nome:"Bia", sobrenome: "Silva", email: "biasilva321@gmail.com"}}/>*/}
      {/*Renderização de Lista de Produtos com Key*/}
      <ListaProdutos/>
    </SafeAreaView>
  );
}

