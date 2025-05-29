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


export default function App() {
  return (
    <SafeAreaView style={stylesApp.container}>
      <PrimeiroComponente/>
      <SegundoComponente/>
      <CompPadrao/>
      <Comp4/>
      <Comp5/>
      <MinMax min= {4} max = {3}/>
      <Aleatorio min = {1} max = {60}/>
      <Aleatorio min = {1} max = {40}/>
      <Titulo 
        principal = "Ola esse é o texto"
        secundario = "Esse é o texto secundário"
      />
      <Botao
      />
      {/* Contador Com Propriedades*/}
      <Contador
        iniciar = {10}
        passo = {2}
      />
      {/* Contador Sem Propriedades*/}
      <Contador/>
    </SafeAreaView>
  );
}

