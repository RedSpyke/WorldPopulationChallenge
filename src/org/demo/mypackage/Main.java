package org.demo.mypackage;
/*
JetBrains Academy Challenge:
A file that stores data on the world population since 1950, according to the United States Census Bureau (2017).

Write a Java program to find out in what year the largest increase in population occurred as compared to the previous year.

The file has two columns: year and population.
 */

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file = new File ("dataset_91069.txt");
        int largestIncrease = 0;
        int year = 0;
        String population = "";
        ArrayList<String> data = new ArrayList<>();

        try (Scanner input = new Scanner(file)){
            while (input.hasNext()){
                String localData = input.nextLine();
                if(localData.contains("year")||localData.contains("population")){
                    continue;
                }else {
                    data.add(localData);
                }
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

        for (int i = 0; i < data.size(); i++) {
          //   System.out.println(data.get(i));
            year = Integer.parseInt(data.get(i).substring(0,4));
           // System.out.println(year);
            population = data.get(i).substring(5);
            System.out.println(population);

        }

    }
}
