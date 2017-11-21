package pojo;

public class Order {
    int ammount;
    Rectangle size;

    public Order(){}

    public Order(int ammount, Rectangle size) {
        this.ammount = ammount;
        this.size = size;
    }

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }

    public Rectangle getSize() {
        return size;
    }

    public void setSize(Rectangle size) {
        this.size = size;
    }
}
