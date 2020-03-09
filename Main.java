import java.util.*;


public class Main 
{
    public static void printArray(ArrayList<Integer> al)
   {
        for(int i : al)
       {
        System.out.print(i+" ");
        }
     System.out.println("\n");
   }

public  static void main(String args[])
 {
     ArrayList<Integer> al=new ArrayList<Integer>();
    for(int i=1;i<=10;i++)
    {
         al.add(i);
     }
    
    Scanner s=new  Scanner(System.in);
    while(true)
    {
    System.out.println("Enter an value from 1 to 4 : \n");
    System.out.println("1-PUSH\n2-REMOVE\n3-CHECK\n4-PRINT\n5-EXIT\n");
    int idx=s.nextInt();
    if(idx==5)
    {
        System.out.println("-----TERNINATING THE LOOP------ \n");
        break;
    }
    else
    {
        switch(idx)
        {
         
        case 1:
             System.out.println("Enter an integer to push : \n");
             int num1=s.nextInt();
             if(al.contains(num1))
             {
                 System.out.println("value already exists\n");
                 break;
             }
             System.out.println();
             al.add(num1);
             break;
        case 2:
            System.out.println("Enter an index to remove : \n");
             int num2=s.nextInt();
             if(num2<0 || num2>=al.size())
             {
                 System.out.println("\nINVALID INDEX \n\n ENTER A VALUE FROM 0 TO "+(al.size()-1)+"\n");
                 break;
             }
             System.out.println();
             al.remove(num2);
             break;
        case 3:
             System.out.println("check if a value exists ! : \n");
             int num3=s.nextInt();
             System.out.println();
             System.out.println(al.contains(num3));
             System.out.println();
             break;
        case 4:
            System.out.println("----------PRINTING THE ARRAYLIST------------\n");
            printArray(al);
            break;
        default :
            System.out.println("PLEASE ENTER A VALID INDEX !");
     }
    }
    }      
 }
     
}