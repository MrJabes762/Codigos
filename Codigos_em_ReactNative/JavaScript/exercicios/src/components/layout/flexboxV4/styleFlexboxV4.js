import { StyleSheet } from "react-native";


// Estilização do componente FlexboxV4
/*o Flexbox quando aplicado com o Grow, o componente pai pega todo o espaco
disponível, e os filhos vão crescendo de acordo com o tamanho do pai.
quando aplicado junto com os filhos, ele distribui igualmente o espaço

**O numero informado no flexgrow diz respeito a quanto do espaço será dividido em relação ao pai**

é a ideia de proporção, se o pai tiver 100px de altura e o filho tiver flexGrow:3,
o filho terá 30px de altura, se o outro filho tiver flexGrow:5,
ele terá 50px de altura, e o terceiro filho terá 30px de altura.
*/ 
export const stylesFlexboxV4 = StyleSheet.create({
    container:{
        flexGrow:1,
        width:"100%",
        backgroundColor:"black",
        justifyContent: 'space-evenly',
    },
    v0:{
        backgroundColor:"green",
        flexGrow:3,
    },
    v1:{
        backgroundColor:"red",
        flexGrow:5,
    },
    v2:{
        backgroundColor:"white",
        flexGrow:3,
    }
});