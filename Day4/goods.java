package Day4;

public class goods {
    private String ID;
    private String name;
    private int remain;
    private int price;

    public goods() {
    }

    public goods(String ID, String name, int remain, int price) {
        this.ID = ID;
        this.name = name;
        this.remain = remain;
        this.price = price;
    }

    /**
     * 获取
     * @return ID
     */
    public String getID() {
        return ID;
    }

    /**
     * 设置
     * @param ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return remain
     */
    public int getRemain() {
        return remain;
    }

    /**
     * 设置
     * @param remain
     */
    public void setRemain(int remain) {
        this.remain = remain;
    }

    /**
     * 获取
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "goods{ID = " + ID + ", name = " + name + ", remain = " + remain + ", price = " + price + "}";
    }
}
