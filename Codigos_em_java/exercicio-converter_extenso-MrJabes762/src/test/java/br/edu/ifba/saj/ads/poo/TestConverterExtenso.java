
package br.edu.ifba.saj.ads.poo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestConverterExtenso {
    @Test
    public void testConverterExtenso4Digitos() {
        ConverterExtenso ce = null;
        ce = new ConverterExtenso4Digitos(9999);
        String convertido = ce.toString();
        assertEquals("Nove Mil Novecentos e Noventa e Nove", convertido);
    }
    @Test
    public void testConverterExtenso3Digitos() {
        ConverterExtenso ce = null;
        ce = new ConverterExtenso3Digitos(999);
        String convertido = ce.toString();
        assertEquals("Novecentos e Noventa e Nove", convertido);
    }
    @Test
    public void testConverterExtenso2Digitos() {
        ConverterExtenso ce = null;
        ce = new ConverterExtenso2Digitos(99);
        String convertido = ce.toString();
        System.out.println(ce);
        assertEquals("Noventa e Nove", convertido);
    }
    @Test
    public void testConverterExtenso1Digitos() {
        ConverterExtenso ce = null;
        ce = new ConverterExtenso1Digito(9);
        String convertido = ce.toString();
        System.out.println(ce);
        assertEquals("Nove", convertido);
    }
}
