/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputexp;

/**
 *
 * @author Shuo Zhang
 * @ssz6@georgetown.edu
 */
import java.util.Scanner;
import java.util.Arrays;
import net.sourceforge.pinyin4j.PinyinHelper;
import java.lang.Object;
import java.util.*;
import java.io.*;

public class InputExp {
//public static int j;
   public static void main(String[] args) throws IOException  {
	 
		
		//String input_path="/Users/zangsir/Desktop/inputfile.txt";
                String input_path=args[0];
		ReadFile file = new ReadFile(input_path);
		String[] aryLines = file.OpenFile();
		//System.out.println(aryLines[0]);

		//aryLines[i] is a line of sentence
	for(int i=0; i<aryLines.length; i++){
		//System.out.println(aryLines[i]);
		//ca[j] is a character or a space, catemp[k] is holding the temporary word for processing
		char[] ca=aryLines[i].toCharArray();
	
		String[] pinyinOutput=new String[ca.length];

		//System.out.println(aryLines.length);
		for (int c=0; c<ca.length;c++){
			  
		    if (ca[c]=='，' || ca[c]=='。' || ca[c]==',' || ca[c]=='.' || ca[c]==' '){
                        pinyinOutput[c]=Character.toString(ca[c]);
                        continue;
                    }
                    
                        String[] pinyinArray = PinyinHelper.toHanyuPinyinStringArray(ca[c]);
                    
                    
                    if(pinyinArray != null){
                        pinyinOutput[c]=pinyinArray[0];
                    }
                }
		  
                StringBuilder builder = new StringBuilder();
		String finalOutput;

		for(int y=0;y<pinyinOutput.length;y++){
                    if(pinyinOutput[y]=="null"){		
                        continue;
                    }
                    builder.append(pinyinOutput[y]);
                    builder.append(" ");
                }
		
                finalOutput=builder.toString();
		System.out.println(finalOutput);

        }	  

			   
   }    
}
		  
	
  
   
   
   
   
   
  
 
   
 