import java.time.LocalDate;
import java.time.LocalDateTime;
public class Classmate {
    private String name;
    private LocalDate birthday;
    private int grade;
    private School school;

    public Classmate(String name, LocalDate birthday, int grade, School school) {
        this.name = name;
        this.birthday = birthday;
        this.grade = grade;
        this.school = school;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isClassOver (int limit) {
        return grade > limit;
    }
}
