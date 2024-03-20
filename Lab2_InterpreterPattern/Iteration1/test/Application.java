public class Application{
    public static void main(String[] args){

        Expression addExpr = new AdditionExpression(new AdditionExpression(new NumberExpression(2),
                new NumberExpression(3)), new NumberExpression(4));
        Context context = new Context();
        System.out.println("Add Result: " + addExpr.interpret(context));

    }
}
