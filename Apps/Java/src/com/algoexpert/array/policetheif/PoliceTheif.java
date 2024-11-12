package com.algoexpert.array.policetheif;

import java.util.ArrayList;

public class PoliceTheif {


    public static int findMaxTheifCaught(char[] array, int k) {

        int count = 0, pi = 0, ti=0;
        ArrayList<Integer> police =  new ArrayList<>();;
        ArrayList<Integer> theif = new ArrayList<>();

        for (int i= 0; i< array.length; i++){
            if(array[i] == 'P'){
                police.add(i);
            } else  if(array[i] == 'T') {
                theif.add(i);
            }
        }

        while (pi < police.size() && ti < theif.size()) {
            if(Math.abs(police.get(pi) - theif.get(ti))<= k ) {
                count++;
                pi++;
                ti++;
            }else if(police.get(pi) > theif.get(ti)){
                ti++;
            }else {
                pi++;
            }
        }
        return count;
    }

    public static void main(String[] args){
       char[] array = new char[]{'P', 'T', 'T', 'P', 'T'};
       System.out.println(findMaxTheifCaught(array, 2));
    }

}
