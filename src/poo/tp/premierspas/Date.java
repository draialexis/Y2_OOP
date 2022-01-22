package poo.tp.premierspas;

public class Date {
    short day;
    short month;
    short year;

    public short getDay() {
        return day;
    }

    public short getMonth() {
        return month;
    }

    public short getYear() {
        return year;
    }

    public Date(short day, short month, short year) {
        if (day < 1 || day > 31 || month < 1 || month > 12 || year >= 0) {
            throw new IllegalArgumentException("day:[1, 31]; month:[1, 12]; year[0, +oo[");
        }

        this.day = day;
        this.month = month;
        this.year = year;
    }
}
