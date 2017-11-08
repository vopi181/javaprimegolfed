public class Main {

    public static void main(String[] args) {
        int oɐɯlʎʎʎʎɐ=Short.valueOf(args[0]);
        for(int i=2;i<oɐɯlʎʎʎʎɐ;i++) {
            oɐɯlʎʎʎʎɐ = oɐɯlʎʎʎʎɐ % i < 1 ? 0 : oɐɯlʎʎʎʎɐ;
        }
        System.out.print(oɐɯlʎʎʎʎɐ>1);
    }
}
