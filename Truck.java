class Truck extends Car{
    public int Weight;

    public Truck(int Speed, double regularPrice, String Color, int Weight){
       super(Speed, regularPrice, Color);
       this.Weight = Weight;
    }

       public double getSalePrice(){
           if(Weight > 2000){
               return super.getSalePrice() -(0.1* super.getSalePrice());
           }else{
                return super.getSalePrice() -(0.2* super.getSalePrice());
           }
       }

}
