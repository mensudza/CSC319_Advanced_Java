package iteration2;

import java.util.Random;

public class RandomExpression implements Expression {
    private Expression left, right;

    public RandomExpression(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }
    public RandomExpression(Expression right){
        this.left = new NumberExpression(0);
        this.right = right;
    }
    public RandomExpression(){
        this.left = new NumberExpression(0);
        this.right = new NumberExpression(Integer.MAX_VALUE);
    }

    @Override
    public int interpret(Context context) {
        Random rand = new Random();
        int leftValue = left.interpret(context);
        int rightValue = right.interpret(context);
        int minValue = Math.min(leftValue, rightValue);
        int maxValue = Math.max(leftValue, rightValue);

        return minValue + rand.nextInt(maxValue - minValue);
    }
}
