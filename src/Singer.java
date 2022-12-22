public class Singer extends Person{
    private String bandName;

    public Singer(String bandName, String name, String designation) {
        super(name, designation);
        this.bandName = bandName;

    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
    public void singing(){
        System.out.println("nashida");
    }
    public void playGitar(){
        System.out.println("spanish gitar");
    }

    @Override
    public void learn() {
        System.out.println("opera");
    }

    @Override
    public void walk() {
        System.out.println("30km/ch");
    }

    @Override
    public void eat() {
        System.out.println("eggs");
    }

    @Override
    public String toString() {
        return "Singer{" +
                "bandName='" + bandName + '\'' +
                super.toString()+
                '}';
    }
}
