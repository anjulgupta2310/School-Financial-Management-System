public class Student extends Person {

    private int id;
    
    private int grade;
    private int feesPaid;
    private int feesTotal;

    
    public Student(int id, String name,int age,int grade){
        super(name,age);
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id=id;
        this.grade=grade;

    }

    
    public void setGrade(int grade){
        this.grade=grade;
    }


    
    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    
    public int getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }

    
    public int getFeesPaid() {
        return feesPaid;
    }

    
    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name :"+getName()+
                " Total fees paid so far Rs. "+ feesPaid;
    }
}
