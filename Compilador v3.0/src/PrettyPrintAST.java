import  AST.*;

//Implementa los m�todos para imprimir el AST utilizando Visitors
public class PrettyPrintAST implements Visitor
{
   
  public void imprimir(AST raiz)
  {
    raiz.visit(this,new Integer(0));
  }
  
  public void printtab(int n)
  {
    for(int num=n; num != 0; num--)
      System.out.print("+++");
    System.out.print(">");
  }
  // TODOS LOS M�TODOS PARA IMPRIMIR EL AST
  
  public Object visitBodyCD1AST( BodyCD1AST c, Object arg){
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  
  public Object visitCD2AST( CD2AST c, Object arg)
    {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  
  public Object visitCD3AST( CD3AST c, Object arg)
    {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  
  public Object visitClassDAST( ClassDAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  
  public Object visitConstructorDAST( ConstructorDAST c, Object arg)
    {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  
  public Object visitDefConstrAST( DefConstrAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if (c.h3!=null)
      c.h3.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
         
  public Object visitDefExpAST( DefExpAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
          
  public Object visitDefMainAST( DefMainAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  
  public Object visitDefMethodDeclAST( DefMethodDeclAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if (c.h3!=null)
      c.h3.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if (c.h4!=null)
      c.h3.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if (c.h5!=null)
      c.h3.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  public Object visitDefReturnAST( DefReturnAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  public Object visitExpReadAST( ExpReadAST c, Object arg)
  {
      return null;
  }
  
  public Object visitExpStatAST( ExpStatAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  public Object visitExp_SimplStringAST( Exp_SimplStringAST c, Object arg)
  {
      return null;
  }
  
  public Object visitExplAST( ExplAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  public Object visitExplistStatAST( ExplistStatAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  public Object visitExpnegAST( ExpnegAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  public Object visitExpnewIntAST( ExpnewIntAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  public Object visitExpnewidAST( ExpnewidAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  public Object visitExpredAST( ExpredAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  public Object visitImpClssMnAST( ImpClssMnAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if (c.h3!=null)
      c.h3.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  public Object visitMethodDAST( MethodDAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }

  
  public Object visitTNamesAST( TNamesAST c, Object arg)
    {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  public Object visitTididAST( TididAST c, Object arg)
  {
      return null;
  }
   
  public Object visitTipoCuadrAST( TipoCuadrAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  public Object visitTipoLengthAST( TipoLengthAST c, Object arg)
  {
      return null;
  }
  
  public Object visitTipoListaAST( TipoListaAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  
  public Object visitTipoOpAST( TipoOpAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  public Object visitVariableDAST( VariableDAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  
  public Object visitasigStatAST( asigStatAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  
public Object visitconExtendsoImplementsAST( conExtendsAST c, Object arg)
{
    return null;
}
  
  public Object visitconIdoVoidAST( conIdAST c, Object arg)
  {
    return null;
}
  public Object visitconPuntoAsteriscoAST( conPuntoAsteriscoAST c, Object arg)
  {
    return null;
}
  public Object visitThisconIDAST( ThisconIDAST c, Object arg)
  {
    return null;
}
  public Object visitelseStatAST( elseStatAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  public Object visitexitStatAST( exitStatAST c, Object arg)
  {
      return null;
  }
  
 
  public Object visitifelseStatAST( ifelseStatAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if (c.h3!=null)
      c.h3.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  public Object visitimpTypeAST( impTypeAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  public Object visitprintlnStatAST( printlnStatAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  public Object visitsolaExpAST( solaExpAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  
  
  public Object visittipExpAST( tipExpAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  public Object visitunaExpAST( unaExpAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  public Object visitvarBodyDeclAST( varBodyDeclAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  public Object visitvarClassDeclsAST( varClassDeclsAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  public Object visitvarExpListsAST( varExpListsAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  public Object visitvarFormalListAST( varFormalListAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  public Object visitvarFormalListsAST( varFormalListsAST c, Object arg)
          {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  public Object visitvarImportAST( varImportAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  public Object visitvarStatAST( varStatAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  
  public Object visitvarStatementsAST( varStatementsAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  public Object visitvarTypeNameAST( varTypeNameAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  public Object visitvarVarDeclsAST( varVarDeclsAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  public Object visitwhileStatAST( whileStatAST c, Object arg)
  {
    int numaux = ((Integer)arg).intValue();
    printtab(numaux);
    
    System.out.println(c.getClass().getName());
    if (c.h1!=null)
      c.h1.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    if (c.h2!=null)
      c.h2.visit(this,new Integer(numaux+1));
    else
    {
      printtab(numaux+1);
      System.out.println("NULL");
    }
    return null;
  }
  public Object visitconVoidAST( conVoidAST c, Object arg){
      return null;
  }
  public Object visitconIdAST( conIdAST c, Object arg)
  {
      return null;
  }
  public Object visitThisconThisAST( ThisconThisAST c, Object arg)
  {
      return null;
  }
  public Object visitconExtendsAST( conExtendsAST c, Object arg)
  {
      return null;
  }
  public Object visitconImplementsAST(conImplementsAST c,Object arg)
  {
      return null;
  }
  public Object visitExp_SimplNumeroAST(Exp_SimplNumeroAST c, Object arg)
  {
      return null;
  }
  public Object visitExp_SimplIdAST(Exp_SimplIdAST c, Object arg){
      return null;
  }
  public Object visitExp_SimpltrueAST(Exp_SimpltrueAST c, Object arg){
      return null;
  }
  public Object visitExp_SimplfalseAST(Exp_SimplfalseAST c, Object arg){
      return null;
  }
  public Object visitExp_SimplthisAST(Exp_SimplthisAST c, Object arg)
  {
          return null;
  }
  
    public Object visitOpSumaAST( OpSumaAST c, Object arg)
  {
       return null;
  }
    
  public Object visitOpRestaAST( OpRestaAST c, Object arg)
  {
      return null;
  }
  public Object visitOpAsteriscoAST( OpAsteriscoAST c, Object arg)
  {
      return null;
  }
  public Object visitOpDivisionAST( OpDivisionAST c, Object arg)
  {
      return null;
  }
  public Object visitOpDiferenteaAST( OpDiferenteaAST c, Object arg)
  {
      return null;
  }
  public Object visitOpIgualaAST( OpIgualaAST c, Object arg)
  {
      return null;
  }
  public Object visitOpMenorqueAST( OpMenorqueAST c, Object arg)
  {
      return null;
  }
  public Object visitOpMenorigualAST( OpMenorigualAST c, Object arg)
  {
      return null;
  }
  public Object visitOpMayorigualAST( OpMayorigualAST c, Object arg)
  {
      return null;
  }
  public Object visitOpMayorqueAST( OpMayorqueAST c, Object arg)
  {
      return null;
  }
  public Object visitOpOrAST( OpOrAST c, Object arg)
  {
      return null;
  }
  public Object visitOpAndAST( OpAndAST c, Object arg)
  {
      return null;
  }
      
}
  