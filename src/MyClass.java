public class MyClass {
    String name;
    String surname;
    int age;
    String[] lessons;
    String favoriteFood;

    public MyClass(){
    }

    public MyClass(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public MyClass(String[] lessons, String favoriteFood){
        this.lessons = lessons;
        this.favoriteFood = favoriteFood;
    }
    public void showFirstInfo(){
        System.out.println(String.format("""
                About me:
                Name: %s
                Surname: %s
                Age: %d
                """, name, surname, age));
    }
    public void showSecondInfo(){
        String lessonsInfo = String.join(", ", lessons);
        System.out.println(String.format("""
                My lessons: %s
                Favorite food: %s
                """, lessonsInfo, favoriteFood));
    }
}