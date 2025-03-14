import java.util.*;

public class Q5{

    public void Reverse(int start,int end){
      for(int i = start; i>end; i--){
        System.out.print(i + " ");
      }
    }
   public static void main(String args[]){

    Q5 rev = new Q5();
     int num;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number");
     num = sc.nextInt();
     int midnum = num / 2;
     
     
     rev.Reverse(midnum,0);
     System.out.print(midnum+1 + " ");
     rev.Reverse(num,midnum+1);
     
   }
}

