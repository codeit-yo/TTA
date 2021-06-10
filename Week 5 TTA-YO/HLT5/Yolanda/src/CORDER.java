
public class CORDER {
    
    int orderid;
    String cname;
    String phone;
    String address;
    String itemid;
    int qty;
    double total;
    String date;

    public CORDER() {
    }

    public CORDER(int orderid, String cname, String phone, String address, String itemid, int qty, double total, String date) {
        this.orderid = orderid;
        this.cname = cname;
        this.phone = phone;
        this.address = address;
        this.itemid = itemid;
        this.qty = qty;
        this.total = total;
        this.date = date;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getItemid() {
        return itemid;
    }

    public void setItemid(String itemid) {
        this.itemid = itemid;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
}//class end
