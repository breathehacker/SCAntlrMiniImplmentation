import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;


public class Visitor implements HlogsVisitor<String> {
	@Override
	public String visit(ParseTree arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visitChildren(RuleNode arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visitErrorNode(ErrorNode arg0) {
		// TODO Auto-generated method stub
		System.out.print("Hello");
		return null;
	}

	@Override
	public String visitTerminal(TerminalNode arg0) {
		// TODO Auto-generated method stub
		System.out.print("Hello");
		return null;
	}

	@Override
	public String visitProgram(HlogsParser.ProgramContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String visitStatement(HlogsParser.StatementContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	

	@Override
	public String visitAssign( HlogsParser.AssignContext ctx) {
		
		System.out.println("LOL");
		
		return null;
	}

	@Override
	public String visitPrint(HlogsParser.PrintContext ctx) {
			
		return null;
	}

	@Override
	public String visitAdd(HlogsParser.AddContext ctx) {
		
	return "WOrk";
	}

	@Override
	public String visitIf_st(HlogsParser.If_stContext ctx) {
		
		return null;
	}

	@Override
	public String visitImp(HlogsParser.ImpContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visitSub(HlogsParser.SubContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String visitMultiply(HlogsParser.MultiplyContext ctx) {
		// TODO Auto-generated method stub
		return null;
	}
}
