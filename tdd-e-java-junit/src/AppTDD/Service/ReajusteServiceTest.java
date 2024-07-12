package AppTDD.Service;

import AppTDD.Modelo.Desempenho;
import AppTDD.Modelo.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ReajusteServiceTest {

    private ReajusteService reajuste;
    private Funcionario funcionario;

    //Vai executar esse metodo antes de iniciar cada metodo
    @BeforeEach
    public void inicializar(){
        this.reajuste = new ReajusteService();
        this.funcionario = new Funcionario("Matheus", LocalDate.now(), new BigDecimal(1000));
    }

    @Test
    void reajusteDeveriaSerDeTresPorCentroQuandoDesempenhoForADesejar(){
        reajuste.concederReajuste(funcionario, Desempenho.A_DESEJAR);
        Assertions.assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    void reajusteDeveriaSerDeQuinzePorCentroQuandoDesempenhoForBom(){
        reajuste.concederReajuste(funcionario, Desempenho.BOM);
        Assertions.assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    void reajusteDeveriaSerDeVintePorCentroQuandoDesempenhoForOtimo(){
        reajuste.concederReajuste(funcionario, Desempenho.OTIMO);
        Assertions.assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }
}
