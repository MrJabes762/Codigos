import { StyleSheet } from "react-native";


// Estilização do componente FlexboxV1
// O flexbox com flex1 faz com que o container ocupe todo o espaço disponível
// No justifyContent o valor "space-evenly" distribui os elelemtos igualmente,
// enquanto o "center" centraliza os elementos dentro do container.
// o "flax-start/end" alinha os elementos ao inicio ou oo fim 
// o space-around distribui os elementos com espaçamento ao redor deles.
// o space-between distribui os elementos com espaçamento entre eles.
export const stylesFlexboxV1 = StyleSheet.create({
    container:{
        flex: 1,
        backgroundColor:"red",
        justifyContent: "space-evenly",
    }
});