package com.sda.algorytmy;

import java.util.Arrays;


public class App 
{
    public static void main( String[] args ){

        int[] tab = new int[]{2,1,4,5};
        int tempo = 0;

        for (int i = 0; i < tab.length - 1; i++) {
            if (tab[i] > tab[i +1]){
                tempo = tab[i];
                tab[i] = tab[i+1];
                tab[i +1] = tempo;
            }

        }
        for (int i : tab) {
            System.out.print(i + " ");
        }

    }

    }

