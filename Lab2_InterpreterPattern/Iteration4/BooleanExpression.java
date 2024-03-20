package iteration4;

public class BooleanExpression implements Expression<Boolean> {
    private Boolean bool;

    public BooleanExpression(Boolean bool){
        this.bool = bool;
    }

    @Override
    public Boolean interpret(Context context) {
        if (context.isReverse() == ContextType.REVERSE){
            return !bool;
        }
        return bool;
    }
}
