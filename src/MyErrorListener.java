import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.*;

import java.util.ArrayList;
import java.util.List;

public class MyErrorListener extends BaseErrorListener{
    public static final MyErrorListener INSTANCE = new MyErrorListener();
    private static final List<String> ERRORS = new ArrayList<>();

    private MyErrorListener(){}

    public static List<String> getErrors(){
        return ERRORS;
    }
    @Override
    public void syntaxError(Recognizer<?,?> recognizer, Object offendinfSymbol, int line, int charPositionInLine, String msg, RecognitionException e){
        String err = "Error de reconocido de token en la linea "+line+", posicion "+charPositionInLine+": "+msg;
        ERRORS.add(err);
    }


}
