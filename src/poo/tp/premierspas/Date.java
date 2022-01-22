package poo.tp.premierspas;

// 1)

public class Date implements Comparable<Date> {
    int day;
    int month;
    int year;

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public Date(int day, int month, int year) {
        if (day < 1 || day > 31 || month < 1 || month > 12 || year < 0) {
            throw new IllegalArgumentException("day:[1, 31]; month:[1, 12]; year[0, +oo[");
        }

        this.day = day;
        this.month = month;
        this.year = year;
    }

    // 3)

    @Override
    public String toString() {
        return day + "-" + month + "-" + year;
    }

    // 4)

    @Override
    public int compareTo(Date d) {
        if (year < d.getYear()) {
            return -1;
        } else if (year > d.getYear()) {
            return 1;
        } else {
            if (month < d.getMonth()) {
                return -1;
            } else if (month > d.getMonth()) {
                return 1;
            } else {
                return Integer.compare(day, d.getDay());
            }
        }
    }
}
// 2)
// javac -Xlint:all -d build src/poo/tp/premierspas/Date.java
// java -cp build poo.tp.premierspas.Date