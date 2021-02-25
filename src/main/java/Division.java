public class Division extends Operation {
    @Override
    public int execute( int a, int b ) {
        return b != 0 ? a / b : Integer.MAX_VALUE;
    }
}
