public class Table extends Furniture {
    double square;
    String material;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public Table(String material, double square){
        this.material=material;
        this.square=square;
    }
    @Override
    public void DoorClose() {
    }

    @Override
    public void DoorOpen() {
    }
}