package starpatterns;

public class Pattern_5 {

    /*
     ***
      **
       *
     */

    public static void main (String args [] ) {

        int number = 5 ;

        for ( int i = 1 ; i <=number; i ++) {

            for (int j = 1 ; j <= i ; j ++) {

                System.out.print(" ");
            }

            for ( int k = number ; k >=i ; k --) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
