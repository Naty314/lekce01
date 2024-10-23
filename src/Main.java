import java.time.LocalDate;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        School school = new School();
        school.setName("1. ZŠ Česká Lípa");
        System.out.println(school.getName());


        Classmate karel = new Classmate(
                "Karel Novak",
                LocalDate.of(1990, 5, 10), 4,
                school);
        Classmate adela = new Classmate(
                "Adéla Dvořačková", LocalDate.of(1990,4,5),-5,
                school);
        System.out.println(karel.getName());
        System.out.println(karel.isClassOver (3));
        System.out.println(karel.isClassOver (6));
    }
}