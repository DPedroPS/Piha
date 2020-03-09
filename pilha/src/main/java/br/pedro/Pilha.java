package br.pedro;

import javax.xml.crypto.Data;

import org.graalvm.compiler.nodes.calc.IsNullNode;

public class Pilha {
    private int data [];
    int top;

    public Pilha (int size){
        data = new int [size];
        top = -1;
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public void push(int value){
        if (isFull()) return;
        top++;
        data [top] = value;
    }

    public boolean isFull(){
        return top == (data.length -1);
    }
    
    public int Pop() {
        int value = data[top];
        return value;
    }
}