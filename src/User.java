public class User {
    private String name;
    private Integer age;

    public String getName() {

        return name;
    }

    public void setName(String name) throws IllegalNameLengthException {
        if (name.length() > 20) {
            throw new IllegalNameLengthException("Incorrect name is entered.");
        }
        this.name = name;

    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if (age <= 0 || age > 100) {
            throw new IllegalAgeException("Incorrect age is entered.");
        }
        this.age = age;
    }
}
