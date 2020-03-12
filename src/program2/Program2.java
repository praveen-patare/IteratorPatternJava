/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package program2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jagannath
 */
public class Program2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int integer_size, double_size, string_size;
        String strings[];
        Double doubles[];
        Integer integers[];
        //FileReader f = new FileReader("G:\\College\\OOAD\\Program2\\data.txt");
        File f = new File("G:\\College\\OOAD\\Program2\\data.txt");
        Scanner s;    
        try {
            iIterator itr;
            s = new Scanner(f);
            integer_size = s.nextInt();
            double_size = s.nextInt();
            string_size = s.nextInt();
            integers = new Integer[integer_size];
            doubles = new Double[double_size];
            strings = new String[string_size];
            //System.out.println("Integer size : " + integer_size + "Double size :" + double_size + "String size : " + string_size);    
            for(int i = 0; i < integer_size; i++){
                integers[i] = Integer.parseInt(s.next());
            }
            
            for(int i=0; i < double_size; i++){
                doubles[i] = Double.parseDouble(s.next());
            }
            
            for(int i=0; i < string_size; i++){
                strings[i] = s.next();
            }

            DoubleIteraor doble = new DoubleIteraor(doubles);
            itr = doble.iterator();
            printAll(itr);

            IntegerIterator integer = new IntegerIterator(integers);
            itr = integer.iterator();
            printAll(itr);
                        
            StringIterator string = new StringIterator(strings);
            itr = string.iterator();
            printAll(itr);

            
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
    }
    
    public static void printAll(iIterator i){
        //System.out.println("Printing " + i.toString());    
        while(!i.IsDone()){
            System.out.println(i.next());
        }    
    }
    
}
