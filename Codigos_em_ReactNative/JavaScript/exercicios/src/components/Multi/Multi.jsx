import React from "react";
import { Text } from "react-native";
import Estilo from "./estiloPadrao";

// Exportando varios componentes
// O export funciona semelhante ao emcapulamento
// Ja  Export default exporta o componente principal (padrao)
// O export default pode ser importado com qualquer nome


export default function Comp() {
    return (
        <Text style = {Estilo.textoGrande}>Terceiro #Oficial</Text>
    );
};

export function Comp4() {
    return (
        <Text style = {Estilo.textoGrande}> Quarto Componente</Text>
    );
};

export function Comp5() {
    return (
        <Text style = {Estilo.textoGrande}> Quinto Componente</Text>
    );
};
