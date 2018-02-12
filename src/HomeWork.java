import java.io.File;
import java.io.IOException;

/**
 * Java-1 Homework 5
 *
 * @author DSerov
 * @version dated 10 Feb, 2018
 * @link https://github.com/dserov/GB-HomeWork-Lesson-5/
 */
public class HomeWork {
    public static void main(String[] args) throws IOException {
        PersonManager personManager = new PersonManager(5);

        String fileName = "persons.json";
        // есть ли уже файл
        boolean alreadyExists = new File(fileName).isFile();
        if (!alreadyExists) {
            // проинициализируме 5-ю сотрудниками
            personManager.initPerson();
            // вывод в файл
            personManager.savePersonsToFile(fileName);
            System.out.println("Файл " + fileName + " создан!");
        } else {
            // прочитаем данные из файла
            personManager.loadPersonsFromFile(fileName);
            System.out.println("Файл " + fileName + " прочитан!");

            // вывод всех сотрудников сташе 40 лет
            personManager.printInfo(40);
        }
    }
}
