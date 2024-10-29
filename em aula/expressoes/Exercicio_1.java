class Exercicio_1
{
    boolean log1() {
        return true;
    }
    boolean log2() {
        return true || false;
    }
    boolean log3() {
        return true || false && true;
    }
    boolean log4() {
        return ! true || false && true;
    }
    boolean log5() {
        return ! ( true || false && true );
    }
}
