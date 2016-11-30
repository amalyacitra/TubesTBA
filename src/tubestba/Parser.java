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

    String t;
    
    public Parser(String t){
        inputan = new ArrayList<>();
        token = new ArrayList<>();

        this.t=t;
        parse();
    }
    
    public void parse(){
        String[] line = t.split(" ");
        for (int i=0; i<line.length; i++){
            if (line[line.length-1].equals("error")){
              inputan.add(-1);
            }
            else{
                inputan.add(Integer.parseInt(line[i])); 
            }
               
        }
        

    }
    
    public boolean formulaBasic (){
        int ukuran = inputan.size();
        
       
        if ((inputan.get(0)==1) && (inputan.size()==1)){
            
            return true;
        }
        
        else if ( (inputan.get(0)==2) && (inputan.get(1)==1) || (inputan.get(1)==9) ){
            if ( (inputan.get(0)==2) && (inputan.get(1)==1) && (inputan.size()==2) ){
                return true;
            }
            else if ( (inputan.get(2)==1)){
               return false;
           }
           else if ( (inputan.get(2)==2)){
               return false;
           }
           else {
               return false;
           }
        }
        
        else if ((inputan.get(0)==1) && (inputan.get(1)!=null)){
            if ( (inputan.get(1)==3)||(inputan.get(1)==4)||(inputan.get(1)==5)||(inputan.get(1)==8) ){
                if ((inputan.get(2)==1) || (inputan.get(2)==9) ){
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
        
        else if (inputan.get(0)==6) {
            if ((inputan.get(1)==1) || (inputan.get(1)==2) || (inputan.get(1)==9) || (inputan.get(1)==10)){
                if ((inputan.get(2)==7)|| (inputan.get(2)==3) || (inputan.get(2)==4) || (inputan.get(2)==5) || (inputan.get(2)==8) || (inputan.get(2)==10)){
                    if ((inputan.get(3)==1)){
                        return true;
                    }
                    else {
                        return false;
                    }
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        
        else if ((inputan.get(0)==9)){
            if( (inputan.get(1)==1 ) ){
                if ((inputan.get(2)==10 )){
                    return true;
                }
                else if ((inputan.get(2)==1 )){
                    return false;
                }
                else {
                   return true;
                }
            }
            else if( (inputan.get(1)==2) || (inputan.get(1)==6) ){
                if ((inputan.get(2)==1 ) && (inputan.get(3)!=1 )){
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        else if (inputan.get(0)==-1){
            return false;
        }
        else{
            return false;
        }
        
        }
        
    
        
        
        
    
    public boolean formula(){
        int ukuran = inputan.size();
        
        if (inputan.get(inputan.size()-1)==-1){
            return false;
        }
        
        else if(inputan.get(0)==1){
           if ( (inputan.get(1)==3)||(inputan.get(1)==4)||(inputan.get(1)==5)||(inputan.get(1)==8) || (inputan.get(2)==9) ){
               if (formulaBasic()==true){
                    return true;
                }
               else{
                    return false;
                }
           }
           else {
               if (formulaBasic()==true){
                    return true;
                }
               else{
                    return false;
                }
           }
           
        }
        
        else if (inputan.get(0)==2){
           if ((inputan.get(1)==1) || (inputan.get(1)==9)){
               if ((inputan.get(1)==9) && (inputan.get(2)==1) || (inputan.get(3)==10) ){
                return true;
               }
               else if ((inputan.get(1)==1) && (inputan.get(2)==1) ) {
                   if (formulaBasic()==true){
                    return true;
                }
                else{
                    return false;
                }    
               }
               else {
                   return false;
               } 
            }
           else {
               return false;
           }
        }
        
        else if (inputan.get(0)==6){
           if ( ((inputan.get(1)==1) || (inputan.get(1)==2) || (inputan.get(1)==9)) && (inputan.get(2)!=null)){
               if ((inputan.get(2)==7) && (inputan.get(4)!=1)){
                   if ( (inputan.get(3)==1) || (inputan.get(3)==2) || (inputan.get(3)==9) ) {
                       if (formulaBasic()==true){
                            return true;
                        }
                        else{
                            return false;
                    }
                   }
                   else {
                       return false;
                   }
               }
               else {
                   return false;
               }
                
            }
            else {
                return false;
           }
        }
        
        else if (inputan.get(0)==9){
           if ( ((inputan.get(1)==1) || (inputan.get(1)==2) || (inputan.get(1)==6 )) && (inputan.get(2)!=null) || (inputan.get(ukuran-1)==10) ){
               if (inputan.get(2)==10){
                   if (formulaBasic()==true){
                    return true;
                }
                else{
                    return false;
                }
               } 
               else {
                   if (formulaBasic()==true){
                    return true;
                }
                else{
                    return false;
                }
               }
               
            }
            else {
                return false;
           }
        }
        
        else if (inputan.get(0)==-1){
            return false;
        }
        
        
        
        else{
            return false;
        }
    }
     
    
    
    
}
