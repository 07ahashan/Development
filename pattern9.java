public class pattern9 {
    public static void main(String[] args) {
        int n = 5;
/*       for(int i=90;i>=86;i--)
        {
            for(int j=90;j>=i;j--)
            {
                System.out.print(((char)j));
            }
            System.out.println("");
        }

 */
//        other logic


    /*   for(int i=5;i>=1;i--)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print((char)(j+85));
            }
            System.out.println("");
        }

     */

    /*   for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
        */


        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print("*");
                } else if (i+j==6) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}