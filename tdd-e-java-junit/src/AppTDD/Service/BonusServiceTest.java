package AppTDD.Service;

import AppTDD.Modelo.Funcionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class BonusServiceTest {

    @Test
    void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto(){
        BonusService bonusService = new BonusService();
        Funcionario funcionario = new Funcionario("Matheus", LocalDate.now(), new BigDecimal("15000"));

        assertThrows(IllegalArgumentException.class, () -> bonusService.calcularBonus(funcionario));
    }

    @Test
    void bonusDeveriaSer10PorCentoDoSalario(){
        BonusService bonusService = new BonusService();
        Funcionario funcionario = new Funcionario("Matheus", LocalDate.now(), new BigDecimal("2500"));

        BigDecimal bonus = bonusService.calcularBonus(funcionario);

        Assertions.assertEquals(new BigDecimal("250.00"), bonus);
    }

    @Test
    void bonusDeveriaSerDezPorCentoParaSalarioDeExatamente10000(){
        BonusService bonusService = new BonusService();
        Funcionario funcionario = new Funcionario("Matheus", LocalDate.now(), new BigDecimal("10000"));

        BigDecimal bonus = bonusService.calcularBonus(funcionario);

        Assertions.assertEquals(new BigDecimal("1000.00"), bonus);
    }
}
