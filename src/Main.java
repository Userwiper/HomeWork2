import javax.sound.midi.Soundbank;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // Задача 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Первая переменная dog "+ dog +" Вторая переменная cat " + cat +" Третья переменная paper " + paper );

        // Задача 2
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Первая переменная dog "+ dog + " Это уже новая задача - 2");
        System.out.println("Вторая переменная cat " + cat);
        System.out.println("Третья переменная paper " + paper);

        // Задача 3
        var newDog = dog - 3.5;
        var newCat = cat - 1.6;
        var newPaper = paper - 7639;
        System.out.println ("Новое значение переменной Dog, представленное в виде другой переменной "+ newDog + " Новое значение переменной cat " + newCat + " Новое значение переменной paper "+ newPaper);

        // Задача 4
        var friend = 19;
        System.out.println (friend + " Это уже новая задача - 4");
        friend = friend + 2;
        System.out.println (friend);
        friend = friend / 7;
        System.out.println (friend);

        // Задача 5
        var frog = 3.5;
        System.out.println (frog + " Это уже новая задача - 5");
        frog = frog * 10;
        System.out.println (frog);
        frog = frog / 3.5;
        System.out.println (frog);
        frog = frog + 4;
        System.out.println (frog);

        // Задача 6
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeightBoxers = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общая масса боксеров " + totalWeightBoxers + " Это уже новая задача - 6");
        var massDifference = secondBoxerWeight - firstBoxerWeight; // Первый способ
        System.out.println("Разница в весе между боксерами " + massDifference);

        // Задача 7
        var massDifferenceTwoMethod = secondBoxerWeight % firstBoxerWeight; // Второй способ
        System.out.println ("Разница в весе между боксерами " + massDifferenceTwoMethod);

        // Задача 8
        var totalTime = 640; // Общее количество часов
        var timePerEmployee = 8; // Время на одного сотрудника
        var totalEmployees = totalTime / timePerEmployee; // Всего работников
        System.out.println ("Всего работников в компании " + totalEmployees);

        // Задача 9
        totalEmployees = totalEmployees + 94;
        totalTime = totalEmployees * timePerEmployee;
        System.out.println ("Если в компании работает " + totalEmployees + " человек" + " То всего " + totalTime + " часов работы может быть поделено между сотрудниками");




    }
}