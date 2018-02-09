public class HomeWork {
    private Person persons[];

    public static void main(String[] args) {
        HomeWork homeWork = new HomeWork();
        homeWork.initPerson();
        for (Person person : homeWork.persons)
            if (person.getAge() > 40)
                System.out.println(person.toString());
    }

    private void initPerson() {
        persons = new Person[5];
        persons[0] = new Person("Ivanov Ivan", "Ingener", "person1@gmail.com", "89821234567", 10000, 25);
        persons[1] = new Person("Petrov Petr", "Teacher", "person2@gmail.com", "89821789567", 20000, 35);
        persons[2] = new Person("Sidorov Sidr", "Programmer", "person3@gmail.com", "89821314567", 30000, 45);
        persons[3] = new Person("Smirnov Sasha", "SysAdmin", "person4@gmail.com", "89821234567", 40000, 50);
        persons[4] = new Person("Nemiroff Alex", "Uborszitsa", "person5@gmail.com", "89845234567", 50000, 55);
    }
}
