package iteration4;

public class PlusPlusExpression implements Expression<Integer>{
    private Expression<Integer> expression;

    public PlusPlusExpression(Expression<Integer> expression){
        this.expression = expression;
    }

    @Override
    public Integer interpret(Context context) {
        if (context.isReverse() == ContextType.REVERSE){
            return expression.interpret(context) - 1;
        }

        return expression.interpret(context) + 1;
    }
}
