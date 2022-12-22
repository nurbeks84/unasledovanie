public class Dancer extends Person{
    private String groupName;

    public Dancer(String groupName,String name, String designation) {
        super(name, designation);
        this.groupName = groupName;

    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void learn() {
        System.out.println("Lezginka");
    }

    @Override
    public void walk() {
        System.out.println("50km/ch");
    }

    @Override
    public void eat() {
        System.out.println("shaurma");
    }
    public void dancing(){
        System.out.println("kyrgyzstan");
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "groupName='" + groupName + '\'' +
                super.toString()+
                '}';
    }
}
