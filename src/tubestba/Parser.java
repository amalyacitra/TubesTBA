/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubestba;

import java.util.ArrayList;

/**
 *
 * @author A_CITRA
 */
public class Parser {
    ArrayList<Integer> inputan;
    ArrayList<Integer> token;
    Stack stack;
    String t;
    
    public Parser(String t){
        inputan = new ArrayList<>();
        token = new ArrayList<>();
        stack = new Stack();
        this.t=t;
        parse();
    }
    
    public void parse(){
        String[] line = t.split(" ");
        for (int i=0; i<line.length; i++){
            inputan.add(Integer.parseInt(line[i]));
        }
        
        stack.push(-1);
    }
    
    public boolean formulaBasic (){
        if ((inputan.get(0)==1) && (inputan.size()==1)){
            token.add(11);
            return true;
        }
        else if ((inputan.get(0)==1) && (inputan.get(1)!=null)){
            if ( (inputan.get(1)==3)||(inputan.get(1)==4)||(inputan.get(1)==5)||(inputan.get(1)==8) ){
                if (inputan.get(2)==1){
                    token.add(12);
                    return true;
                }
                else {
                    return false;
                }
            }
            else{
                return false;
            } 
        }
        else if ((inputan.get(0)==6) && (inputan.get(1)==1)&&(inputan.get(2)==7)&&(inputan.get(3)==1)){
            token.add(13);
            return true;
        }
        else if ((inputan.get(0)==9) && (inputan.get(1)==1)&&(inputan.get(2)==10)){
            token.add(14);
            return true;
        }
        else{
            return false;
        } 
    }
    
    public boolean formula(){
        if(inputan.get(0)==1){
           if (formulaBasic()==true){
               return true;
           }
           else{
               return false;
           }
        }
        else{
            return false;
        }
    }
    
    
    
    
    
    
}
