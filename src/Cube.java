public class Cube {

    private int side;

    public Cube(){
        this.side = 1;
    }

    public Cube(int side) {
        this.side = side;
    }

    public int getSide(){
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int calculateSurfaceArea(){
        return 6 * side * side;
    }

    public int calculateVolume() {
        return side * side * side;
    }

    public String ToString() {
        return "Cube{side=" + side + "}";
    }
}
