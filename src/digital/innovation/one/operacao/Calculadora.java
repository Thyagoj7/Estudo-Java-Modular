package digital.innovation.one.operacao;

import digital.innovation.one.operacao.internal.DivHelp;
import digital.innovation.one.operacao.internal.MultHelp;
import digital.innovation.one.operacao.internal.SubHelp;
import digital.innovation.one.operacao.internal.SumHelp;

public class Calculadora {

    private SumHelp sumHelp;
    private SubHelp subHelp;
    private MultHelp multHelp;
    private DivHelp divHelp;

    public Calculadora(){
        sumHelp = new SumHelp();
        subHelp = new SubHelp();
        multHelp = new MultHelp();
        divHelp = new DivHelp();
    }

    public int sum(int a, int b){
        return sumHelp.execute(a,b);
    }

    public int sub(int a, int b){
        return subHelp.execute(a,b);
    }

    public int mult(int a, int b) {
        return multHelp.execute(a, b);
    }

    public int div(int a, int b){
        return divHelp.execute(a,b);
    }
}
