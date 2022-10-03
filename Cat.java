public class Cat {
    String name;
    int age;
    boolean likesCuddles;

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Mittens";
        cat.age = 3;
        cat.likesCuddles = true;
        if(cat.likesCuddles) {
            System.out.println(cat.name + " likes cuddles!");
        } else {
            System.out.println(cat.name + " does not like cuddles!");
        }
    } 
}