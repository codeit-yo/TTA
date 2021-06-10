
public class MANAGER {
    
    String name;
    String shift;
    double salary;
    int mid;

    public MANAGER() {
    }

    public MANAGER(String name, String shift, double salary, int mid) {
        this.name = name;
        this.shift = shift;
        this.salary = salary;
        this.mid = mid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }
    
    

}//class end