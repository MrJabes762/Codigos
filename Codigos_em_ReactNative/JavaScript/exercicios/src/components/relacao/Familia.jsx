import React from "react";
import { View, Text } from "react-native";
import estiloPadrao from "../Multi/estiloPadrao";
import Filho from "./Membro";

export default (props) => {
  
  return (
    <>
      {/*O props.children renderia de forma flexivel os itens informados*/}
      {props.children}
    </>
  );
};
