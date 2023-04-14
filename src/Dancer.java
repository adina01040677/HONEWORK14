
public class Dancer extends Person{
    private String group;

    public Dancer(String name, String designation, String group) {
        super(name, designation);
        this.group = group;
    }

    public void dancing(){
        System.out.println("skgljnvi");
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "group='" + group + '\'' +
                '}';
    }
}
