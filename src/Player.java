public class Player {
    public Player(String name, Integer number) {
        this.name = name;
        this.number = number;
    }

    private String name;
    private Integer number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Player name: " + this.name + " number " + this.number + " ";
    }

}
