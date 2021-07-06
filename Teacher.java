


public class Teacher extends Person {

    private int id;
    
    private int salary;
    private int earnedSalary;
   
    public Teacher(int id, String name,int age, int salary){
        super(name,age);
        this.id=id;
        
        this.salary=salary;
        this.earnedSalary=0;
    }

    public int getId(){
        return id;
    }
    


    
    public int getSalary(){
        return  salary;
    }

    
    public void setSalary(int salary){
        this.salary=salary;
    }


    public void receiveSalary(int salary){
        earnedSalary+=salary;
        School.updateTotalMoneySpent(salary);  
    }


    @Override
    public String toString() {
        return "Name of the Teacher: " + getName()
                +" Total salary earned so far Rs. "
                + earnedSalary;
    }
}
