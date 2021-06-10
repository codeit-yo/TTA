//Student bean | Student Class | Student POJO (plain old java object)
//(getter and setter - constructor)
public class Student {
    
    //1. Properties == variable
    int sid;
    String sname;
    double score;
    
    /*
    default const.
    public ClassName()
    {
    
    }
    
    or
    
    parameterized const.
    public ClassName(parameter)
    {
    
    }
    */

    public Student() {
        /*default
        int - 0
        string - null
        double - 0.0
        */
        
    //give any default value to constructor
        this.sid = 0;
        this.sname = "YO";
        this.score = 4.5;
    }
    
    
    
    public Student(int sid, String sname, double score) {
        this.sid = sid;
        this.sname = sname;
        this.score = score;
    }
   
    
    
    //2. Method -> function
    
    //getter and setter
    /*
    setXXX()
    public void setSid(int sid)
    {
        this.sid = sid
    }
    ===========================
    getXXX()
    public int get.Sid()
    {
        return this.sid
    }
    */

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    
}
