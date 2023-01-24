package se3.pdt.beautysalon.adapters;

public class ProductAdapter {

    private  Integer inId;
    private  String item;
    private  int quantity;
    private  double cost;

    public ProductAdapter() {
    }

    public ProductAdapter(Integer inId) {
        this.inId = inId;
    }

    public ProductAdapter(Integer inId, String item, int quantity, double cost) {
        this.inId = inId;
        this.item = item;
        this.quantity = quantity;
        this.cost = cost;
    }

    public Integer getInId() {
        return inId;
    }

    public void setInId(Integer inId) {
        this.inId = inId;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

}