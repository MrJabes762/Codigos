import React from "react";// sempre que se for utilizar JSX é necessário importar o React
import {Text} from "react-native";
import { stylesComponente1 } from "./styleComponente1";

export default function Componente1() {
    return (
        <Text style = {stylesComponente1.text}>Primeiro Componente </Text>
    );
}
