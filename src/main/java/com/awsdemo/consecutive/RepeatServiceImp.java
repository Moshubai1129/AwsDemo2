package com.awsdemo.consecutive;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class RepeatServiceImp {

    public void removeRepeat(String s){
        char[] chars = s.toCharArray();
        boolean found=false;
        Integer start=0;
        Integer end=0;
        boolean continueFlag=true;
           if (s.length()>=3){
            for (int i = 0; i < s.length(); i++) {

                if (chars[i] == chars[i + 1] && chars[i + 1] == chars[i + 2]) {

                    start = i;
                    found = true;
                    for (int j = i + 2; j < chars.length; j++) {

                        if (chars[j] != chars[j + 1]) {
                            end = j;
                            continueFlag = false;
                            break;
                        }
                    }
                    if (!continueFlag) {
                        break;
                    }
                }
            }
        }
        if (found) {

            if (s.length() >= 3){

             String strTemp = s.substring(0, start)+s.substring(end+1,s.length());
            System.out.println("->" + strTemp);
            removeRepeat(strTemp);
            }else{
                System.out.println("->" + s);
            }

        }else {
            System.out.printf("->"+s);
        }

    }

    public void replaceRepeat2(String s) {
        char[] chars = s.toCharArray();
        boolean found = false;
        Integer start = 0;
        Integer end = 0;
        StringBuilder sb = null;
        boolean continueFlag=true;
        if (s.length()>=3){
            for (int i = 0; i < s.length(); i++) {

                if (chars[i] == chars[i + 1] && chars[i + 1] == chars[i + 2]) {
                   sb=new StringBuilder();
                    start = i;
                    found = true;
                    sb.append(chars[i]).append(chars[i+1]).append(chars[2]);
                    for (int j = i + 2; j < chars.length; j++) {

                        if (chars[j] != chars[j + 1]) {
                            end = j;
                            continueFlag = false;
                            break;
                        }else {
                            sb.append(chars[j+1]);
                        }
                    }
                    if (!continueFlag) {
                        break;
                    }
                }
            }
        }
        if (found) {
            if(s.length()>=3) {
                String strTemp = s.replaceAll(sb.toString(), Character.toString((char) (chars[start] - 1)));
                System.out.println("->" + strTemp+","+sb.toString()+" is replace by"+Character.toString((char) (chars[start] - 1)));
                replaceRepeat2(strTemp);
            }else{
                System.out.println("->" +s);
            }
        } else {
            System.out.println("->" + s);
        }
    }
     public static void main(String[] args) {
        /* System.out.println("Input:");
         Scanner scanner = new Scanner(System.in);
         String s = scanner.nextLine();
         RepeatServiceImp repeatServiceImp=new RepeatServiceImp();
         repeatServiceImp.removeRepeat(s);
         System.out.println("Output:");*/

         System.out.println("Input:");
         Scanner scanner = new Scanner(System.in);
         String s = scanner.nextLine();
         RepeatServiceImp repeatServiceImp=new RepeatServiceImp();
         repeatServiceImp.replaceRepeat2(s);
         System.out.println("Output:");
    }
}
