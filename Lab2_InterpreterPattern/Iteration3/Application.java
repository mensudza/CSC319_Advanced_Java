package iteration3;




public class Application {
    public static void main(String[] args){

        Expression addExpr = new AdditionExpression(new AdditionExpression(new NumberExpression(2),
                new NumberExpression(3)), new NumberExpression(4));
        Expression ppExpr = new PlusPlusExpression(new NumberExpression(10));

        Expression randExpr1 = new RandomExpression(new NumberExpression(6));
        Expression randExpr2 = new RandomExpression(new NumberExpression(3), new NumberExpression(6));
        Expression xorExpr = new XORExpression(
        new XORExpression(
                new BooleanExpression(true), new BooleanExpression(false)
        ),
        new XORExpression(new BooleanExpression(false), new BooleanExpression(true))
);

        Context context = new Context();
        System.out.println("Add Result: " + addExpr.interpret(context));
        System.out.println("Increment Result: "+ ppExpr.interpret(context));
        System.out.println("Random1 Result:" + randExpr1.interpret(context));
        System.out.println("Random2 Result: " + randExpr2.interpret(context));
        System.out.println("XOR Result: " + xorExpr.interpret(context));
    }
}
