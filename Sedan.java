class Sedan extends Car{
    public int length;

    public Sedan(int Speed, double regularPrice, String Color, int length){
        super(Speed,regularPrice, Color);
        this.length = length;
    }

    public double getSalePrice(){
        if (length >20){
            return super.getSalePrice() - (0.05 * super.getSalePrice());
        }else{
           return super.getSalePrice() - (0.1 * super.getSalePrice()); 
        }
    }
}