import React from "react";
import {Text} from "react-native";
import Estilo from "../Multi/estiloPadrao";

export default function Aleatorio (props){
    //props.min += 1000;// Nesse formato não funciona, pois o props é uma propriedade de leitura, ou seja, não pode ser alterada.
    //props.max += 3000; // Nesse formato não funciona, pois o props é uma propriedade de leitura, ou seja, não pode ser alterada.
    
    const {min, max} = props; // Já nesse caso eu posso alterar os valores de min e max, pois estou criando novas variáveis com os valores de props.min e props.max.
    return (
        <Text style ={Estilo.textoGrande}>Valor aleatório entre {min} e {max} = {parseInt(Math.random() * max - min + 1) + min}</Text>
    );
};