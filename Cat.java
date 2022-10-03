public class Cat {
    public String name;
    public int age;
    public boolean likesCuddles;

    public Cat(String name, int age, boolean likesCuddles) {
        this.name = name;
        this.age = age;
        this.likesCuddles = likesCuddles;
    }

    void displayInfo(){
        if (likesCuddles){
            System.out.printf("My name is %s, I am %s years old and I love cuddles!\n", name, age); 
        } else {
            System.out.printf("My name is %s, I am %s years old and I don't like cuddles!\n", name, age); 
        }
    }
}