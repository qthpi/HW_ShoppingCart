class Item{
    String itemName;
    int itemCount;
    double itemPrice;
    double itemTotal;

    Item(String itemName, int itemCount, double itemPrice){
        this.itemName = itemName;
        this.itemCount = itemCount;
        this.itemPrice = itemPrice;
        this.itemTotal = getItemTotal(itemCount, itemPrice);
    }

    public double getItemTotal(int itemCount, double itemPrice) {
        itemTotal = Double.valueOf(itemCount) * itemPrice;
        return itemTotal;
    }
}