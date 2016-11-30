/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubestba;
import java.util.*;
import tubestba.*;


/**
 *
 * @author Kelompok 1 IF-38-09
 */
public class TubesTBA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true){
            String input = s.nextLine();
            LexicalAnalyzer l = new LexicalAnalyzer(input);
            System.out.println(l.Token());
            
            Parser p = new Parser(l.Token());
            
            if (p.formula()==true){
                System.out.println("valid");
            }
            else {
                System.out.println("tidak valid");
            }
         
			
        }
    }
    
}
