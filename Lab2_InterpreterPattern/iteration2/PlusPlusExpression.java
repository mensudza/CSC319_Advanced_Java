package iteration2;

public class PlusPlusExpression implements Expression {
    private Expression expression;

    public PlusPlusExpression(Expression expression){
        this.expression = expression;
    }
    @Override
    public int interpret(Context context) {
        return expression.interpret(context) + 1;
    }
}
