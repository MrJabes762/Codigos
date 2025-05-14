import React from 'react';// sempre que se for utilizar JSX é necessário importar o React
// O safeAreaView é um componente que garante que o conteúdo da aplicação não fique escondido por baixo da barra de status ou notificações do dispositivo.
import { Text, SafeAreaView} from 'react-native';
import { stylesApp } from './styleApp';
import PrimeiroComponente from './src/components/componente1/Componente1';
import SegundoComponente from './src/components/componente2/Componente2';
import CompPadrao, { Comp4, Comp5 } from './src/components/Multi/Multi'; // Importando o componente Comp principal e os componentes Comp4 e Comp5 
import MinMax from './src/components/minMax/MinMax';
import Aleatorio from './src/components/aleatorio /Aleatorio';


export default function App() {
  return (
    <SafeAreaView style={stylesApp.container}>
      <Text>Open up App.js to start working on your app!</Text>
      <PrimeiroComponente/>
      <SegundoComponente/>
      <CompPadrao/>
      <Comp4/>
      <Comp5/>
      <MinMax min= {4} max = {3}/>
      <Aleatorio min = {1} max = {60}/>
      <Aleatorio min = {1} max = {40}/>
    </SafeAreaView>
  );
}

