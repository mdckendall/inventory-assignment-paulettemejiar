
import java.util.Scanner;
import java.util.ArrayList;

class Main {
 

public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
    ArrayList<Inventory> itemList = new ArrayList<Inventory>();  
    Inventory item ;
  
  while(true){
      System.out.println(
      "Press 1 to add an item.\nPress 2 to delete an item.\nPress 3 to update an item.\nPress 4 to show all items.\nPress 5 to quit the program.");
      int keys = input.nextInt();

      if (keys == 5 ){
        break;
      }
      else if (keys == 1){
        System.out.println("Enter the name:");
          String n = input.next();
        n = n + input.nextLine();
        
        System.out.println("Enter the serial number:");
        String s = input.nextLine();
        
        System.out.println("Enter the value in dollars (whole number):");
        int p = input.nextInt();
        
        item = new Inventory(n,s,p);
        itemList.add(item);
    
      }
      
      else if (keys ==2){
        
        System.out.println("Enter serial number of the item to delete:");
        String sn = input.next();
        sn = sn + input.nextLine();
        for (Inventory i : itemList){
          if (i.getSerial().equals(sn)){
            itemList.remove(i);
          }
        }
      }
      
        
      else if(keys ==3){
        System.out.println("Enter serial number of the item to change:");
        String s = input.next();
        s = s + input.nextLine();

        System.out.println("Enter new name:");
        String n = input.nextLine();

        System.out.println("Enter the new value in dollars (whole number):");
          int p = input.nextInt();
        for (Inventory i : itemList){
          if (i.getSerial().equals(s)){
            
            i.setName(n);
            i.setPrice(p);
              
          }
        }

        
        
      }
      else if(keys ==4){
        for(Inventory i : itemList ){
          
        System.out.println(i);  
          
        }
        
        
      }



      
    }
    
   
    
  }


}