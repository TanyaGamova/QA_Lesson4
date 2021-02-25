public abstract class Operation {
    public abstract int execute( int a, int b );

    public static Operation CreateOperationByRegEx( String regex ) {
        switch ( regex )
        {
            case "+":
                return new Plus();

        }
        return null;
    }
}
