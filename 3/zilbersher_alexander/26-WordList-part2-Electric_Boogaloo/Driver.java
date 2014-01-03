import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
        Search s = new Search(20,40);

        /* Test Cases                                                                                                                                                                
        System.out.println(s);                                                                                                                                                       
        s.WordH(15,10,"pasta");                                                                                                                                                      
        s.WordH(7,7,"potato");                                                                                                                                                       
        s.WordH(3,2,"abalaba");                                                                                                                                                      
        System.out.println("\n After adding basic words \n");                                                                                                                        
        System.out.println(s);                                                                                                                                                       
        s.WordH(3,7,"baby");                                                                                                                                                         
        s.WordH(7,5,"brainwash");                                                                                                                                                    
        s.WordH(17,15,"mother");                                                                                                                                                     
        System.out.println("\n After adding words that violate conditions \n and baby to the end of abalaba \n");                                                                    
        System.out.println(s);                                                                                                                                                       
        s.WordV(12,6,"potato");                                                                                                                                                      
        s.WordV(7,6,"pumpkins");                                                                                                                                                     
        System.out.println("\n After adding one vertical word \n and one that violates conditions \n");                                                                              
        System.out.println(s);                                                                                                                                                       
        s.WordHB(9,10,"pasta");                                                                                                                                                      
        s.WordVB(9,10,"plant");                                                                                                                                                      
        System.out.println("\n After adding a backwards h and v word (plant and pasta \n");                                                                                          
        System.out.println(s);                                                                                                                                                       
        s.WordDDR(14,14,"Llama");                                                                                                                                                    
        s.WordDUR(12,12,"Cheese");                                                                                                                                                   
        s.WordDUL(5,19,"Amish");                                                                                                                                                     
        s.WordDDL(5,8,"Yemen");                                                                                                                                                      
        System.out.println("\n After adding a Diagonals of all directions \n");                                                                                                      
        System.out.println(s);                                                                                                                                                       
        */
	System.out.println(s);
	s.add(20, "wordlist.txt");
	System.out.println(s);
	s.fillSpaces();
	System.out.println(s);
	System.out.println(s.getAL());
    }
}