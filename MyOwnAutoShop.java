class MyOwnAutoShop{
    public static void main(String[] args){
         Car cr = new Car(40, 60000.0, "indigo");
        Sedan sed = new Sedan(50,20000.0, "pink", 21);

        Ford fd = new Ford(20, 200, "yellw",2001,20000);

        Ford df = new Ford(10,300,"blue", 2022, 1);

       

        System.out.println("Sedan sale price " + sed.getSalePrice());
         System.out.println("ford1 sale price "+fd.getSalePrice());
          System.out.println("ford2 sale price "+df.getSalePrice());
           System.out.println("Car sale price " + cr.getSalePrice());

    }
}