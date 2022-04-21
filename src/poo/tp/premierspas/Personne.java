package poo.tp.premierspas;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class Personne
{
    private       String        lastName;
    private       String        firstName;
    private       Date          weddingDate;
    private       Personne      spouse;
    private final Date          dob;
    private final Set<Personne> parents = new HashSet<>(2);

    public Personne(String lastName, String firstName, Date dob)
    {
        this(lastName, firstName, null, null, dob, null, null);
    }

    public Personne(String lastName, String firstName, Date dob, Personne p1)
    {
        this(lastName, firstName, null, null, dob, p1, null);
    }

    public Personne(String lastName, String firstName, Date dob, Personne p1, Personne p2)
    {
        this(lastName, firstName, null, null, dob, p1, p2);
    }

    public Personne(String lastName,
                    String firstName,
                    Date weddingDate,
                    Personne spouse,
                    Date dob,
                    Personne p1,
                    Personne p2)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.weddingDate = weddingDate;
        this.spouse = spouse;
        this.dob = dob;
        this.addParent(p1);
        this.addParent(p2);
    }

    public boolean addParent(Personne parent)
    {
        if (this.parents.size() == 2 && !parents.contains(parent))
        {
            throw new IllegalArgumentException("This person already has two parents");
        }
        if (parent.getDob().compareTo(this.getDob()) >= 0)
        {
            throw new IllegalArgumentException("A parent can't be younger than its child");
        }
        return this.parents.add(parent);
    }

    public Set<Personne> getParents()
    {
        return Collections.unmodifiableSet(parents);
    }

    public boolean removeParent(Personne parent)
    {
        return this.parents.remove(parent);
    }

    public boolean isSibling(Personne other)
    {
        if (other == null)
        {
            throw new IllegalArgumentException("one cannot be a sibling of null");
        }
        for (Personne p : other.getParents())
        {
            if (this.parents.contains(p))
            {
                return true;
            }
        }
        return false;
    }

    public boolean isParent(Personne other)
    {
        if (other == null)
        {
            throw new IllegalArgumentException("one cannot be a parent of null");
        }
        return other.isChild(this);
    }

    public boolean isChild(Personne other)
    {
        if (other == null)
        {
            throw new IllegalArgumentException("one cannot be a child of null");
        }
        return this.parents.contains(other);
    }

    public String getLastName()
    {
        return this.lastName;
    }

    public String getFirstName()
    {
        return this.firstName;
    }

    public String getFullName()
    {
        return this.getFirstName() + " " + this.getLastName();
    }

    public Date getDob()
    {
        return this.dob;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public boolean isMarried()
    {
        return this.weddingDate != null && this.spouse != null;
    }

    public Personne getSpouse()
    {
        return this.spouse;
    }

    public Date getWeddingDate()
    {
        return this.weddingDate;
    }

    public boolean divorce()
    {
        if (!isMarried())
        {
            return false;
        }
        this.weddingDate = null;
        this.spouse.divorce();
        this.spouse = null;
        return true;
    }

    private Personne validateWedding(Personne spouse, Date weddingDate)
    {
        if (this.isMarried() || (spouse.isMarried() && spouse.getSpouse() != this))
        {
            throw new IllegalStateException("Only single persons can be wed. Call divorce to make a person single");
        }
        if (weddingDate.compareTo(this.getDob()) <= 0)
        {
            throw new IllegalArgumentException("Wedding date must be after birth date");
        }
        if (spouse.isSibling(this) || spouse.isParent(this) || spouse.isChild(this))
        {
            throw new IllegalArgumentException("Can't wed a family member");
        }
        return spouse;
    }

    public boolean wed(Personne spouse, Date weddingDate)
    {
        if (this.spouse == spouse)
        {
            return false;
        }
        this.spouse = this.validateWedding(spouse, weddingDate);
        this.weddingDate = weddingDate;
        try
        {
            spouse.wed(this, weddingDate);
            return true;
        } catch (Exception e)
        {
            this.spouse = null;
            this.weddingDate = null;
            throw e;
        }
    }

    @Override
    public String toString()
    {
        return String.format("Person<%s>", this.getFullName());
    }
}
