 class Car{

     public int Speed;
     public double regularPrice;
     public String Color;
  

     public Car(int Speed, double regularPrice, String Color){
         this.Speed = Speed;
         this.regularPrice = regularPrice;
         this.Color = Color;


     }

        public double getSalePrice(){
            return regularPrice;
        }
}