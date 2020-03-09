package br.pedro;

import org.junit.Test;

import static org.junit.Assert.*;

public class PilhaTest {

    @Test
    public void testPilhaVazia () {
        Pilha p = new Pilha();

        boolean vazia = p.isEmpty();

        assertTrue("Nova pilha deve estar vazia", vazia);
    }
}
