package Arrays;

import java.util.Scanner;

public class Calculate_The_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i< arr.length; i++)
        {
            arr[i] = sc.nextInt();

        }
                int q = sc.nextInt();

        while(q-->0)
        {
            int x = sc.nextInt();
            int[] brr = new int[arr.length];
            for(int i = 0; i<arr.length; i++)
            {
                int idx = i-x;
                if(idx<0)
                {
                    idx+=arr.length;

                }
                brr[i] = arr[i] + arr[idx];

            }
            arr = brr;

        }
        int sum = 0;
        for(int i = 0; i<arr.length; i++)
        {
            sum = sum + arr[i];

        }

        double result = (sum % (Math.pow(10,9)+7));
        System.out.print((int)(result));


	}

}
