import React from "react";
import { View, Text } from "react-native";
import estiloPadrao from "../Multi/estiloPadrao";
import Filho from "./Filho"; // comunicação direta entre componentes
// Pai.jsx é o componente pai que renderiza dois componentes Filho com diferentes valores de x e y

export default (props) => {
  let x = props.x || 0;
  let y = props.y || 0;
  return (
    <>
      <Filho x={x} y={y} />
      <Filho x={x + 10} y={y + 100} />
    </>
  );
};
