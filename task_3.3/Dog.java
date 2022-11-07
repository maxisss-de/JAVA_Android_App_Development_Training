class Dog {
    
    public static void main(String[] args) {
        Dog bolder = new Dog("Болдер", 15);
        System.out.println ("Имя собаки "+bolder.getName()+", её возраст: "+ bolder.getAge());
    }

    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
