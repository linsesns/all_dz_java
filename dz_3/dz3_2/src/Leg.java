public class Leg {
    private int size;

    public Leg(int size) {
        this.size = size;
    }

    public int getLength() {
        return size;
    }

    public void setLength(int length) {
        this.size = length;
    }

    @Override
    public String toString() {
        return "Leg {" +
                "size = " + size +
                '}';
    }
}