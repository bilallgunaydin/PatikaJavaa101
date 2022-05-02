public class Main {
    public static void main(String [] args)
    {
        int [] array={123,34,5,6,7};
        double sum=0;
        double harmonic;
        for(int i=0; i<array.length; i++)
            sum=sum+(1.0/array[i]);

        harmonic=array.length/sum;
        System.out.println(harmonic);
    }

}
