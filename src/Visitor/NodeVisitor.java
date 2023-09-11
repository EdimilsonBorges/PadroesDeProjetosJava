package Visitor;

public interface NodeVisitor {

    void VisitAssignment(AssignmentNode assignmentNode);
    void VisitVariableRef(VariableRefNode variableRefNode);
}
