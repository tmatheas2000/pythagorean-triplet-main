import java.util.ArrayList;
import java.util.List;
public class PythagoreanTriplet{
    private int a,b,c;
    private static List<PythagoreanTriplet> tripletList = new ArrayList<>();
    private static PythagoreanTriplet instance = new PythagoreanTriplet();
    private static int N;
    public PythagoreanTriplet() {
    }
    public PythagoreanTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public static PythagoreanTriplet makeTripletsList() {
        tripletList = new ArrayList<>();
        return instance;
    }
    public static PythagoreanTriplet withFactorsLessThanOrEqualTo(int limit) {
        return instance;
    }
    public static PythagoreanTriplet thatSumTo(int sum) {
        N = sum;
        return instance;
    }
    public static List<PythagoreanTriplet> build() {
        for (int a = 1; a <= N/3; a++) {
            for (int b = a+1; b <= N/2; b++) 
            {
                 int c = N - a - b;
                 if ( a*a + b*b == c*c )
                {
                    tripletList.add(new PythagoreanTriplet(a,b,c));
                }
            }
        }
        return tripletList;
    }

    @Override
    public boolean equals(Object other) {
        if (! (other instanceof PythagoreanTriplet))
            return false;
        PythagoreanTriplet triplet = (PythagoreanTriplet) other;
        return (triplet.a == this.a && triplet.b == this.b && triplet.c == this.c);
    }
   
}
