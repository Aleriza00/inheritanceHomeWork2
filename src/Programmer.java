public class Programmer extends Person {
    private String companyName;

    public Programmer(String name, String designation) {
        super(name, designation);
    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public Programmer() {
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void learn(){
        super.learn();
    }
    @Override
    public  void  walk(){
        super.walk();
    }
    @Override
    public  void eat(){
        super.eat();
    }
    public  void  coding(){
        System.out.println("coding");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", designation='" + getDesignation()+ '\'' +
                ", company name='"+getCompanyName()+ '\'' +
                '}';
    }


}
