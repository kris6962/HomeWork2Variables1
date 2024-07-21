public class Main {
    public static void main(String[] args) {

        // task 1
        System.out.println("Task1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // task 2
        System.out.println("Task2");
        dog += 4;
        cat += 4;
        paper += 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // task 3
        System.out.println("Task3");
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // task 4
        System.out.println("Task4");
        var friend = 19;
        System.out.println(friend);

        friend += 2;
        System.out.println(friend);

        friend /= 7;
        System.out.println(friend);

        // task 5
        System.out.println("Task5");
        var frog = 3.5;
        System.out.println(frog);

        frog *= 10;
        System.out.println(frog);

        frog /= 3.5;
        System.out.println(frog);

        frog += 4;
        System.out.println(frog);

        // task 6
        System.out.println("Task6");
        var weight1 = 78.2;
        var weight2 = 82.7;

        var summ = weight1+weight2;
        System.out.println("Общая масса бойцов " + summ + " кг.");

        var diff = weight2-weight1;
        System.out.println("Разница между массами бойцов " + diff + " кг.");

        // task 7
        System.out.println("Task7");
        var diff1 = weight2 % weight1;
        System.out.println("Остаток от деления: " + diff1);

        // task 8
        System.out.println("Task8");
        var workHours = 640;
        var hoursPerEmployee = 8;

        var countOfEmployees = workHours/hoursPerEmployee;
        System.out.println("Всего работников в компании — " + countOfEmployees + " человек.");

        countOfEmployees += 94;
        var newWorksHours = countOfEmployees * hoursPerEmployee;
        System.out.println("Если в компании работает " + countOfEmployees +
                " человек, то всего " + newWorksHours + " часов работы может быть поделено между сотрудниками.");

    }
}