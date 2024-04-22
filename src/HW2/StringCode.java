package HW2;

import java.util.HashSet;
public class StringCode {
    public static String blowup(String str){
        String res = new String();
        int i=0;
        int x = 0;
        int n = str.length();
        while (i<n){
            char temp = str.charAt(i);
            if (temp >='0' && temp<='9'){
                if (i==n-1)
                    return res;
                else{
                    x = Character.getNumericValue(temp);
                    i += 1;
                    if (str.charAt(i)>='0' && str.charAt(i)<='9')
                        res += str.charAt(i);
                }
            }
            else{
                if (x>0) {
                    for (int j = 0; j <= x; ++j)
                        res += temp;
                    x = 0;
                }
                else
                    res += temp;
                i += 1;
            }
        }
        return res;
    }
    public static int maxRun(String str){
        int n = str.length();
        int maxLen = 1;
        int i = 0;
        while (i<n){
            int count = 1;
            char temp = str.charAt(i);
            while (i+1<n && str.charAt(i+1)==temp){
                count ++;
                i++;
            }
            if (count>maxLen)
                maxLen = count;
            i++;
        }
        return maxLen;
    }
    public static boolean stringIntersect(String a, String b, int len){
        HashSet <String> set = new HashSet<>();
        for (int i=0; i<=a.length()-len; i++)
            set.add(a.substring(i,i+len));
        for (int j=0; j<=b.length()-len; j++)
            if (set.contains(b.substring(j,j+len)))
                return true;
        return false;
    }
    public static void main(String[] args){
        System.out.println(blowup("a3tx2z"));
        System.out.println(maxRun("xxyyyz"));
        System.out.println(stringIntersect("xxou","oou",2));
    }
}
