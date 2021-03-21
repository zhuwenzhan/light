package com.geek.algorithm.light.Algorithm.solution;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AddDigits {

    /**
     *
     * @param num
     * @return
     */
    public int addDigits(int num){
        if(num < 10){
            return num;
        }
        while(num > 10){
            String temp = String.valueOf(num);
            num = 0;
            for(int i = 0; i < temp.length(); ++i ){
                num = num + (int) temp.charAt(i);
               System.out.println("i = {}"+ i);
                System.out.println("temp = {}" + temp.charAt(i));
            }
        }
        return num;
    }

    public int addDigits2(int num){
        if(num < 10) return num;
        while(num > 10) {
            int next = 0;
            while(num != 0){
                next = next + num%10;
                num = num/10;
            }
            num = next;
        }
        return num;
    }
}
