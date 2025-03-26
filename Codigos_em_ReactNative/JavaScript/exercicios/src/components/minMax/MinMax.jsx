import React from "react";
import {Text} from "react-native";
import Estilo from "../Multi/estiloPadrao";

    export default function MinMax (props){
        const {min, max} = props;
        console.warn(props);
        console.warn(min);
        console.warn(max);  
        return (
            <Text style ={Estilo.textoGrande}>O valor {min} é maior que o valor {max} = {min + max} </Text>
        );
    };
