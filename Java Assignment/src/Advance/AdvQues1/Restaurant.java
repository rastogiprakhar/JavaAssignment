package Advance.AdvQues1;

import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        System.out.println("press 1 to display dishes");
        System.out.print("press 2 to search dish : ");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println();
        Menu menu=new Menu();
        if(x==1)
        {
            int i=1;
            for(Dish dish:menu.menulist)
            {
                System.out.println("Dish "+i+" "+dish.getDishName());
                i++;
            }
        }
        else if(x==2)
        {
            System.out.print("Enter dishID : ");
            int checkID=sc.nextInt();
            System.out.println();
            for(Dish dish:menu.menulist)
            {
                if(checkID==dish.getDishID())
                {
                    System.out.println("DishID : "+dish.getDishID());
                    System.out.println("DishName : "+dish.getDishName());
                    System.out.println("DishTime : "+dish.getTime());
                    break;
                }
            }
        }
        else
        {
            System.out.println("enter correct option");
        }
    }
}
