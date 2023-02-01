import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Animal {

    private LocalDate Birthday;
    private String name;

    public Animal(LocalDate birthday, String name) {
        Birthday = birthday;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getBirthday() {
        return Birthday;
    }

    public void setBirthday(LocalDate birthday) {
        Birthday = birthday;
    }





        public static void main(String[] args) {
            Animal Cat = new Animal(LocalDate.of(2022, 1, 2),"Cat");
            LocalDate heute = LocalDate.now();
            LocalDate nexttgebutstag = Cat.getBirthday().withYear(heute.getYear());
            if (nexttgebutstag.isBefore(heute) || nexttgebutstag.isEqual(heute)) {
                nexttgebutstag = nexttgebutstag.plusYears(1);
            }
            long daysUntilNextBirthday = ChronoUnit.DAYS.between(heute, nexttgebutstag);
            System.out.println("Days until " + Cat.getName() + "'s next birthday: " + daysUntilNextBirthday);
        }


}
