 class Inventory{
   private String name;
   private String serial;
   private int price;

  public Inventory(String name,String serial,int price){
    this.name =name;
    this.serial =serial;
    this.price =price;

  }
   public void setName(String name){
     this.name =name;
     
   }
   public String getName(){
     return name;
   }
   public void setSerial(String serial){
     this.serial =serial;
   }
   public String getSerial(){
     return serial;
   }
   public void setPrice(int price){
     this.price =price;
   }
   public int getPrice(){
     return price;
   }
   @Override
   public String toString(){
     return name+ "," + serial+ "," + price;
   }
   

   
   }