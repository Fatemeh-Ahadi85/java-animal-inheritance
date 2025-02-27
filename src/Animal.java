public class Animal {
    protected String name;

    public Animal(String name){
        this.name = name;
    }

    public void makeSound(){
        System.out.println("I'm an animal");
    }

    public void showInfo(){
        System.out.println("name :" + name);
    }
}
