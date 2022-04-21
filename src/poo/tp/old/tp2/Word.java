package poo.tp.old.tp2;

public class Word
{
    // ex2q1
    private final String content;

    public String getContent()
    {
        return this.content;
    }

    public Word()
    {
        System.out.print(">:");
        this.content = System.console().readLine();
    }

    // ex2q2

    @Override
    public String toString()
    {
        return this.getContent();
    }

    // ex2q3

    public void afficheVoyelles()
    {
        String orig = this.getContent();
        int n = orig.length();
        String vowels = "aeiou";
        StringBuilder res = new StringBuilder();
        char ch;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                ch = orig.charAt(i);
                if (ch == vowels.charAt(j))
                {
                    res.append(ch);
                }
            }
        }
        System.out.println("vowels: " + res);
    }

    // ex2q4

    public boolean isPalindrome()
    {
        String orig = this.getContent();
        int n = orig.length();
        for (int i = 0; i < n / 2; i++)
        {
            if (orig.charAt(i) != orig.charAt(n - 1 - i))
            {
                return false;
            }
        }
        return true;
    }

    // ex2q5

    public boolean isContainedIn(Word word)
    {
        if (word.getContent().contains(this.getContent()))
        {
            System.out.println("'" + this.getContent() + "' is contained in '" + word.getContent() + "'");
            return true;
        }
        return false;
    }
}
