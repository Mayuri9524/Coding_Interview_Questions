import java.util.Arrays;

public class IsUniqueString {
    private String str;

    public IsUniqueString(String s)
    {
        str=s;
    }
// First Algo
    public boolean CheckIsUniqueString()
    {
        char[] arr= str.toCharArray();
        Arrays.sort(arr);
        for(int i=1;i< arr.length;i++)
        {
            if(arr[i]==arr[i-1])
            {
                return true;
            }
        }
        return false;

    }
// Second Algo
    public boolean CheckIsUniqueLogic()
    {
        int A =0;
        for(int i=0;i<str.length();i++) {

            int arr = str.charAt(i) - 'a';
            if ((A & (1 << arr)) > 0) {
                return true;
            }
            A |= (1 << arr);
        }
        return false;
    }
}
