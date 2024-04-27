import java.util.Scanner;

public class GenericsExample 
{
    public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer array size:");
        int n = sc.nextInt();
		int m = sc.nextInt();
        Integer[] array1 = new Integer[n];
		Integer[] array2 = new Integer[m];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++)
		{
            array1[i] = sc.nextInt();
        }
        show(array1);
		System.out.println("Enter " + m + " integers:");
        for (int i = 0; i < m; i++)
		{
            array2[i] = sc.nextInt();
        }
        show(array2);
        
        System.out.println("Enter double array size:");
        n = sc.nextInt();
        Double[] doubleArray = new Double[n];
        System.out.println("Enter " + n + " doubles:");
        for (int i = 0; i < n; i++) 
		{
            doubleArray[i] = sc.nextDouble();
        }
        show(doubleArray);
        
        System.out.println("Enter string array size:");
        n = sc.nextInt();
        String[] stringArray = new String[n];
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++)
		{
            stringArray[i] = sc.next();
        }
        show(stringArray);

       
        System.out.println("Enter char array size:");
        n = sc.nextInt();
        Character[] charArray = new Character[n];
        System.out.println("Enter " + n + " characters:");
        for (int i = 0; i < n; i++)
		{
            charArray[i] = sc.next().charAt(0);
        }
        show(charArray);
    }

    public static <T> void show(T[] a)
	{
        System.out.println(<T> + "Array:");
        for (int i = 0; i < a.length; i++) 
		{
            System.out.println(a[i]);
        }
    }
}
