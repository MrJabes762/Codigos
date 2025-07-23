import { StyleSheet } from "react-native";


// Estilização do componente FlexboxV3
/*o fexDirection: "row" faz com que os elementos sejam dispostos na horizontal,
ja o Row reverse inverte a ordem dos elementos.
o flexDirection: "column" faz com que os elementos sejam dispostos na vertical,
o column reverse inverte a ordem dos elementos.
*/ 
export const stylesFlexboxV3 = StyleSheet.create({
    container:{
        height: 350,
        width: "100%",
        backgroundColor:"red",
        flexDirection: 'row',
        alignItems: 'center',
        justifyContent: 'space-evenly',
    }
});