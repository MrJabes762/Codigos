import React from 'react';// sempre que se for utilizar JSX é necessário importar o React
// O safeAreaView é um componente que garante que o conteúdo da aplicação não fique escondido por baixo da barra de status ou notificações do dispositivo.
import { Text, SafeAreaView} from 'react-native';
import { stylesApp } from './styleApp';
import Componente1 from './src/components/componente1/Componente1';


export default function App() {
  return (
    <SafeAreaView style={stylesApp.container}>
      <Text>Open up App.js to start working on your app!</Text>
      <Componente1/>
    </SafeAreaView>
  );
}

