package com.company;
import java.util.Scanner;

public class Dictionary {
    private ArrayList words = new ArrayList();
    private ArrayList defs = new ArrayList();;

    public void add(String word, String def){
        words.add(word);
        defs.add(def);
    }

    public int size(){
        return words.size();
    }

    public void randomFlashCard(){
        //have random index, have a through D, then choose randomly on which the corrdect answer is, then print if it is right or wrong
        String[] choices = {"A","B","C","D"};
        boolean val = false;
        Scanner user = new Scanner(System.in);
        //choose between 0,1,2,3 -> have a random number generator for those index values
        //print normally A,B,C,D, apart from the correct value. store that using if loops
        int index = (int)(Math.random()*3);
        int index1 = (int)(Math.random()*defs.size());
        int index2 = (int)(Math.random()*defs.size());
        int index3 = (int)(Math.random()*defs.size());
        System.out.println(words.get(index));
        if(choices[index].equals("A")){
            System.out.println("A "+defs.get(index));
            System.out.println("B "+defs.get(index1));
            System.out.println("C "+defs.get(index2));
            System.out.println("D "+defs.get(index3));
            System.out.println("Choose the correct response(1,2,3 or 4)");
            int valu = user.nextInt();
            if(valu==1){
                val = true;
            }
        } else if(choices[index].equals("B")){
            System.out.println("A "+defs.get(index1));
            System.out.println("B "+defs.get(index));
            System.out.println("C "+defs.get(index2));
            System.out.println("D "+defs.get(index3));
            System.out.println("Choose the correct response(1,2,3 or 4)");
            int valu = user.nextInt();
            if(valu==2){
                val = true;
            }
        } else if(choices[index].equals("C")){
            System.out.println("A "+defs.get(index1));
            System.out.println("B "+defs.get(index2));
            System.out.println("C "+defs.get(index));
            System.out.println("D "+defs.get(index3));
            System.out.println("Choose the correct response(1,2,3 or 4)");
            int valu = user.nextInt();
            if(valu==3){
                val = true;
            }
        } else {
            System.out.println("A "+defs.get(index1));
            System.out.println("B "+defs.get(index2));
            System.out.println("C "+defs.get(index3));
            System.out.println("D "+defs.get(index));
            System.out.println("Choose the correct response(1,2,3 or 4)");
            int valu = user.nextInt();
            if(valu==4){
                val = true;
            }
        }
        if(val==true){
            System.out.println("Right!");
        } else {
            System.out.println("Wrong.");
        }
        System.out.println("The correct answer is "+defs.get(index));
    }
}

