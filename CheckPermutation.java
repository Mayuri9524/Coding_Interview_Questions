import java.lang.reflect.Array;
import java.util.Arrays;

public class CheckPermutation {
    private String str1;
    private String str2;

    public CheckPermutation(String str1, String str2) {
        this.str1 = str1;
        this.str2 =str2;
    }

    public boolean checkPermutationString()
    {
        if(str1.length()!=str2.length())
        {
            return false;
        }
        char[] arr1 =str1.toCharArray();
        Arrays.sort(arr1);

        char[] arr2 =str2.toCharArray();
        Arrays.sort(arr2);

        for(int i=0;i<str1.length();i++)
        {
            if(arr1[i]!=arr2[i])
            {
                return false;
            }
        }
        return true;
    }
}
