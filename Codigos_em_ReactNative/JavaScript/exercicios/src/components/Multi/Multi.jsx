import React from "react";
import { Text } from "react-native";

// Exportando varios componentes
// O export funciona semelhante ao emcapulamento
// Ja  Export default exporta o componente principal (padrao)
// O export default pode ser importado com qualquer nome


export default function Comp() {
    return (
        <Text>Terceiro #Oficial</Text>
    );
};

export function Comp4() {
    return (
        <Text>Quarto Componente</Text>
    );
};

export function Comp5() {
    return (
        <Text>Quinto Componente</Text>
    );
};
