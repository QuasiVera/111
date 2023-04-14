package pack1;

public class Fox {
    private String name;
    private int cunning_level;
    private String color;

    public Fox(String name, int cunning_level, String color) {
        this.name = name;
        this.cunning_level = cunning_level;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fox{" +
                "name='" + name + '\'' +
                ", cunning_level=" + cunning_level +
                ", color='" + color + '\'' +
                '}';
    }
}
