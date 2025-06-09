import { StyleSheet } from "react-native";

export const stylesContadorBotões = StyleSheet.create({
    viewBotao: {
        alignItems: 'center',
        justifyContent: 'center',
        borderColor:'black',
        borderWidth:3,
        width: '10%',
        height: '100%',
        borderRadius: 25,
        backgroundColor: 'green',
    },
    botoes: {
        flexDirection: 'row',
        justifyContent: 'space-around',
        marginTop:10,
        width: '100%',
        height:'40%',
        paddingHorizontal: 20,
    },
});