package Advance.AdvQues2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static private Map<String,String> phoneBook=new HashMap<String,String>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("Press 1 to Add new phone book entry");
            System.out.println("Press 2 to search a phone number");
            System.out.println("Press 3 to Quit");
            int choice=sc.nextInt();
            if(choice==1)
            {
                System.out.println("Enter Name");
                String tempName=sc.next();
                System.out.println("Enter Number");
                String tempNumber=sc.next();
                if(!phoneBook.containsKey(tempName))
                    phoneBook.put(tempName,tempNumber);
                else
                    System.out.println("Number already present");
            }
            else if(choice==2)
            {
                System.out.println("Enter Name in Phone Book to search : ");
                String tempName=sc.next();
                if(phoneBook.containsKey(tempName))
                {
                    System.out.println("Name : "+tempName+" - "+phoneBook.get(tempName));
                }
            }
            else if(choice==3)
                break;
        }
    }
}