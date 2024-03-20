package iteration4;

// Nonterminal iteration4.Expression
public class AdditionExpression implements Expression<Integer> {
    private Expression<Integer> left, right;

    public AdditionExpression(Expression<Integer> left, Expression<Integer> right){
        this.left = left;
        this.right = right;
    }

    @Override
    public Integer interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }
}
