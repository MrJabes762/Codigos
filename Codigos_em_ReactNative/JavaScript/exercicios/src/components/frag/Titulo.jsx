import React, { Fragment } from "react";
import { View, Text } from "react-native";
import { stylesFraf } from "./styleFrag";
import estiloPadrao from "../Multi/estiloPadrao";


export default props => (// Pode ser util quando eu quero passar apelas propriedades de leitura
    //<React.Fragment> // Diferentemente de uma view ou qualquer UI, o React Fragment retorna apemas os elementos filhos
    //<Fragment>// Pode ser dessa forma tambem
    // Pode ser dessa forma mais sutil
    <> 
        <Text style={estiloPadrao.textoGrande}>{props.principal}</Text>
        <Text>{props.secundario}</Text>
    </>
    //</Fragment>
    //</React.Fragment>
);