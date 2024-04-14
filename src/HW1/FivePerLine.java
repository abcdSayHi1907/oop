package HW1;

public class FivePerLine {
    public static void main(String[] args){
        for (int i=1000; (i)<=2000; i+=1)
        {
            System.out.print(i+"\t");
            if (i%5==4)
                System.out.println();
        }
    }
}
