import java.util.HashMap;
import java.util.Map;
//Generated from Hlogs.g4 by ANTLR 4.5.3


public class Listener extends HlogsBaseListener {

    private Map<String, Integer> variables;
    
    public Listener() {
    	//System.out.println("_____yesy");
        variables = new HashMap<String, Integer>();
    }
    
    @Override
    public void exitAssign(HlogsParser.AssignContext ctx) {
        // This method is called when the parser has finished
        // parsing the assign statement
        
        // Get variable name
    	//System.out.println("yesy");
        String variableName = ctx.ID(0).getText();
        
        // Get value from variable or number
        String value = ctx.ID().size() > 1 ? ctx.ID(1).getText() 
                : ctx.NUMBER().getText();
        
        // Add variable to map		
        if(ctx.ID().size() > 1)
            variables.put(variableName, variables.get(value));
        else
            variables.put(variableName, Integer.parseInt(value));
    }
    @Override public void exitSub(HlogsParser.SubContext ctx) { 
    	 String variableName = ctx.ID().size() > 1 ? ctx.ID(1).getText() 
                 : ctx.ID(0).getText();
    	 int value=0;
         try{
         	 value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText()) 
                      : Integer.parseInt(ctx.NUMBER().getText());
         }
         catch(Exception e)
         {
         	System.out.println("Undefined variable  ->   "+ctx.ID(0).getText());
         }
         try{
         	variables.put(variableName, variables.get(variableName) - value);
         }
         catch(Exception e)
         {
         	System.out.println("Undefined variable  ->   "+variableName);
         }
    }

	@Override
	public void exitMultiply(HlogsParser.MultiplyContext ctx){
		 String variableName = ctx.ID().size() > 1 ? ctx.ID(1).getText() 
	                : ctx.ID(0).getText();
		 int value=0;
	        try{
	        	 value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText()) 
	                     : Integer.parseInt(ctx.NUMBER().getText());
	        }
	        catch(Exception e)
	        {
	        	System.out.println("Undefined variable  ->   "+ctx.ID(0).getText());
	        }
	        try{
	        	variables.put(variableName, variables.get(variableName) * value);
	        }
	        catch(Exception e)
	        {
	        	System.out.println("Undefined variable  ->   "+variableName);
	        }
	}

    @Override
    public void exitAdd(HlogsParser.AddContext ctx) {
        // This method is called when the parser has finished
        // parsing the add statement
        
        String variableName = ctx.ID().size() > 1 ? ctx.ID(1).getText() 
                : ctx.ID(0).getText();
        int value=0;
        try{
        	 value = ctx.ID().size() > 1 ? variables.get(ctx.ID(0).getText()) 
                     : Integer.parseInt(ctx.NUMBER().getText());
        }
        catch(Exception e)
        {
        	System.out.println("Undefined variable  ->   "+ctx.ID(0).getText());
        }
        try{
        	variables.put(variableName, variables.get(variableName) + value);
        }
        catch(Exception e)
        {
        	System.out.println("Undefined variable  ->   "+variableName);
        }
        
    }
    
    @Override
    public void exitPrint(HlogsParser.PrintContext ctx) {
        // This method is called when the parser has finished
        // parsing the print statement
        try{
        	 String output = ctx.ID() == null ? ctx.NUMBER().getText() 
                     : variables.get(ctx.ID().getText()).toString();
            // System.out.println(ctx.getChild(1));
             System.out.println(output);
        }
        catch(Exception e)
        {
        	System.out.println("Undefined Variable  ->   "+ctx.ID().getText());
        }
       
    } 
    @Override 
    public void exitIf_st(HlogsParser.If_stContext ctx) {
    		char ch=ctx.UOP().getText().charAt(0);
    		//System.out.println(ch);
    	
			
    		switch(ch)
    		{
    		case '>':{
    			int i=0;
    			//System.out.println(">1");
    			if(ctx.ID().size()>1)
    			{
    				System.out.println(ctx.ID().size()+"true "+ctx.ID(1).getText()+"  "+ ctx.ID(0).getText());
    			}
    			if(Integer.parseInt(ctx.NUMBER(0).getText().toString()) > Integer.parseInt(ctx.NUMBER(1).getText().toString())){
        			//System.out.println(ctx.ID_2(0).getText()+ctx.ID_2(1).getText());
        			
        				System.out.print(ctx.ID_2(0).getText()+" ");
        				i++;
        			
        			
        		}
    			else{
    				//System.out.println(">2");
    			
        				System.out.print(ctx.ID_2(1).getText()+" ");
        				i++;
        			
    			}
    			System.out.println();
    			break;
    		}
    		case '<':{
    			int i=0;
    			//System.out.println("<1");
    			int a=Integer.parseInt(ctx.NUMBER(0).getText().toString()) ;
    			int b=Integer.parseInt(ctx.NUMBER(1).getText().toString()) ;
    			
    			if(a < b)
    			{
    				//System.out.println(ctx.ID_2().size());
    				
        				System.out.print(ctx.ID_2(0).getText()+" ");
        			
    				
        		}
    			else {
    				//System.out.println("<2");
    			
        				System.out.print(ctx.ID_2(1).getText()+" ");
        				i++;
        		
    			}
    			System.out.println();
    			break;
    		}
    		default:{
    			System.out.println("Invalid Operator!");
    			break;
    		}
    		}
    	
    		
    }
    @Override 
    	public void enterIf_st(HlogsParser.If_stContext ctx) {
    

}
}