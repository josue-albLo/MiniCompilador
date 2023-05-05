// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import compilador.minicompiParser;
import compilador.minicompiLexer;
import tables.SymbolTable;
import tables.SymbolTableListener;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
       minicompilador();
        }
    public static void minicompilador(){
    // Ejecuto mi funcio que tiene la estructura en codigo de mi compilador
    minicompilador_Un();

    }
    // Construccion de mi compilador
    public static void minicompilador_Un(){

        String input = JOptionPane.showInputDialog(null,"Ingrese la entrada");
        String[] options = {"Ver tokens", "Analisis sintactico", "Tabla de simbolos", "Tabla de errores"};
        int choice = JOptionPane.showOptionDialog(null,"Selecciona una opcion: ", "Opciones",JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        minicompiParser parser = returnCompi(input);
        switch (choice){
            case 0:
                viewTokens(input);
                break;
            case 1:
                sintatic(parser);
                break;
            case 2:
                tabla_Simbolos(parser);
                break;
            case 3:
                tabla_errores(parser);
                break;
            default:
                System.err.println("Error de opcion");
                break;
        }





    }

    //Funcion para imprimir los tokes ingresados
    public static void viewTokens(String input){
        System.out.println("Vista de los tokens");
        CommonTokenStream tokens = lexic(input);
        for (Token token: tokens.getTokens()) {
            System.out.println("TOKEN("+token.getType() + ",\'"+ token.getText()+"\')");
        }
    }

    //Funcion de tokenizacion
    public static CommonTokenStream lexic(String input){
        //CharStream input = CharStreams.fromFileName(archivo);
        minicompiLexer lexer = new minicompiLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();
        return tokens;
    }

    //Funcion que me retorna un objeto de tipo parser
    public static minicompiParser returnCompi(String input){
        minicompiLexer lexer = new minicompiLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        minicompiParser parser = new minicompiParser(tokens);
        return parser;
    }

    // Funcion que imprime el arbol sintactico en forma de cadena de texto
    public static void sintatic(minicompiParser parser){
        ParseTree tree = parser.start();
        System.out.println("Arbol sintactico");
        System.out.println(tree.toStringTree(parser));
    }

    //Funcion que muestra la tabla de simbolos
    public static void tabla_Simbolos(minicompiParser parser){
        System.out.println("Tabla de simbolos");
        ParseTree tree = parser.start();

        SymbolTableListener listener = new SymbolTableListener();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(listener,tree);

        SymbolTable symbolTable = listener.getSymbolTable();

        Map sm = symbolTable.ltsData();
        sm.forEach((key, value) -> System.out.println("KEY --- " + key + " | Value --- " + value));

    }
    // Funcion que muestra la tabla de errores
    public static void tabla_errores(minicompiParser parser){
        System.out.println("Tabla de erroers");
        parser.removeErrorListeners();
        parser.addErrorListener(MyErrorListener.INSTANCE);
        parser.start();

        List lista = MyErrorListener.getErrors();
        for (Object elemento:lista) {
            System.out.println("Elemento "+elemento);
        }
    }
}