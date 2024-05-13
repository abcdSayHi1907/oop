package expressions;

public class Square extends Expression {
    private Expression expression;
    public int evaluate(){
        return expression.evaluate()*expression.evaluate();
    }
    public Square(Expression exp){
        this.expression= exp;
    }
    public String toString (){
        return expression + "^2";
    }
}
