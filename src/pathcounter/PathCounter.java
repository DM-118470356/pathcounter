/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pathcounter;

/**
 *
 * @author DannyMorrissey
 */
public class PathCounter {
    public int countPaths(int inputtedNum){
        int count = 0;
        for(String interatorStr : Integer.toString(inputtedNum).split("")){
            System.out.println("The individual values are "+ interatorStr);
            if (interatorStr.equals("8")) {
                count +=2;
            } 
            else if (interatorStr.equals("0")|| interatorStr.equals("4")|| interatorStr.equals("6" )|| interatorStr.equals("9")){
            count+=1;}
                    else{
                            count +=0;
                            }
            }
        return count; 
    }}

        
    
    

