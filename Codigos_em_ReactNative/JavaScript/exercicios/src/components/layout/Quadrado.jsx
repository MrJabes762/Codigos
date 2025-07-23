import React from 'react'
import { View, Text } from 'react-native'
import { styleQuadrado } from './styleQuadrado';

export default props => {
    return (
       <View style = {[styleQuadrado.quadrado , {backgroundColor: props.cor || "black"}]} >

       </View>
);
}