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
public class Cafeteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c = scan.nextInt();
        int j = 0;
        String[][] codigos = new String[1000][1000];
        queue q= new queue();
        while (c > j) {
            for (int i = 0; i < c; i++) {
                String id = scan.nextLine();
                codigos[j][i] = id;
                q.add(id);
            }

            j++;
        }
        
        doubleList cafeteria = new doubleList();
        while (!q.emptyQueue()) {
            for (int i = 0; i < c; i++) {
                if (i == 0 || i==1) {
                    cafeteria.add(codigos[j][i]);
                }
                else{
                    String actualId=q.data;
                    if(q.equals(codigos[j][i])){
                        cafeteria.findNode(codigos[j][i-1], q );
                    }
                }
            }

            j++;
        }

    }

}
