package iteration4;

// iteration4.Context types: NORMAL, REVERSE
public class Context {
    // Additional context information, if needed
    private ContextType _isReverse;

    public Context (ContextType isReverse){
        _isReverse = isReverse;
    }

    public Context(){
        this(ContextType.NORMAL);
    }

    public ContextType isReverse(){
        return _isReverse;
    }



}
