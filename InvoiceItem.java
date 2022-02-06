package com.company;

public class InvoiceItem {
    private String id, desc;
    public int qty;
    private double unitPrice;

    public InvoiceItem(String i, String d, int q, double uP){
        id = i;
        desc = d;
        qty = q;
        unitPrice = uP;
    }
    public String getId(){
        return id;
    }
    public String getDesc() {
        return desc;
    }
    public int getQty() {
        return qty;
    }
    public double getUnitPrice() {
        return unitPrice;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal(){
        return  unitPrice * qty;
    }

    public String Print(){
        return "InvoiceItem[id=" + id + ",desc=" +  desc + ",qty= " + qty +  ",unitPrice=" + unitPrice +  "]";
    }
}
