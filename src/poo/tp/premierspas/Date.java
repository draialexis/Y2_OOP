package poo.tp.premierspas;

public final class Date implements Comparable<Date>
{
    private final int year;
    private final int month;
    private final int day;

    public Date(int y, int m, int d)
    {
        if (y < 0)
        {
            throw new IllegalArgumentException("year must be positive");
        }
        if (m < 1 || m > 12)
        {
            throw new IllegalArgumentException("month must be between 1 and 12");
        }
        if (d < 1 || d > 31)
        {
            throw new IllegalArgumentException("day must be between 1 and 31");
        }
        this.year = y;
        this.month = m;
        this.day = d;
    }

    public int getYear()
    {
        return this.year;
    }

    public int getMonth()
    {
        return this.month;
    }

    public int getDay()
    {
        return this.day;
    }

    @Override
    public int compareTo(Date o)
    {
        if (this.getYear() != o.getYear())
        {
            return Integer.compare(this.getYear(), o.getYear());
        }
        if (this.getMonth() != o.getMonth())
        {
            return Integer.compare(this.getMonth(), o.getMonth());
        }
        if (this.getDay() != o.getDay())
        {
            return Integer.compare(this.getDay(), o.getDay());
        }
        return 0;
    }

    @Override
    public String toString()
    {
        return String.format("%04d-%02d-%02d", getYear(), getMonth(), getDay());
    }

    @Override
    public int hashCode()
    {
        return java.util.Objects.hash(this.getYear(), this.getMonth(), this.getDay());
    }

    @Override
    public boolean equals(Object other)
    {
        if (other == this)
        {
            return true;
        }
        if (other == null)
        {
            return false;
        }
        if (other.getClass() != this.getClass())
        {
            return false;
        }
        Date otherDate = (Date) other;
        return this.getYear() == otherDate.getYear()
               && this.getMonth() == otherDate.getMonth()
               && this.getDay() == otherDate.getDay();
    }
}
