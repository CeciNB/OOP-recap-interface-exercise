package dk.kea.dat19c;

public class Person implements Comparable<Person>{
    String name;
    int height;

    public Person(String name, int height)
    {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Navn: " + name + " Højde: " + height;
    }

    @Override
    public int compareTo(Person p) {
        int result = 0;
        if (this.name.toLowerCase().compareTo(p.getName().toLowerCase()) != 0) {
            result = this.name.toLowerCase().compareTo(p.getName().toLowerCase());
        } else {
            result = this.height - p.getHeight();
        }
        return result;
    }
}
