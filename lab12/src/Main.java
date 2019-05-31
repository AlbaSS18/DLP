import parser.*;
import sintactic.IdentificationVisitor;
import sintactic.LValueVisitor;
import sintactic.TypeCheckingVisitor;

import org.antlr.v4.runtime.*;

import ast.Program;
import ast.types.ErrorHandler;
import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorTree;
import offsetgeneration.CodeGenerator;
import offsetgeneration.ExecuteCGVisitor;
import offsetgeneration.OffsetVisitor;

public class Main {
	
	public static void main(String... args) throws Exception {
		   if (args.length<2) {
		        System.err.println("Please, pass me the input file.");
		        return;
		    }
		   		 			
		 // create a lexer that feeds off of input CharStream
		CharStream input = CharStreams.fromFileName(args[0]);
		PmmLexer lexer = new PmmLexer(input);

		// create a parser that feeds off the tokens buffer
		CommonTokenStream tokens = new CommonTokenStream(lexer); 
		PmmParser parser = new PmmParser(tokens);	
		Program ast = parser.program().ast;
		
		
		ast.accept(new IdentificationVisitor(), null);
		ast.accept(new LValueVisitor(), null);
		ast.accept(new TypeCheckingVisitor(), null);
		
		if(ErrorHandler.getSingletonInstance().anyError()) {
			ErrorHandler.getSingletonInstance().showErrors(System.err);
		}
		else {
			// * The AST is shown
			//IntrospectorModel model=new IntrospectorModel("Program", ast);
			//new IntrospectorTree("Introspector", model);
		
			ast.accept(new OffsetVisitor(), null);
			ast.accept(new ExecuteCGVisitor(new CodeGenerator(args[0],args[1])),null);
			
		}
	}
}
