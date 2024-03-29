public class Head {

    private String hair;
    private int type;

    public String getHair() {
        return hair;
    }

    public int getType() {
        return type;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Head(String hair, int type) {
        this.hair = hair;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Head {" +
                "hair = " + hair +
                ",type = " + type +
                '}';
    }
}