import java.util.Scanner;
class Program3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num1 : ");
        int a = sc.nextInt();
        System.out.print("Enter a num 2 : ");
        int b = sc.nextInt();

        int largest = (a > b)? (a) : (b);
        System.out.printf
        ("Largest number among (%d , %d) is : %d" ,a,b,largest);
        
    }
}