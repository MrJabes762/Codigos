import React from "react"
import { Text, View } from "react-native"
import { stylesComponente2 } from "./styleComponente2";

// È importante fechar as tags JSX seja <> ou <></> ou </> para que o código funcione corretamente
export default function Componente2() {
    return (
        <View>
            <Text>
                Segundo Componente
            </Text>
        </View>
    );
}
