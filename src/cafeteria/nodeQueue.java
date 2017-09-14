/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria;

/**
 *
 * @author Estudiante
 */
public class nodeQueue {

    String data;
    nodeQueue next;

    nodeQueue(String x) {
        data = x;
        next = null;
    }

}

class queue {

    nodeQueue start;
    nodeQueue end;

    public queue() {
        start = null;
        end = start;
    }

    public boolean emptyQueue() {
        if (start == null) {
            return true;
        } else {
            return false;
        }
    }

    public void add(String data) {
        nodeQueue newNode = new nodeQueue(data);
        if (emptyQueue()) {
            start = newNode;
        } else {
            end.next = newNode;
        }
        end = newNode;
    }

    public String removeAndPrint() {
        String data;
        data = start.data;
        start = start.next;
        return data;

    }
}
