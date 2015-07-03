/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pinyin.exp;

/**
 *
 * @author zangsir
 */
import java.util.Scanner;
import java.util.Arrays;
import net.sourceforge.pinyin4j.PinyinHelper;
import java.lang.Object;
import java.util.*;
import java.io.*;
public class PinyinExp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("please input your character:");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        System.out.println("transformed pinyin:");
        //System.out.println(answer);

        regexMatch checker = new regexMatch();
        char[] ca=answer.toCharArray();
	
        String[] pinyinOutput=new String[ca.length];

        //System.out.println(aryLines.length);
        for (int c=0; c<ca.length;c++){
            //if this char is an english character, number, or any punctuation characters
            //in chinese or english, then just copy the thing with no transform.
            if (checker.checkAlpha(ca[c]) || !checker.checkRex(ca[c])){
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

        for (String pinyinOutput1 : pinyinOutput) {
            if (pinyinOutput1==null) {		
                continue;
            }
            builder.append(pinyinOutput1);
            builder.append(" ");
        }

        finalOutput=builder.toString();
        System.out.println(finalOutput);

        
    }
    
}
