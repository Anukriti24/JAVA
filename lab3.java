import java.util.Scanner;

public class lab3 {
    public static void main(String[] args){
    // You work in railways and need to store information about train no, train name, train source and 
    // train destination. Use array concept to achieve this and store data in efficient manner.

    // Taking user input using scanner classs
    Scanner a = new Scanner(System.in); // creating an object for the scanner class
    Scanner b = new Scanner(System.in);

    // creating an array with length given by user storing train numbers
    System.out.println("Type number of entries you want to enter: ");
    int n = a.nextInt();
    System.out.println(" ");


    System.out.println(" ************* SINGLE DIMENSIONAL ARRAY PRINTING THE TRAIN NUMBERS *********** " );
    String[] reg = new String[n];  // declaring size.

    System.out.println("Enter Train Numbers");  // Print statement for train numbers

    // Loop to display Train Numbers
    for(int i=0;i<n;i++)
    {
        System.out.println("Enter Value " + i + ": ");
        
        reg[i] = b.nextLine();
    } 

    System.out.println(" ");
    System.out.println("List of train numbers are : ");
    
    for(String i: reg){      // for each loop for printing the train numbers
            System.out.print(i + "\n");
        }

    System.out.println(" ");
    System.out.println("****** MULTIDIMENSIONAL ARRAY PRINTING THE TRAIN DETAILS ********* ");
   
    // #################################### //

    Scanner input  = new Scanner(System.in); // creating an object of the scanner class
    String[][] var= new String[n][n];   // / Declaring the two-dimensional array  

    // Taking various train details from user and storing it in multidimensional array
    for (int q=0;q<3;q++)
    {
        if(q==0){
            System.out.println(" ");
            System.out.println("LIST OF TRAIN NAMES ONE BY ONE");
            }
        if(q==1){
            System.out.println(" ");
            System.out.println("LIST OF TRAIN SOURCES ONE BY ONE");
            
        }if(q==2){
            System.out.println(" ");
            System.out.println("LIST OF TRAIN DESTINATION ONE BY ONE");
            
        }

        



        



        for (int k=0;k<3;k++)
        {
            var[q][k]=input.nextLine();
        }
    }

    System.out.println("***** TRAIN DETAILS *******");
    System.out.println(" ");

    // Printing train details stored in multi-dimensional array
    for(int j=0;j<3;j++)
    {
        for(int l=0;l<n;l++)
        {
            System.out.print(var[j][l] + "\t");
        }
        System.out.println("\n");
        
    }


    }
}