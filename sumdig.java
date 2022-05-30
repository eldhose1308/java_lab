import java.util.Scanner;
class sumdig
{
     
    static int sumdig(int n)
    {
        int sum = 0;
 
        
        while (n > 0 || sum > 9)
        {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String argc[])
    {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n=s.nextInt();
        System.out.println(sumdig(n));
    }
}