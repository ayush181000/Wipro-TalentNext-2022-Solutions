public class Price {
    private int Flowerid;
    private String FlowerName;
    private String Flowercolor;

    public Price(int flowerid, String flowerName, String flowercolor) {
        Flowerid = flowerid;
        FlowerName = flowerName;
        Flowercolor = flowercolor;
    }

    public Price() {
        // TODO Auto-generated constructor stub
    }

    public int getFlowerid() {
        return Flowerid;
    }

    public void setFlowerid(int flowerid) {
        Flowerid = flowerid;
    }

    public String getFlowerName() {
        return FlowerName;
    }

    public void setFlowerName(String flowerName) {
        FlowerName = flowerName;
    }

    public String getFlowercolor() {
        return Flowercolor;
    }

    public void setFlowercolor(String flowercolor) {
        Flowercolor = flowercolor;
    }
}