public class Programmer extends Person {
    private String CompanyName;

    public Programmer(String companyName,String name, String designation) {
        super(name, designation);
        this.CompanyName=companyName;
    }

    @Override
    public void learn() {
        System.out.println("java");
    }

    @Override
    public void walk() {
        System.out.println("80km/c");
    }

    @Override
    public void eat() {
        System.out.println("Cake");
    }
    public void coding(){
        System.out.println("world");
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "CompanyName='" + CompanyName + '\'' +
                super.toString()+
                '}';
    }
}
