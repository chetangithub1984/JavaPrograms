package starpatterns;

public class Pattern_6 {

   /*          *
               **
              ***
              ****
              *****
              ****
              ***
              **
              *  */

    public static void main (String args [] ) {

        int number = 5 ;

        for ( int i = 1 ; i <=number; i ++) {

            for (int j = number-1 ; j >=i ; j --) {

                System.out.print(" ");
            }

            for ( int k = 1 ; k <=i ; k ++) {
                System.out.print("*");

            }
            System.out.println();
        }

        for ( int i = 1 ; i <=number; i ++) {

            for (int j = 1 ; j <= i ; j ++) {

                System.out.print(" ");
            }

            for ( int k = number-1 ; k >=i ; k --) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
