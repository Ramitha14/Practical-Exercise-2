import java.util.*;
public class StudentGrade {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int noofstudents=sc.nextInt();
        int marks[]=new int[noofstudents];
        int sum=0;
        for(int i=0;i<noofstudents;i++)
        {
            marks[i]=sc.nextInt();
            sum=sum+marks[i];
        }
        float average=Calculateaverage(sum,noofstudents);
        int maximum=Calculatemaximum(marks);
        int minimum=Calculateminimum(marks);
        System.out.println(average);
        System.out.println(maximum);
        System.out.println(minimum);

    }
    public static float Calculateaverage(int total,int n)
    {
        float avg=total/n;
        return avg;
    }
    public static int Calculatemaximum(int arr[])
    {
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;

    }
    public static int Calculateminimum(int arr[])
    {
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;

    }

}

