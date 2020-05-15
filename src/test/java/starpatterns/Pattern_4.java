package starpatterns;

public class Pattern_4 {

    /*
     *
    **
   ***
     */

    public static void main (String args [] ) {

        int number = 3 ;

        for ( int i = 1 ; i <=number; i ++) {

            for (int j = number-1 ; j >=i ; j --) {

                System.out.print(" ");
            }

            for ( int k = 1 ; k <=i ; k ++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
