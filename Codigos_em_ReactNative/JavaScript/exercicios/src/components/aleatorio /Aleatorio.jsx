import React from "react";
import {Text} from "react-native";
import Estilo from "../Multi/estiloPadrao";

export default function Aleatorio (props){
    const {min, max} = props;
    return (
        <Text style ={Estilo.textoGrande}>Valor aleatório entre {min} e {max} = {parseInt(Math.random() * max - min + 1) + min}</Text>
    );
};