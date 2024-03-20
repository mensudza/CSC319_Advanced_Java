package iteration4;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Application {
    public static void main(String[] args) {

        Expression<Integer> addExpr = new AdditionExpression(new AdditionExpression(new NumberExpression(2),
                new NumberExpression(3)), new NumberExpression(4));
        Expression<Integer> ppExpr = new PlusPlusExpression(new NumberExpression(10));

        Expression<Integer> randExpr1 = new RandomExpression(new NumberExpression(6));
        Expression<Integer> randExpr2 = new RandomExpression(new NumberExpression(3), new NumberExpression(6));

        Expression<Boolean> xorExpr = new XORExpression(
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
        System.out.println();

//        Create a Reverse iteration4.Context
        Context contextR = new Context(ContextType.REVERSE);
        System.out.println("Add Result: " + addExpr.interpret(contextR));
        System.out.println("Increment Result: "+ ppExpr.interpret(contextR));
        System.out.println("Random1 Result:" + randExpr1.interpret(contextR));
        System.out.println("Random2 Result: " + randExpr2.interpret(contextR));
        System.out.println("XOR Result: " + xorExpr.interpret(contextR));

    }
}

