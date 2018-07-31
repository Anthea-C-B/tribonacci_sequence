
package easy;

import javax.swing.JOptionPane;

public class tribonacci {
    public static void main(String[]args){
        
        try{
            int startNum1 = Integer.parseInt(JOptionPane.showInputDialog("Starting number one "));

            int startNum2 = Integer.parseInt(JOptionPane.showInputDialog("Starting number two"));

            int startNum3 = Integer.parseInt(JOptionPane.showInputDialog("Starting number three"));

            int nthPosition = Integer.parseInt(JOptionPane.showInputDialog("Stop value"));

            int temp = 0 ;
            System.out.println("Your starting numbers are : " + startNum1 + "," +startNum2 + "," + startNum3);
            System.out.println("The Tribonnaci sequence is as follows : ");

            System.out.print(startNum1 + "," +startNum2 + "," + startNum3 );

            for(int x = 0;x<nthPosition - 3;++x){
                temp = startNum3;
                startNum3 = startNum1 + startNum2 + startNum3;
                startNum1 = startNum2;
                startNum2 = temp;
                System.out.print( ","+ startNum3);
            }
            System.out.println("\nThe number at the " + nthPosition + " term is : " + startNum3);
        }catch(NumberFormatException ex){
            System.out.println("You have entered a value that is not a number, please try again");
        }
    }
}
