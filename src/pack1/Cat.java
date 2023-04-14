package pack1;

public class Cat {
    private String name;
    private String ownerName;
    private String color;

    public Cat(String name, String ownerName, String color) {
        this.name = name;
        this.ownerName = ownerName;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    void speak(){
        System.out.println("РјСЏСѓ");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Cat)){
            return false;
        }
        Cat cat = (Cat) obj;
        return name.equals(cat.name) && ownerName.equals(cat.ownerName) && color.equals(cat.color);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + 7*ownerName.hashCode() + 13*color.hashCode();
    }
}
