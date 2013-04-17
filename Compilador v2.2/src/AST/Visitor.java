package AST;
public interface Visitor
{
// POR CADA CLASE CONCRETA DEL �RBOL, UN METODO PARA VISITARLO.
  
  public Object visitBodyCD1AST( BodyCD1AST c, Object arg);
  public Object visitCD2AST( CD2AST c, Object arg);
  public Object visitCD3AST( CD3AST c, Object arg);
  public Object visitClassDAST( ClassDAST c, Object arg);
  
  public Object visitConstructorDAST( ConstructorDAST c, Object arg);
  public Object visitDefConstrAST( DefConstrAST c, Object arg);
  public Object visitDefExpAST( DefExpAST c, Object arg);
  public Object visitDefMainAST( DefMainAST c, Object arg);
  public Object visitDefMethodDeclAST( DefMethodDeclAST c, Object arg);
  public Object visitDefReturnAST( DefReturnAST c, Object arg);
  
 public Object visitExpReadAST( ExpReadAST c, Object arg);
  public Object visitExpStatAST( ExpStatAST c, Object arg);
 public Object visitExp_SimplTokAST( Exp_SimplTokAST c, Object arg);
  public Object visitExplAST( ExplAST c, Object arg);
  public Object visitExplistStatAST( ExplistStatAST c, Object arg);
  public Object visitExpnegAST( ExpnegAST c, Object arg);
  public Object visitExpnewIntAST( ExpnewIntAST c, Object arg);
  public Object visitExpnewidAST( ExpnewidAST c, Object arg);
  public Object visitExpredAST( ExpredAST c, Object arg);
  public Object visitImpClssMnAST( ImpClssMnAST c, Object arg);
  public Object visitMethodDAST( MethodDAST c, Object arg);
  public Object visitOpTAST( OpTAST c, Object arg);
  public Object visitTNamesAST( TNamesAST c, Object arg);
 public Object visitTididAST( TididAST c, Object arg);
  public Object visitTipoCuadrAST( TipoCuadrAST c, Object arg);
 public Object visitTipoLengthAST( TipoLengthAST c, Object arg);
  public Object visitTipoListaAST( TipoListaAST c, Object arg);
  public Object visitTipoOpAST( TipoOpAST c, Object arg);
  public Object visitVariableDAST( VariableDAST c, Object arg);
  
  public Object visitasigStatAST( asigStatAST c, Object arg);
 public Object visitconExtendsoImplementsAST( conExtendsoImplementsAST c, Object arg);
  public Object visitconIdoVoidAST( conIdoVoidAST c, Object arg);
  public Object visitconPuntoAsteriscoAST( conPuntoAsteriscoAST c, Object arg);
 public Object visitconThisoIdAST( conThisoIdAST c, Object arg);
  public Object visitelseStatAST( elseStatAST c, Object arg);
  public Object visitexitStatAST( exitStatAST c, Object arg);
  public Object visitifelseStatAST( ifelseStatAST c, Object arg);
  public Object visitimpTypeAST( impTypeAST c, Object arg);
  public Object visitprintlnStatAST( printlnStatAST c, Object arg);
  public Object visitsolaExpAST( solaExpAST c, Object arg);
  
  
  public Object visittipExpAST( tipExpAST c, Object arg);
  public Object visitunaExpAST( unaExpAST c, Object arg);
  public Object visitvarBodyDeclAST( varBodyDeclAST c, Object arg);
  public Object visitvarClassDeclsAST( varClassDeclsAST c, Object arg);
  public Object visitvarExpListsAST( varExpListsAST c, Object arg);
  public Object visitvarFormalListAST( varFormalListAST c, Object arg);
  public Object visitvarFormalListsAST( varFormalListsAST c, Object arg);
  public Object visitvarImportAST( varImportAST c, Object arg);
  public Object visitvarStatAST( varStatAST c, Object arg);
  
  public Object visitvarStatementsAST( varStatementsAST c, Object arg);
  public Object visitvarTypeNameAST( varTypeNameAST c, Object arg);
  public Object visitvarVarDeclsAST( varVarDeclsAST c, Object arg);
  public Object visitwhileStatAST( whileStatAST c, Object arg);  

}
