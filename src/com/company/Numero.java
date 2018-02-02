package com.company;

public class Numero {
    int num;

    public Numero(int num){
        this.num=num;
    }

    public boolean esPar(){
        return num%2==0;
    }

    public boolean esPrimo() {
        int c = 0;
        for (int i = 1; i <= num; i++) {
       if(num%i==0) {
           c++;
       }
        }
        if (c>2)
            return false;
        else
            return true;



    }

}
