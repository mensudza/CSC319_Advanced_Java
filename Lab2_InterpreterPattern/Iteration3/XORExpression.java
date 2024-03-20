package iteration3;

public class XORExpression implements Expression {
    private Expression left, right;

    public XORExpression(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    @Override
    public Boolean interpret(Context context) {
        return ((Boolean) left.interpret(context)) ^ ( (Boolean) right.interpret(context));
    }
}
