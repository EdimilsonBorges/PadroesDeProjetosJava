package Visitor;

public class AssignmentNode implements Node{

    private String typeLeftHandeVar;
    private String typeHigthHandeExp;

    @Override
    public void accept(NodeVisitor nodeVisitor) {
        nodeVisitor.VisitAssignment(this);
    }

    public String getTypeLeftHandeVar() {
        return typeLeftHandeVar;
    }

    public void setTypeLeftHandeVar(String typeLeftHandeVar) {
        this.typeLeftHandeVar = typeLeftHandeVar;
    }

    public String getTypeHigthHandeExp() {
        return typeHigthHandeExp;
    }

    public void setTypeHigthHandeExp(String typeHigthHandeExp) {
        this.typeHigthHandeExp = typeHigthHandeExp;
    }
}
