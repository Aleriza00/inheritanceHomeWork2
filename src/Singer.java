public class Singer extends Person{
    private  String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public Singer(String name, String designation) {
        super(name, designation);
    }

    public Singer() {
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
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
    public  void  singing(){
        System.out.println("singing");
    }
    public  void  playGitar(){
        System.out.println("Play gitar");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", designation='" + getDesignation() + '\'' +
                ", band name ="+getBandName()+'\''+
                '}';
    }
}
