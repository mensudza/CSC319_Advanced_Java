package iteration3;

public class PlusPlusExpression implements Expression {
    private Expression expression;

    public PlusPlusExpression(Expression expression){
        this.expression = expression;
    }
    @Override
    public Integer interpret(Context context) {
        return (Integer) expression.interpret(context) + 1;
    }
}
