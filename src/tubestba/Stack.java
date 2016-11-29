/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubestba;
import java.util.LinkedList;
/**
 *
 * @author A_CITRA
 */
public class Stack {
     LinkedList<Integer> isi;

    public Stack(){
        isi = new LinkedList();

    }

    public void push(int s){
        isi.addFirst(s);
    }

    public boolean pop (){
        if(isi.isEmpty())
            return false;
        else{
            isi.removeFirst();
            return true;
        }
    }

    public void printStack(){
        for(int s : isi){
            System.out.print(s);
        }
        
    }
}
