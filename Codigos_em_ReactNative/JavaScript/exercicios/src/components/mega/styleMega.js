import { StyleSheet } from "react-native";

const height = 30;
export const styleMega = StyleSheet.create({
    ViewInputButtom:{
        width:'100%',
        flexDirection:"row",
        justifyContent:"space-evenly",
    },
    ViewInput:{
        width:'40%',
        height:height,
        borderRadius:6,
        borderWidth:2,
        borderColor:"black",
        justifyContent:"center",
        backgroundColor:"white",
    },
    TextInput:{
        width:'90%',
        height:'60%',
        marginLeft:'5%'
    },
    botao:{
        width:"20%",
        height:height,
        borderRadius:6,
        backgroundColor:"red",
        justifyContent:"center",
        alignItems:"center",
        borderWidth:2,
    },
    viewExibirNumeros:{ 
        width:'100%',
        justifyContent:"space-evenly",
        flexDirection:"row",
        flexWrap:"wrap",
        marginTop:10,
    }
});