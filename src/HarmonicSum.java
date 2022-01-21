public class HarmonicSum {

    public static void main(String[] args) {

        final int MAX_DENOMINATOR = 50000;
        double sumL = 0.0;
        double sumR = 0.0;
        double absDiff;

        for( int denominator = 1; denominator <= MAX_DENOMINATOR; ++denominator){
            System.out.println(sumL += denominator);
        }
        for (int i = MAX_DENOMINATOR; i > 0 ; i--) {
            System.out.println( "Derecha - Izquierda: " + (sumR += i));
        }

        System.out.println( "sumL: " + sumL);
        System.out.println( "sumR: " + sumR);
    }
}

