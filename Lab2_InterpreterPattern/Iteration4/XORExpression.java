package iteration4;

public class XORExpression implements Expression<Boolean> {
    private Expression<Boolean> left, right;

    public XORExpression(Expression<Boolean> left, Expression<Boolean> right){
        this.left = left;
        this.right = right;
    }
    @Override
    public Boolean interpret(Context context) {
        return ( left.interpret(context)) ^ ( right.interpret(context));
//        right.interpret(context)) == 1 ? 1 : 0;
    }
}
