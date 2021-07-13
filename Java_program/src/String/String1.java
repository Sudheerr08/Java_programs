package String;

public class String1 {

    public static void main(String[] args) {
        String str = "My Name is Arjita",str1 ="";

        for(int i =str.length()-1;i>=0;i--)
        {

           str1=str1+str.charAt(i);
        }
        System.out.println("Input is : "+str);
        str1 =str1.replace("si","Si");
        str1=str1.replaceFirst("t","t ");


        System.out.print(" Output is : "+str1);

    }
}
