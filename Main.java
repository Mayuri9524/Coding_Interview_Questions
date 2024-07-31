public class Main {
    public static void main(String[] args) {
        /* IsUniqueString.Java
        String str ="abcdsjnf";
        IsUniqueString obj= new IsUniqueString(str);
        if(obj.CheckIsUniqueLogic())
        {
            System.out.println("They are not unique");
        }
        else {
            System.out.println("They are unique");

        }
         */

        /*
        CheckPermutation code
        String str1 ="abb";
        String str2= "abc";

        CheckPermutation obj = new CheckPermutation(str1,str2);
        if(obj.checkPermutationString())
        {
            System.out.println("permutation");
        }
        else {
            System.out.println("not permutation");

        }

         */

        String A = "WaterBottler";
        String B = "BottlerWate";
        RotatingString obj= new RotatingString();
        obj.CheckRotatingString(A,B);

    }
}