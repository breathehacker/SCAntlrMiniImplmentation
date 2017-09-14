
import java.io.FileInputStream;
import java.io.IOException;
import org.antlr.v4.runtime.*;


public class Main {
	public static void main(String arg[]){
		try {
		      ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(arg[0]));    
		       HlogsLexer lexer = new HlogsLexer(input);
		        HlogsParser parser = new HlogsParser(new CommonTokenStream(lexer));
		       parser.addParseListener(new Listener());
		  
		      // HlogsParser parser_1 = new HlogsParser(new CommonTokenStream(lexer));
		       
		       Visitor visitor = new Visitor();
		        visitor.visit(parser.program());
		
	    } catch (IOException e) {
	        e.printStackTrace();
	        
	    }
	}
}
