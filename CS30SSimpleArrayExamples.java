import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.Random;

/** ***************************************************
 *  Name:           Aarya
 *  Class:          CS30S
 * 
 *  Assignment:    Simple Array Examples
 * 
 *************************************************************/

public class CS30SSimpleArrayExamples extends FormatTemplateV4 {

    public static void main(String[] args) throws IOException{
        // ***** constants *******
        // a new line character that works on every computer system
        final String nl = System.lineSeparator();
        // ***** variables *****

        String banner = "";             // output banner
        String prompt = "";             // prompt for user input

        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output

        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records
        
        //declare, allocate, and populate a simple array
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] list = new int[10];
        //System.out.println(list);
        
        int n = 0;         // temp input from keyboard
        int count = 0;     //actaul size f array

        // ***** objects *****
        Scanner scanner = new Scanner(System.in);
        //NumberFormat currency = NumberFormat.getCurrencyInstance();
        Random random = new Random();
        
        // file io buffers for reading and writing to text files
        
        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));

        // ***** print banners *****

        banner = "*****************************" + nl;
        banner += "Name:        Aarya" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  Simple Array Examples" + nl;
        banner += "*****************************" + nl + nl;

        System.out.println(banner);
        //fout.print(banner);

        // ***** examples *****
        
        //load the array with random numbers
        // System.out.println("loading the list with random number");
        
        // for(int i = 0; i < list.length; i++){
            // list[i] = random.nextInt(6);
        // }//end load list
    
        
        //load array from the keyboard
        //pre-loop
        count = 0;
        
        System.out.println("enter number, 0 to the end.");
        n = scanner.nextInt();
        
        while(n != 0 && count < 10){
            list[count++] = n;        //add n to the list at index count
            
            n = scanner.nextInt();
        }//end while
        
        //print the arary
        for(int i=0; i < count; i++){
                System.out.println(i + ". " + list[i]);
        }//end for int i
            
        // for(int i=0; i < daysInMonth.length; i++){
                // System.out.println(daysInMonth[i]);
        // }//end for int i

    
        // ***** Main Processing *****

        // ***** Print Formatted Output *****

        // ***** Closing Message *****

        System.out.println();
        System.out.println("end of processing");
        //fout.println("End of Processing");
        
         // **** close io buffers *****
    
        //fin.close();
        //fout.close();
    } // end main 

} // end FormatTemplate
