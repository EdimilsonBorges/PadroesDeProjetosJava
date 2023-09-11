package Visitor;

public class VariableRefNode implements Node{

    private String nomeVar;
    @Override
    public void accept(NodeVisitor nodeVisitor) {
        nodeVisitor.VisitVariableRef(this);
    }

    public String getNomeVar() {
        return nomeVar;
    }

    public void setNomeVar(String nomeVar) {
        this.nomeVar = nomeVar;
    }
}
