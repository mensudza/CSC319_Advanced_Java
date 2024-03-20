package iteration4;

import java.util.Random;

public class RandomExpression implements Expression<Integer>{
    private Expression<Integer> left, right;

    public RandomExpression(Expression<Integer> left, Expression<Integer> right){
        this.left = left;
        this.right = right;
    }

    public RandomExpression(Expression<Integer> right){
        this.right = right;
        this.left = new NumberExpression(0);
    }

    public RandomExpression(){
        this.right = new NumberExpression(0);
        this.left = new NumberExpression(Integer.MAX_VALUE);
    }

    @Override
    public Integer interpret(Context context) {
        Random rand = new Random();
        int leftValue = left.interpret(context);
        int rightValue = right.interpret(context);
        int minValue = Math.min(leftValue, rightValue);
        int maxValue = Math.max(leftValue, rightValue);

        return minValue + rand.nextInt(maxValue - minValue);


//        return  new Random().nextInt( right.interpret(context) -  left.interpret(context))
//                    + left.interpret(context);
    }

}
