public class Cube {
    private int side;
    public Cube(){
        side=1;
    }
    public Cube(int x){
        side = x;
        if (side < 1)
            throw new IllegalArgumentException();
    }
    public void setSide(int side){
        this.side = side;
        if (side < 1)
            throw new IllegalArgumentException();
    }
    public int getSide(){
        return side;
    }
    public int getSurfaceArea(){
        return (6 * side * side);
    }
    public int getVolume(){
        return (side * side * side);
    }
    public String toString(){
        return "Side length: " + side;
    }
}