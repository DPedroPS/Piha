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

    @Test 
    public void TestePush() {
        Stack p = new Stack;

        
    }
    
    @Test
    public void testePeek(){
        Pilha p = new Pilha (3);

        p.push(1);
        p.push(2);

        int resp = p.peek();

        assertEquals("O valor no topo tem q ser 2.", 2, resp);
    }

    @Test
    public void testisFull(){
        Pilha p = new Pilha (3);

        p.push(1);
        p.push(2);
        p.push(3);

        boolean resp = p.isFull();

        assertTrue("Quando a pilha estiver cheia.", full);
    }

    Test
    public void testPop(){
        p.push(1);
        p.push(2);

        int value1 = p.pop();
        int value2 = p.pop();

        assertEquals("Remover primeiro elementodeve ser 2.", 2, value1);
        assertEquals("Remover primeiro elementodeve ser 1.", 1, value2);

        boolean vazia = p.isEmpty;

    }
}
