/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class node {

    node next;
    node prev;
    String data;
}

class doubleList {

    Scanner scan;
    node start;
    node end;

    public doubleList() {
        start = null;
        end = null;
    }

    public void add(String data) {
        node newNode = new node();
        newNode.data = data;
        if (start == null) {
            start = newNode;
            start.next = null;
            start.prev = null;
            end = start;
        } else {
            end.next = newNode;
            newNode.prev = end;
            end=newNode;
        }
    }

    public void print() {
        node actual=new node();
        actual=start;
        while(actual!=null){
            System.out.println(actual.data);
            actual=actual.next;
        }
    }
    
    public void findNode(String friend, String data){
        node actual=new node();
        node newNode=new node();
        newNode.data=data;
        actual=start;
        while(actual!=null){
            if(actual.data==friend){
                node temp=new node();
                temp=actual.next;
                actual.next=newNode;
                newNode.next=temp;
                break;
            }
        }
    }
}
