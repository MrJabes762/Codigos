import {StyleSheet} from "react-native"

// Estilização do componente App 

export const stylesApp = StyleSheet.create({
    container: {
      flexGrow: 1,// tanto o flex quanto o flexgrow crescem dinamicamente, a numeração é relativa ao tamanho do container pai
      backgroundColor: 'gray',
      alignItems: 'center',
      justifyContent: 'center',
      padding:20,
    },
});