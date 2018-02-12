import com.google.gson.Gson;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Сохранение и чтение карточек сотрудников
 *
 * @author DSerov
 * @version dated 12 Feb, 2018
 * @link https://github.com/dserov/GB-HomeWork-Lesson-5/
 */
public class PersonManager {
    private Person persons[];

    public PersonManager(int personSize) {
        this.persons = new Person[personSize];
    }

    public void initPerson() {
        if (persons.length != 5)
            persons = new Person[5];
        persons[0] = new Person("Ivanov Ivan", "Ingener", "person1@gmail.com", "89821234567", 10000, 25);
        persons[1] = new Person("Petrov Petr", "Teacher", "person2@gmail.com", "89821789567", 20000, 35);
        persons[2] = new Person("Sidorov Sidr", "Programmer", "person3@gmail.com", "89821314567", 30000, 45);
        persons[3] = new Person("Smirnov Sasha", "SysAdmin", "person4@gmail.com", "89821234567", 40000, 50);
        persons[4] = new Person("Nemiroff Alex", "Uborszitsa", "person5@gmail.com", "89845234567", 50000, 55);
    }

    public void savePersonsToFile(String fileName) throws IOException {
        try (FileWriter fileWriter = new FileWriter(fileName)) {
            Gson gson = new Gson();
            for (Person person: this.persons ) {
                fileWriter.write(gson.toJson(person));
                fileWriter.write("\n");
            }
        }
    }

    public void loadPersonsFromFile(String fileName) throws IOException {
        boolean alreadyExists = new File(fileName).isFile();
        if (!alreadyExists) throw new IOException("Файл не существует!");
        try (FileReader fileReader = new FileReader(fileName)) {
            Gson gson = new Gson();
            Scanner scanner = new Scanner(fileReader);
            int personIndex = 0;
            while (scanner.hasNext() && personIndex < this.persons.length)
                this.persons[personIndex++] = gson.fromJson(scanner.nextLine(), Person.class);
            scanner.reset();
        }
    }

    public void printInfo(int minAge) {
        // вывод инфы по фильру
        for (Person person : persons)
            if (person != null && person.getAge() > minAge)
                System.out.println(person.toString());
    }
}
