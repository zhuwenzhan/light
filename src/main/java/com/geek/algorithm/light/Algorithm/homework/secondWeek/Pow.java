package com.geek.algorithm.light.Algorithm.homework.secondWeek;

public class Pow {

    /**
     * 2021-03-16
     * violence
     */
    public double myPow(double x, int n){
        double result = 1;
        if(n == 0){
            return 1;
        }else if(n > 0){
            for(int i = 0; i < n; ++i){
                result = result * x;
            }
        }else{
            for(int j = 0; j > n; --j){
                result = result * x;
            }
            result = 1/result;
        }
        return result;
    }

    /**
     * 2021-03-16
     * recurtion
     */
    public double divide(double x, int n){
        //terminator
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return x;
        }
        //process

        //drill down
        double result = divide(x, n/2);
        //result
        if(n%2 == 0) {
            return result * result;
        }else{
            return result * result * x;
        }
    }

}
