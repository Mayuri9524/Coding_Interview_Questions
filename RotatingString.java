import java.io.*;

public class RotatingString {

    public void CheckRotatingString(String Str, String Str2)
    {
        String Str3=Str2+Str2;

        if(Str3.contains(Str))
        {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
