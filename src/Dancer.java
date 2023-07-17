public class Dancer extends Person{
    private  String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public Dancer(String name, String designation) {
        super(name, designation);
    }

    public Dancer() {
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
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
    public  void dancing(){
        System.out.println("Dancing ");
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", designation='" + getDesignation() + '\'' +
                ", group name = "+getGroupName()+'\''+
                '}';
    }
}
