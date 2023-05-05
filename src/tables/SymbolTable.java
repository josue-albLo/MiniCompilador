package tables;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    private Map<String,String > symbols;

    public SymbolTable() {
        symbols = new HashMap<String,String>();
    }

    public void addSymbol(String name, String dataType) {
        symbols.put(name,dataType);
    }

    public Map<String, String > ltsData(){
        return symbols;
    }

}
