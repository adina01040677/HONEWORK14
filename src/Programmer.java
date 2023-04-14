public class Programmer extends Person {
    private String companyName;

    public Programmer(String name, String designation) {
        super( name, designation );
        this.companyName = companyName;
    }


    public void coding() {
        System.out.println( getName() + " - ITник " );
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "companyName='" + companyName + '\'' +
                '}';
    }
}
