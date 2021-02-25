import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println( "Enter expression:");
        Scanner scanner = new Scanner( System.in );

        while ( scanner.hasNext() )
        {
            String expr = scanner.nextLine();
            if ( expr.equals( "exit" ) )
                break;

            String[] parts = expr.split( "\\s+" );
            boolean invalidExpression = true;

            if ( parts.length == 3 )
            {
                Integer operand1 = null;
                Integer operand2 = null;
                try {
                    operand1 = Integer.valueOf( parts[0] );
                    operand2 = Integer.valueOf( parts[2] );
                } catch ( Exception e ) {}


                // Создаём объект конкретной операции, у которого будем вызывать execute()
                Operation operation = Operation.CreateOperationByRegEx( parts[1] );

                if ( operand1 != null && operand2 != null && operation != null )
                {
                    System.out.println( operation.execute( operand1, operand2 ) );
                    invalidExpression = false;
                }
            }

            if ( invalidExpression )
                System.out.println( "Invalid Expression" );
        }

        System.out.println( "Good luck!" );
    }
}
