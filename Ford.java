class Ford extends Car{
    public int year;
    public int ManufactureDiscount;

    public Ford(int Speed, double regularPrice, String Color, int year, int ManufactureDiscount){
        super(Speed, regularPrice, Color);
        this.year = year;
        this.ManufactureDiscount = ManufactureDiscount;
    }
    public double getSalePrice(){
        return super.getSalePrice() - ManufactureDiscount;
    }
}