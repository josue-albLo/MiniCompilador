package tables;

public class SymbolAttributes {
    private String name;
    private SymbolAttributes attributes;
    private String dataType;

    public SymbolAttributes(String dataType, String name){
        this.name = name;
        this.dataType=dataType;
    }
    public void addNewElement(String name, SymbolAttributes attributes, String dataType){
        this.name = name;
        this.attributes = attributes;
        this.dataType = dataType;
    }
    public String returnElementType(){
        return this.dataType;
    }
}
