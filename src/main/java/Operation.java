public abstract class Operation {
    public abstract int execute( int a, int b );

    public static Operation CreateOperationByRegEx( String regex ) {
        return switch ( regex ) {
            case "+" -> new Plus();
            case "-" -> new Minus();
            case "*" -> new Multiplication();
            case "/" -> new Division();
            default -> null;
        };
    }
}
