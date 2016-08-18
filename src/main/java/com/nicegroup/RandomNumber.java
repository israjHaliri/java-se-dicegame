package com.nicegroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by gsp on 15/08/2016.
 */
public class RandomNumber {

    public int getNumber(){
        int number;
        Random rand = new Random();
        number = rand.nextInt(6) + 1;
        return number;
    }

    public List<String> listNumber(int range){

        List<String> listNumber = new ArrayList<String>();
        RandomNumber randomNumber = new RandomNumber();

        for (int i=0; i < range; i++){
            int newNumber = randomNumber.getNumber();
            listNumber.add(Integer.toString(newNumber));

        }
        return listNumber;
    }
}
