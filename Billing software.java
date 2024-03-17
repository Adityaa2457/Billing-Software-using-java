/**ADITYA RAJ
 *219302457*/
import java.util.*;
class cafetaria
{
   double totalprice=0.0;
   String coffeeName[]={"null","Esperesso","Lattee","Capuccino","Bru","Robusta","Americano","null","null","null","null","null","null"};
   String teaName[]={"null","Black tea","Green tea","Lemon tea","Oolong tea","null","null","null"};
   String dessertsName[]={"null","Choco lava cake","Hot brownie(ice cream)","Chocolate pastry","Vanilla pastry","Strawberry pastry","Special pastry","Cheese fused cake","null","null","null"}; 
   String sandwichesName[]={"null","Veg sandwich","Non-veg sandwich","Veg grilled sandwich","Non-veg grilled sandwich","Cheese sandwich","Special sandwich","null","null","null"};
   String momosName[]={"null","Veg momo","Paneer momo","Chicken momo","Mixed spl. momo","null","null","null"};
   String icecreamName[]={"null","Black forest","Chocolate","Strawberry","Vanilla","Mango","Black currant","null","null","null"};
   String snacksName[]={"null","Samosa","Cutlet","Veg puff","Veg burger","Egg Puff","Non-veg burger","Veg pizza","Non-veg pizza","null","null","null"}; 
   String beaveragesName[]={"null","Coco cola","Lemon drink","Coconut water","Mineral water","null","null","null"};
   int coffee[]={0,59,79,99,109,109,119,0,0,0};
   int tea[]={0,39,59,49,59,0,0,0};
   int desserts[]={0,119,99,39,29,29,59,99,0,0,0};
   int sandwiches[]={0,39,49,49,59,69,79,0,0,0};
   int momos[]={0,39,49,49,59,0,0,0};
   int icecream[]={0,69,39,39,29,29,49,0,0,0};
   int snacks[]={0,19,29,39,49,59,49,79,99,0,0,0};
   int beaverages[]={0,29,29,49,19,0,0,0};
   String itemName[]=new String[999];
   int price[]=new int[999];
   int quantity[]=new int[999];
   int uninum=0;
   int rating1=0,rating2=0;
   /**function to display menu*/
   private void displayMenu()
   {
      System.out.println("\f"); 
      System.out.println("\t\t************  HARD ROCK CAFE  **************\n\n ");
      System.out.println(" \t\t ***********  MENU ***********\n ");
      System.out.println("1. Coffee\n ");
      System.out.println("2. Tea \n");
      System.out.println("3. Dessert and Confectionaries\n");
      System.out.println("4. Sandwiches \n");
      System.out.println("5. Momos \n");
      System.out.println("6. Ice Creams\n");
      System.out.println("7. Snacks \n");
      System.out.println("8. Beaverages\n");
      System.out.println("9. SEE YOUR ORDERS AND PAY YOUR BILL\n");
      System.out.println("Choose any one of the following category at first\n");
      System.out.println("10.Exit this application\n");
   }
   /**function to display varieties of coffee*/
   private void displayCoffee()
   {
       System.out.println("\t\t********  Coffee  ********\n");
       System.out.println("1. Esperesso                 -  Rs 59");
       System.out.println("2. Latte                     -  Rs 79");
       System.out.println("3. Cappucino                 -  Rs 99");
       System.out.println("4. Bru                       -  Rs 109");
       System.out.println("5. Robusta                   -  Rs 109");
       System.out.println("6. Americano                 -  Rs 119");
       System.out.println("7. Go to main menu\n");
       System.out.println("Choose any one of the coffee varieties at once");
   }
   /**function to display varieties of tea*/
   private void displayTea()
   { 
       System.out.println("\t\t  ***********  Tea  **********\n");
       System.out.println("1. Black tea               -  Rs 39");
       System.out.println("2. Green tea               -  Rs 59");
       System.out.println("3. Lemon tea               -  Rs 49");
       System.out.println("4. Oolong tea              -  Rs 59");
       System.out.println("5. Go to main menu\n");
       System.out.println("Choose any one of the tea varieties at once");
   }
   /**function to display varieties of dessert*/
   private void displayDesserts()
   {
       System.out.println("\t\t**********  Desserts  ***********\n");
       System.out.println("1. Choco lava cake         -  Rs 119");
       System.out.println("2. Hot brownie(ice cream)  -  Rs 99");
       System.out.println("3. Chocolate pastry        -  Rs 39");
       System.out.println("4. Vanilla pastry          -  Rs 29");
       System.out.println("5. Strawberry pastry       -  Rs 29");
       System.out.println("6. Special pastry          -  Rs 59");
       System.out.println("7. Cheese fused cake       -  Rs 99");
       System.out.println("8. Go to main menu\n");
       System.out.println("Choose any one of the desserts");
   }
   /**function to display varieties of sandwiches*/ 
   private void displaySandwiches()
   {
       System.out.println("\t\t**********  Sandwiches  **********\n");
       System.out.println("1. Veg sandwich                -  Rs 39");
       System.out.println("2. Non-veg sandwich            -  Rs 49");
       System.out.println("3. Veg grilled sandwich        -  Rs 49");
       System.out.println("4. Non-veg grilled sandwich    -  Rs 59");
       System.out.println("5. Cheese sandwich             -  Rs 69");
       System.out.println("6. Hard rock Spl. Sandwich     -  Rs 79");
       System.out.println("7. Go to main menu\n");
       System.out.println("Choose any one of the shown varieties of sandwich");
    }
   /**function to display varieties of momos*/
   private void displayMomos()
   {
       System.out.println("\t\t  **********  Momos  ********** \n");
       System.out.println("1. Veg momo                -  Rs 39");
       System.out.println("2. Paneer momo             -  Rs 49");
       System.out.println("3. Chicken momo            -  Rs 49");
       System.out.println("4. Mixed spl. momo         -  Rs 59");
       System.out.println("5. Go to main menu\n");
       System.out.println("Choose any one of the given varieties of momo");
   }
   /**function to display varieties of ice creams*/ 
   private void displayIceCream()
   {
       System.out.println("\t\t  **********  Ice Cream  ********** \n ");
       System.out.println("1. BLack forest            -  Rs 69");
       System.out.println("2. Chocolate               -  Rs 39");
       System.out.println("3. Strawberry              -  Rs 39");
       System.out.println("4. Vanilla                 -  Rs 29");
       System.out.println("5. Mango                   -  Rs 29");
       System.out.println("6. Black currant           -  Rs 49");
       System.out.println("7. Go to main menu\n");
       System.out.println(" Choose any one of the given ice creams");
   }
   /**function to  display varieties of snacks*/
   private void displaySnacks()
   {
       System.out.println("\t\t***********  Snacks  *************\n");
       System.out.println("1. Samosa                  -  Rs 19");
       System.out.println("2. Cutlet                  -  Rs 29");
       System.out.println("3. Veg puff                -  Rs 39");
       System.out.println("4. Veg Burger              -  Rs 49");
       System.out.println("5. Egg Puff                -  Rs 59");
       System.out.println("6. Non-Veg Burger          -  Rs 49");
       System.out.println("7. Veg Pizza               -  Rs 79");
       System.out.println("8. Non Veg Pizza           -  Rs 99");
       System.out.println("9. Go to main menu\n");
       System.out.println(" Choose any one of the given varieties of snacks");
   }
   /**function to display varieties of beaverages*/
   private void displayBeaverages()
   {
       System.out.println("\t\t**********  Beaverages  ************\n");
       System.out.println("1. Coca cola               -  Rs 29");
       System.out.println("2. Lemon Drink             -  Rs 29");
       System.out.println("3. Coconut Water           -  Rs 49");
       System.out.println("4. Mineral Water           -  Rs 19");
       System.out.println("5. Go to main menu\n");
       System.out.println(" Choose one from given beaverages");
   }
   /** function to display user rating*/
   private void displayRating()
   {
       System.out.println("\f");
       Scanner sc=new Scanner(System.in);
       System.out.println("Please rate your food between 1 to 10");
       rating1=sc.nextInt();
       System.out.println("Rate the service of delivery agent between 1 to 10");
       rating2=sc.nextInt();
       System.out.println("You have rated food "+rating1+"and delivery agent "+rating2+"\n Thanks for your valuable feeback ");
   }
   /** function to display Last Menu*/
   private void displayLast()
   {
       System.out.println("\f");
       System.out.println("\t\t*********  Last Menu  ********\n");
       System.out.println("1. Pay and Exit");
       System.out.println("2. Cancel Items");
       System.out.println("3. Rate your order and service of delivery agent");
       System.out.println("4. Go back to main menu\n");
       System.out.println("Choose any one of the following options ");
   }    
   /**function to display bill*/
   private void displayBill()
   {
       if(uninum>0)
       {
          System.out.println("\f");
          System.out.println("\t\t********  BILL  **********\n");
          System.out.printf("%10S","S no.");
          System.out.printf("%30S","Item Name");
          System.out.printf("%10S","Price");
          System.out.printf("%10S","Quantity");
          System.out.printf("%10S","Subtotal");
          System.out.println();
          for(int i=1;i<=uninum;i++)
          {
              System.out.printf("%10d",i);
              System.out.printf("%30S",itemName[i]);
              System.out.printf("%10d",price[i]);
              System.out.printf("%10d",quantity[i]);
              System.out.printf("%10d",(price[i]*quantity[i]));
              System.out.println();
           }       
          System.out.println("Your total without tax is "+totalprice);
          System.out.println("GST IS 18%");
          totalprice=118.0/100*totalprice;
          totalprice=Math.rint(totalprice);
          System.out.println("Grand total is "+totalprice);
       }
       else 
       {
           System.out.println("\f");
           System.out.println("You have ordered nothing. Please order something before checking bill");
       }
   }
   /**function to recieve amount*/
   private void recieveAmount()
   {
       Scanner sc=new Scanner(System.in);
       double p,re,n;
       if(uninum>0)
       {
          System.out.println("Pay your bill");
          p=sc.nextDouble();
          if(p>totalprice)
          {
             re=p-totalprice;
             System.out.println("Rupees "+re+" will be returned to you");
             System.out.println("Thank you for ordering to us");
             System.out.println("Your order is confirmed");
             System.out.println("Thank you for choosing us");    
          }
          else if(p<totalprice)
          {
             re=totalprice-p;
             do
             {
                 System.out.println("Pay "+re+" rupees more");
                 n=sc.nextInt();
                 if(n>re)
                 {
                    re=n-re; 
                    System.out.println("Rupees "+re+" will be returned"); 
                    System.out.println("Thank you for ordering to us");
                    System.out.println("Your order is confirmed");
                    System.out.println("Thank you for choosing us");
                    System.out.println("A delivery partner will be soon assigned ");
                    break;
                 } 
                 if(n==re)
                 {
                    System.out.println("Thank you for ordering to us");
                    System.out.println("Your order is confirmed");
                    System.out.println("Thank you for choosing us");
                    System.out.println("A delivery partner will be soon assigned ");
                    break;
                 }
                 if(n<re)
                 {
                    re=re-n;
                    continue;
                 }
             }while(re!=0);
          }
          else
          {
             System.out.println("Thank you for ordering to us");
             System.out.println("Your order is confirmed");
             System.out.println("Thank you for choosing us");
             System.out.println("A delivery partner will be soon assigned ");
          }
       }
       else 
       {
           System.out.println();
       }
   }
   /**functions to show items ordered */
   private void showItems()
   {
       System.out.println("\f");
       Scanner sc=new Scanner(System.in);
       System.out.println("\t\t********  BILL  **********\n");
       System.out.printf("%10S","S no.");
       System.out.printf("%30S","Item Name");
       System.out.printf("%10S","Price");
       System.out.printf("%10S","Quantity");
       System.out.printf("%10S","Subtotal");
       System.out.println();
       for(int i=1;i<=uninum;i++)
       {
         System.out.printf("%10d",i);
         System.out.printf("%30S",itemName[i]);
         System.out.printf("%10d",price[i]);
         System.out.printf("%10d",quantity[i]);
         System.out.printf("%10d",(price[i]*quantity[i]));
         System.out.println();
       }
       System.out.println("Enter number of items to be cancelled");
       int n=sc.nextInt();
       int n1;
       System.out.println("Choose items to be cancelled");
       for(int i=1;i<=n;i++)
       {
           n1=sc.nextInt();
           itemName[n1]="cancelled";
           price[n1]=0;
           quantity[n1]=0;
       }
       System.out.println("Your Selected Items Have Been Cancelled");
   }
  /**main function */
   public void main()
   {
       Scanner sc=new Scanner(System.in);
       int choice=0,ch1=0,q=0;
       do
       {
           displayMenu();
           choice=sc.nextInt();
           switch(choice)
           {
               case 1:do
                      {
                        System.out.println("\f"); 
                        displayCoffee();
                        ch1=sc.nextInt();
                        if(ch1>=1&&ch1<=6)
                        {
                            System.out.println("Enter the quantity");
                            q=sc.nextInt();
                            itemName[uninum+1]=coffeeName[ch1];
                            price[uninum+1]=coffee[ch1];
                            quantity[uninum+1]=q;
                            uninum++;
                        }
                        switch(ch1)
                        {
                            case 1: totalprice=totalprice+coffee[1]*q;
                                    break;
                            case 2: totalprice=totalprice+coffee[2]*q;
                                    break;
                            case 3: totalprice=totalprice+coffee[3]*q;
                                    break;
                            case 4: totalprice=totalprice+coffee[4]*q;
                                    break;
                            case 5: totalprice=totalprice+coffee[5]*q;
                                    break;
                            case 6: totalprice=totalprice+coffee[6]*q;
                                    break;        
                            default:System.out.println("Invalid input");
                        }
                      }while(ch1!=7);
                      break;
               case 2:do
                      {
                        System.out.println("\f"); 
                        displayTea();
                        ch1=sc.nextInt();
                        if(ch1>=1&&ch1<=4)
                        {
                            System.out.println("Enter the quantity");
                            q=sc.nextInt();
                            itemName[uninum+1]=teaName[ch1];
                            price[uninum+1]=tea[ch1];
                            quantity[uninum+1]=q;
                            uninum++;
                        }
                        switch(ch1)
                        {
                            case 1: totalprice=totalprice+tea[1]*q;
                                    break;
                            case 2: totalprice=totalprice+tea[2]*q;
                                    break;
                            case 3: totalprice=totalprice+tea[3]*q;
                                    break;
                            case 4: totalprice=totalprice+tea[4]*q;
                                    break;
                            default:System.out.println("Invalid input");
                        }
                      }while(ch1!=5);
                      break;
               case 3:do
                      {
                        System.out.println("\f"); 
                        displayDesserts();
                        ch1=sc.nextInt();
                        if(ch1>=1&&ch1<=7)
                        {
                            System.out.println("Enter the quantity");
                            q=sc.nextInt();
                            itemName[uninum+1]=dessertsName[ch1];
                            price[uninum+1]=desserts[ch1];
                            quantity[uninum+1]=q;
                            uninum++;
                        }
                          switch(ch1)
                         {
                            case 1: totalprice=totalprice+desserts[1]*q;
                                    break;
                            case 2: totalprice=totalprice+desserts[2]*q;
                                    break;
                            case 3: totalprice=totalprice+desserts[3]*q;
                                    break;
                            case 4: totalprice=totalprice+desserts[4]*q;
                                    break;
                            case 5: totalprice=totalprice+desserts[5]*q;
                                    break;
                            case 6: totalprice=totalprice+desserts[6]*q;
                                    break;
                            case 7: totalprice=totalprice+desserts[7]*q; 
                                    break;        
                            default:System.out.println("Invalid input");
                        }
                      }while(ch1!=8);
                      break;
               case 4:do
                      {
                        System.out.println("\f"); 
                        displaySandwiches();
                        ch1=sc.nextInt();
                        if(ch1>=1&&ch1<=6)
                        {
                            System.out.println("Enter the quantity");
                            q=sc.nextInt();
                            itemName[uninum+1]=sandwichesName[ch1];
                            price[uninum+1]=sandwiches[ch1];
                            quantity[uninum+1]=q;
                            uninum++;
                        }
                          switch(ch1)
                         {
                            case 1: totalprice=totalprice+sandwiches[1]*q;
                                    break;
                            case 2: totalprice=totalprice+sandwiches[2]*q;
                                    break;
                            case 3: totalprice=totalprice+sandwiches[3]*q;
                                    break;
                            case 4: totalprice=totalprice+sandwiches[4]*q;
                                    break;
                            case 5: totalprice=totalprice+sandwiches[5]*q;
                                    break;
                            case 6: totalprice=totalprice+sandwiches[6]*q;
                                    break;
                            default:System.out.println("Invalid input");
                        }
                      }while(ch1!=7);
                      break;
               case 5:do
                      {
                        System.out.println("\f"); 
                        displayMomos();
                        ch1=sc.nextInt();
                        if(ch1>=1&&ch1<=4)
                        {
                            System.out.println("Enter the quantity");
                            q=sc.nextInt();
                            itemName[uninum+1]=momosName[ch1];
                            price[uninum+1]=momos[ch1];
                            quantity[uninum+1]=q;
                            uninum++;
                        }
                        switch(ch1)
                        {
                            case 1: totalprice=totalprice+momos[1]*q;
                                    break;
                            case 2: totalprice=totalprice+momos[2]*q;
                                    break;
                            case 3: totalprice=totalprice+momos[3]*q;
                                    break;
                            case 4: totalprice=totalprice+momos[4]*q;
                                    break;
                            default:System.out.println("Invalid input");
                        }
                      }while(ch1!=5);
                      break;
               case 6:do
                      {
                        System.out.println("\f"); 
                        displayIceCream();
                        ch1=sc.nextInt();
                        if(ch1>=1&&ch1<=6)
                        {
                            System.out.println("Enter the quantity");
                            q=sc.nextInt();
                            itemName[uninum+1]=icecreamName[ch1];
                            price[uninum+1]=icecream[ch1];
                            quantity[uninum+1]=q;
                            uninum++;
                        }
                          switch(ch1)
                         {
                            case 1: totalprice=totalprice+icecream[1]*q;
                                    break;
                            case 2: totalprice=totalprice+icecream[2]*q;
                                    break;
                            case 3: totalprice=totalprice+icecream[3]*q;
                                    break;
                            case 4: totalprice=totalprice+icecream[4]*q;
                                    break;
                            case 5: totalprice=totalprice+icecream[5]*q;
                                    break;
                            case 6: totalprice=totalprice+icecream[6]*q;
                                    break;
                            default:System.out.println("Invalid input");
                        }
                      }while(ch1!=7);
                      break;
               case 7:do
                      {
                        System.out.println("\f"); 
                        displaySnacks();
                        ch1=sc.nextInt();
                        if(ch1>=1&&ch1<=7)
                        {
                            System.out.println("Enter the quantity");
                            q=sc.nextInt();
                            itemName[uninum+1]=snacksName[ch1];
                            price[uninum+1]=snacks[ch1];
                            quantity[uninum+1]=q;
                            uninum++;
                        }
                          switch(ch1)
                         {
                            case 1: totalprice=totalprice+snacks[1]*q;
                                    break;
                            case 2: totalprice=totalprice+snacks[2]*q;
                                    break;
                            case 3: totalprice=totalprice+snacks[3]*q;
                                    break;
                            case 4: totalprice=totalprice+snacks[4]*q;
                                    break;
                            case 5: totalprice=totalprice+snacks[5]*q;
                                    break;
                            case 6: totalprice=totalprice+snacks[6]*q;
                                    break;
                            case 7: totalprice=totalprice+snacks[7]*q;
                                    break;
                            case 8: totalprice=totalprice+snacks[8]*q;        
                            default:System.out.println("Invalid input");
                        }
                      }while(ch1!=9);
                      break;
               case 8:do
                      {
                        System.out.println("\f"); 
                        displayBeaverages();
                        ch1=sc.nextInt();
                        if(ch1>=1&&ch1<=4)
                        {
                            System.out.println("Enter the quantity");
                            q=sc.nextInt();
                            itemName[uninum+1]=beaveragesName[ch1];
                            price[uninum+1]=beaverages[ch1];
                            quantity[uninum+1]=q;
                            uninum++;
                        }
                        switch(ch1)
                        {
                            case 1: totalprice=totalprice+beaverages[ch1]*q;
                                    break;
                            case 2: totalprice=totalprice+beaverages[2]*q;
                                    break;
                            case 3: totalprice=totalprice+beaverages[3]*q;
                                    break;
                            case 4: totalprice=totalprice+beaverages[4]*q;
                                    break;
                            default:System.out.println("Invalid input");
                        }
                      }while(ch1!=5);
                      break;
               case 9:String s;       
                      x:do
                      {
                          displayLast();
                          ch1=sc.nextInt();
                          switch(ch1)
                          {
                              case 1:displayBill();
                                     recieveAmount();
                                     System.out.println();
                                     System.out.println();
                                     System.out.println("                  Press any key to go back to main menu for a fresh order ");
                                     s=sc.next();
                                     if(true)
                                     {
                                         totalprice=0.0;
                                         uninum=0;
                                         break x;
                                     }
                              case 2:System.out.println("\f");
                                     if(uninum>0)
                                     {
                                     showItems();
                                     break;
                                     }
                                     System.out.println("You have ordered nothing.");
                                     System.out.println("Press any key to go back to main menu for a fresh order ");
                                     s=sc.next();
                                     if(true)
                                     {
                                         uninum=0;
                                         break x;
                                     }
                              case 3:System.out.println("\f");
                                     displayRating();
                              case 4:choice=0;
                                     break x;        
                              default:System.out.println("INVALID INPUT");       
                          }
                      }while(ch1!=3);
                      break;
               case 10:System.out.println("\f");
                       System.out.println(" YOUR APPLICATION IS TERMINATING ");
                       System.out.println();
                       for(int i=1;i<=999999999;i++);
                       for(int i=1;i<=999999999;i++)
                       {
                           for(int j=1;i<=999999999;i++);
                           for(int j=1;i<=999999999;i++);
                           for(int j=1;i<=999999999;i++);for(int j=1;i<=999999999;i++);for(int j=1;i<=999999999;i++);for(int j=1;i<=999999999;i++);
                       }
                       System.out.println("\f");
                       System.out.println("Thank you for using my software\n\n\n");
                       System.out.println("Hope you enjoyed working on it\n\n\n");
                       System.out.println("Creator- Aditya Raj and Mehul Nahata");
                       break;
               default:System.out.println("INVALID INPUT");
           }
       }while(choice!=10);
   }
}