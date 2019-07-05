import java.util.*;
public class StudentGrade {
  //to calculate the student grade
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
        float average= calculateAverage(sum,noofstudents);
        int maximum= calculateMaximum(marks);
        int minimum= calculateMinimum(marks);
        System.out.println(average);
        System.out.println(maximum);
        System.out.println(minimum);

    }
    //to calculate the average of student marks
    public static float calculateAverage(int total, int n)
    {
        float avg=total/n;
        return avg;
    }
    //to calculate the minimum of student marks
    public static int calculateMaximum(int arr[])
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
    //to calculate the minimum of student marks
    public static int calculateMinimum(int arr[])
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

