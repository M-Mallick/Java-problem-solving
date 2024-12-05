// WAP to primt combination of r numbers from n nymbers.
import java.util.Scanner;
class combination {
    public static int fun(int a){
        int fact=1,i=1;
        while(i<=a){
            fact *= i;
            i++;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n and r : ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        if(r>=0 && r<= n){
            int com = fun(n) / (fun(r) * fun(n-r));
            System.out.print(" "+n+"C"+r+" = " + com);
        }
        else{
            System.out.print("Your input is invalid !");
        }
    }
}