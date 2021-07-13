package Package3_Array;

public class removeduplicate {

    public static void main(String[] args) {

    int a[] = {1,2,2,2,3,3,3,3,4,4,5,5,6,6,7,7,8,9,9};
    int []temp = new int[a.length];
    int b =a.length-1;
    int j=0,i;
    for( i =0;i<b;i++)
    {
       if(a[i]!=a[i+1])
       {
               a[j] = a[i];
               j++;

       }


    }
        a[j]=a[b];
       int c= j;
    i=0;

    do {

        System.out.println(" "+a[i]);
        i++;
    }while (i<=j);

 }
}
