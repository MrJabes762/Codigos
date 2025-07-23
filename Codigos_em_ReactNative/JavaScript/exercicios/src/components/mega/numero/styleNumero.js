import { StyleSheet } from "react-native";

let lado = 60;
export const styleNumero = StyleSheet.create({
    textoMap:{
        fontSize:14,
        color:"white",
        textAlign:"center"  
    },
    ViewNumero:{
        width: lado,
        height: lado,
        borderRadius: lado / 2,
        backgroundColor: "green",
        justifyContent: "center",
        alignItems: "center",
        borderWidth: 2,
        borderColor: "black",
    }
});