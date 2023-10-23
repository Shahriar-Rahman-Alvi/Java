import java.util.Scanner;
public class ThreeNplusOne {

    public static int period(long n){
        System.out.println("\n_______\n");
        int count = 1;
        System.out.println(n + " ");
        while(n != 1){
            if(n%2 == 0){
                n = n/2;
                System.out.println(n + " ");
            }
            else{
                n = (n * 3) + 1;
                System.out.println(n + " ");
            }
            count++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int ans = 0 , i , j , n = -1;
        while(n == -1){
            i = s.nextInt();
           j = s.nextInt();
           for(int a = Math.min(i , j); a <= Math.max(i , j); a++) {
               ans = Math.max(period(a), ans);
           }
               System.out.println("\nMaximum Period length is: " + ans);

               System.out.println("Do you want to continue?" +
                       "\nIf yes then input -1 or input 0 for n");
               n = s.nextInt();
           }

    }
}
