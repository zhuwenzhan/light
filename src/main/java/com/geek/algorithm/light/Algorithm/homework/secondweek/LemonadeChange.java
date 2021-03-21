package com.geek.algorithm.light.Algorithm.homework.secondweek;

public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for(int bill : bills){
            if(bill == 5){
                ++five;
            }else if(bill == 10){
                if(five > 0){
                    --five;
                    ++ten;
                }else {
                    return false;
                }
            }else if(bill == 20){
                if(ten > 0 && five >0){
                    --five;
                    --ten;
                }else if(five >3){
                    five = five -3;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}

