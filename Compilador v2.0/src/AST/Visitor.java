package AST;
public interface Visitor
{
// POR CADA CLASE CONCRETA DEL �RBOL, UN METODO PARA VISITARLO.
  public Object visitcondeclAST( condeclAST c, Object arg);
  public Object visitunadeclAST( unadeclAST c, Object arg);
  public Object visitvariasdeclsAST( variasdeclsAST c, Object arg);
  public Object visitintdeclAST( intdeclAST c, Object arg);
  public Object visitsindeclAST( sindeclAST c, Object arg);
  public Object visitstrdeclAST( strdeclAST c, Object arg);
  public Object visitBodyCD1AST( 
  /*faltan los dem�s visits */
}
