package com.leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate {

    public String predictPartyVictory(String senate) {

        Queue<Integer> radiantVotes = new LinkedList<>();
        Queue<Integer> direVotes = new LinkedList<>();

        for(int i =0; i < senate.length(); i++){
            if(senate.charAt(i) =='R'){
                radiantVotes.offer(i);
            } else{
                direVotes.offer(i);
            }
        }
        while(!radiantVotes.isEmpty() && !direVotes.isEmpty()){
            int rIndex = radiantVotes.poll();
            int dIndex = direVotes.poll();

            if(rIndex < dIndex){
                radiantVotes.offer(senate.length() + rIndex);
            } else {
                direVotes.offer(senate.length() + dIndex);
            }
        }
        return radiantVotes.isEmpty() ?  "Dire" : "Radiant";
    }
    public static void main(String[] args) {
        Dota2Senate dota2Senate = new Dota2Senate();
        String senate = "RDD";
        System.out.println(dota2Senate.predictPartyVictory(senate));


    }
}
