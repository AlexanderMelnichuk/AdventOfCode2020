package ru.ama0.adventofcode.day18.myparser.nodes;

public class DivNode extends OperationNode {
    @Override
    public Long calc() {
        setResult(getLeft().calc() / getRight().calc());
        return getResult();
    }

    @Override
    public String toString() {
        return String.format("( %s / %s )", getLeft(), getRight());
    }
}
