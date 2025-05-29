import { StyleSheet } from 'react-native';

export const stylesContador = StyleSheet.create({
    container: {
        justifyContent: 'center',
        alignItems: 'center',
        width:'100%',
        height: '15%',
        backgroundColor: '#88b548',
        borderColor: 'black',
        borderWidth: 4,
        marginTop:10,
    },
    viewBotao: {
        alignItems: 'center',
        justifyContent: 'center',
        borderColor:'black',
        borderWidth:3,
        width: 50,
        height: 50,
        borderRadius: 25,
        backgroundColor: 'green',
    },
    botoes: {
        flexDirection: 'row',
        justifyContent: 'space-around',
        width: '100%',
        paddingHorizontal: 20,
    },
});