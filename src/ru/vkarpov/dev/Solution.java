package ru.vkarpov.dev;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Study task - Replacement numbers
*/

public class Solution {

    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {

        String filename;
        List<String[]> list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            filename = reader.readLine();
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))){
            while (reader.ready()){
                list.add(reader.readLine().split(" "));
            }
        }

        for (String[] str : list){
            for (String s : str){
                try {
                    int i = Integer.parseInt(s);
                    if (i > 12)
                        System.out.print(s + " ");
                    else
                        System.out.print(map.get(i) + " ");
                } catch (NumberFormatException e) {
                    System.out.print(s + " ");
                }
            }
        }
    }

}


