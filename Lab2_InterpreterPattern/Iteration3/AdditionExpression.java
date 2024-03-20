package iteration3;

public class AdditionExpression implements Expression {
    private Expression left, right;

    public AdditionExpression(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    @Override
    public Integer interpret(Context context) {
        return (Integer) left.interpret(context) + (Integer) right.interpret(context);
    }
}
