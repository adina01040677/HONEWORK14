public class Person {
    private String name;
    private String designation;

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public Person() {
    }

    public void learn(){
        System.out.println( name+ "learning");
    }
    public void walk(){
        System.out.println(name + "walking");
    }
    public void eat(){
        System.out.println( name + "eating");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}

//private String name;
//    private String designation;
//
//    public Person(String name, String designation) {
//        this.name = name;
//        this.designation = designation;
//    }
//
//    public void learn() {
//    }
//    public void walk(){
//    }
//    public void eat(){
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDesignation() {
//        return designation;
//    }
//
//    public void setDesignation(String designation) {
//        this.designation = designation;
//    }
//персондун ичи
//и + геттер сеттер

//public class Programmer extends Person{
//    private String companyName;
//
//    public Programmer(String name, String designation, String companyName) {
//        super(name, designation);
//        this.companyName = companyName;
//    }
//
//
//    public void coding(){
//        System.out.println(getName() + " - ITник ");
//    }
//    public String getCompanyName() {
//        return companyName;
//    }
//
//    public void setCompanyName(String companyName) {
//        this.companyName = companyName;
//    }
//
//    @Override
//    public String toString() {
//        return "Programmer{" +
//                "companyName = '" + companyName + ''' +
//                '}';
//    }
