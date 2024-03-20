package iteration3;

public class BooleanExpression implements Expression{
    private boolean bool;
    public BooleanExpression(boolean bool){
        this.bool = bool;
    }

    @Override
    public Boolean interpret(Context context) {
        return bool;
    }
}
