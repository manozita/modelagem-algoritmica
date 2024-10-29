
class Exercicio_Rel
{
    boolean rel1() {
        return 1 + 2 == 3;
    }
    boolean rel2() {
        return '1' + '2' == 99;
    }
    boolean rel3() {
        return "1" + 2 == "12";
    }
    boolean rel4() {
        return 1 + "2" == "12";
    }
    boolean rel5() {
        return 0.3 == 0.3;
    }
    boolean rel6() {
        return 0.3 == 0.2 + 0.1;
    }
    boolean rel7() {
        return 0.3 == 0.1 + 0.1 + 0.1;
    }
    boolean rel8() {
        return 0.3 == (3/10);
    }
    boolean rel9() {
        return 0.3 == (3.0/10);
    }
    boolean rel10() {
        return (1 - 2 / 12 + 5) == (1 - 11 / 12 + 5);
    }
    boolean rel11() {
        return (1 - 2 / 12. + 5) == (1 - 11 / 12 + 5);
    }
}
