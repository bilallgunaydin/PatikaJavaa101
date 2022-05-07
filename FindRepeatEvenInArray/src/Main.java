import java.util.ArrayList;

public class Main {

    public static void main(String [] args)
    {

        int [] list={3,5,7,1,23,4,5,67,4,6,6};
        ArrayList duplicateEven=new ArrayList();
        for(int i=0; i<list.length; i++)
        {
            for(int j=0; j<list.length; j++)
            {
                if(i!=j && (list[i]==list[j]) && list[i]%2==0)
                    if(!duplicateEven.contains(list[i]))
                        duplicateEven.add(list[i]);
            }
        }
        for(var i: duplicateEven)
            System.out.print(i+" ");
    }
}
