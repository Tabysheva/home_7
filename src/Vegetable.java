public abstract class Vegetable {
     private int size;
     private String colour;
    private  String type;

    public abstract void Tasted1 ();
    public abstract void Tasted2 ();

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
