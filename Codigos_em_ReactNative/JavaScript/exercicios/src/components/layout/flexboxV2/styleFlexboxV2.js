import { StyleSheet } from "react-native";


// Estilização do componente FlexboxV1
// O flexbox com flex1 faz com que o container ocupe todo o espaço disponível
// No justifyContent e no Alignitens o valor "space-evenly" distribui os elelemtos igualmente,
// enquanto o "center" centraliza os elementos dentro do container.
// o "flax-start/end" alinha os elementos ao inicio ou oo fim 
// o space-around distribui os elementos com espaçamento ao redor deles.
// o space-between distribui os elementos com espaçamento entre eles.
export const stylesFlexboxV2 = StyleSheet.create({
    container:{
        flex:1,
        width: "100%",
        alignItems:'center',
        backgroundColor:"red",
        justifyContent: "space-evenly",
    }
});