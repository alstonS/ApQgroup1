public class CodeWordChecker {

    private int max;
    private int min;
    private String noWord;

    public CodeWordChecker(int max, int min, String noWord)
    {
        this.max= max;
        this.min= min;
        this.noWord = noWord;


    }
    public CodeWordChecker(String noWord)
    {
        this.noWord=noWord;

    }

    public boolean isValid(String str)
    {

        if(str.length()>=min&& str.length() <= max && str.contains(noWord)!=true)
        {
            return true;
        }
        return false;


    }



}
