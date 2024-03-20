package iteration4;

public class ReverseExpression implements Expression<Integer>{
    private Expression<Integer> left, right;

    public ReverseExpression(Expression<Integer> left, Expression<Integer> right){
        this.left = left;
        this.right = right;
    }

    public ReverseExpression(Expression<Integer> left){
        this.left = left;
    }

    @Override
    public Integer interpret(Context context) {
       return 1;
    }
}
