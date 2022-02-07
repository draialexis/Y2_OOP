package poo.tp.premierspas;

// 1)

public class Date implements Comparable<Date>
{
    private final int day;
    private final int month;
    private final int year;

    public int getDay()
    {
        return this.day;
    }

    public int getMonth()
    {
        return this.month;
    }

    public int getYear()
    {
        return this.year;
    }

    public Date(int day, int month, int year)
    {
        this.day = validateD(day);
        this.month = validateM(month);
        this.year = validateY(year);
    }

    private int validateD(int day)
    {
        if (1 > day || day > 31)
        {
            throw new IllegalArgumentException("day:[1, 31]");
        }
        return day;
    }

    private int validateM(int month)
    {
        if (1 > month || month > 12)
        {
            throw new IllegalArgumentException("month:[1, 12]");
        }
        return month;
    }

    private int validateY(int year)
    {
        if (year < 0)
        {
            throw new IllegalArgumentException("year[0, MAX_INT]");
        }
        return year;
    }

    // 3)

    @Override
    public String toString()
    {
        return String.format("%02d/%02d/%04d", this.day, this.month, this.year);
    }

    // 4)

    @Override
    public int compareTo(Date d)
    {
        if (this.year < d.getYear())
        {
            return -1;
        } else if (this.year > d.getYear())
        {
            return 1;
        } else
        {
            if (this.month < d.getMonth())
            {
                return -1;
            } else if (this.month > d.getMonth())
            {
                return 1;
            } else
            {
                return Integer.compare(this.day, d.getDay());
            }
        }
    }
}
// 2)
// javac -Xlint:all -d build src/poo/tp/premierspas/Date.java
// java -cp build poo.tp.premierspas.Date