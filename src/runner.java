public class runner {
    public static void main(String[] args)
    {
        CodeWordChecker newChecker = new CodeWordChecker(1,20,"Carrot");
        CodeWordChecker newChecker2 = new CodeWordChecker("dioasdzxc")
        String str1 = "carrtotckae";
        String str2= "cake";
        String str3  = "kono dio da";
        System.out.println(newChecker.isValid(str1));
        System.out.println(newChecker.isValid(str2));
        System.out.println(newChecker.isValid(str3));
        System.out.println(newChecker2.isValid("asdasdasdasdasdq2weasd"));

    }


}
