public class AdditionExpression implements Expression {
    private Expression left, right;

    public AdditionExpression(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    public int interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }
}
