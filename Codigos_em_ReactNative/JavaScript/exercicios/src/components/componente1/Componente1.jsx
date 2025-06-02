import React from "react";// sempre que se for utilizar JSX ou TSX é necessário importar o React
import {Text} from "react-native";
import { stylesComponente1 } from "./styleComponente1";

export default function Componente1() {
    console.warn('Comp principal');// artificio utilizado para visualização de mensagens no console
    return (
        <Text style = {stylesComponente1.text}>Primeiro Componente </Text>
    );
}
