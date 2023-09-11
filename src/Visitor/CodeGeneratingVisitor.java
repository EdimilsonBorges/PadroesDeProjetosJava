package Visitor;

public class CodeGeneratingVisitor implements NodeVisitor{

    @Override
    public void VisitAssignment(AssignmentNode assignmentNode) {
        System.out.println(assignmentNode.getTypeLeftHandeVar() + " = " + assignmentNode.getTypeHigthHandeExp() + " - Visitor");
    }

    @Override
    public void VisitVariableRef(VariableRefNode variableRefNode) {
        System.out.println(variableRefNode.getNomeVar() + " - Visitor");
    }
}
