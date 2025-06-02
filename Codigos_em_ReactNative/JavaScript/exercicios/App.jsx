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
      <Botao
      />
      {/*Propriedades de Leitura*/}
      <Titulo 
        principal = "Ola esse é o texto"
        secundario = "Esse é o texto secundário"
      />
      {/* Contador Com Propriedades*/}
      {/*<Contador
        iniciar = {10}
        passo = {2}
      />*/}
      {/* Contador Sem Propriedades*/}
      <Contador/>
      {/*Comunicação Direta */}
      <Pai x = {10} y = {20}/>
      {/* Comunicação Indireta */}
      <PaiInd inicial = {10} final = {20}/>
    </SafeAreaView>
  );
}

