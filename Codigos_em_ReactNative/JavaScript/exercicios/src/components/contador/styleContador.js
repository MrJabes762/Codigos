import { StyleSheet } from 'react-native';

export const stylesContador = StyleSheet.create({
    container: {
        justifyContent: 'center',
        alignItems: 'center',
        width:'100%',
        height: '18%',
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
        width: '10%',
        height: '100%',
        borderRadius: 25,
        backgroundColor: 'green',
    },
    botoes: {
        flexDirection: 'row',
        justifyContent: 'space-around',
        width: '100%',
        height:'60%',
        paddingHorizontal: 20,
    },
});