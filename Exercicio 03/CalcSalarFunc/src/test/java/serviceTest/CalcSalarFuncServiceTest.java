package serviceTest;

import static org.junit.Assert.assertEquals;
import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.jupiter.api.Test;
import br.calcSalarFunc.CalculadoraDeSalarioDeFuncionários;
import br.calcSalarFunc.Funcionarios;

public class CalcSalarFuncServiceTest {

	CalculadoraDeSalarioDeFuncionários calculadoraDeSalarioDeFuncionários =
			new CalculadoraDeSalarioDeFuncionários();

	@Test
	public void casoCargoSejaDesenvolvedorDescontoEmFuncaoDaFaixaSalarialUp() {
		Funcionarios funcionario = new Funcionarios("ACFA", "acfa@email.com",
				new BigDecimal("5000.00").setScale(2, RoundingMode.HALF_UP), "Desenvolvedor");
		calculadoraDeSalarioDeFuncionários.calcularReajuste(funcionario);
		assertEquals(new BigDecimal("4000.0000"), funcionario.getSalarioBase());
	}

	@Test
	public void casoCargoSejaDesenvolvedorDescontoEmFuncaoDaFaixaSalarialDown() {

		Funcionarios funcionario = new Funcionarios("ACFA", "acfa@email.com",
				new BigDecimal("2500.00").setScale(2, RoundingMode.HALF_UP), "Desenvolvedor");
		calculadoraDeSalarioDeFuncionários.calcularReajuste(funcionario);
		assertEquals(new BigDecimal("2250.0000"), funcionario.getSalarioBase());
	}

	@Test
	public void casoCargoSejaDBADescontoEmFuncaoDaFaixaSalarialUp() {
		Funcionarios funcionario = new Funcionarios("ACFA", "acfa@email.com",
				new BigDecimal("3000.00").setScale(2, RoundingMode.HALF_UP), "DBA");
		calculadoraDeSalarioDeFuncionários.calcularReajuste(funcionario);
		assertEquals(new BigDecimal("2250.0000"), funcionario.getSalarioBase());
	}

	@Test
	public void casoCargoSejaDBADescontoEmFuncaoDaFaixaSalarialDown() {
		Funcionarios funcionario = new Funcionarios("ACFA", "acfa@email.com",
				new BigDecimal("550.00").setScale(2, RoundingMode.HALF_UP), "DBA");
		calculadoraDeSalarioDeFuncionários.calcularReajuste(funcionario);
		assertEquals(new BigDecimal("467.5000"), funcionario.getSalarioBase());
	}

	@Test
	public void casoCargoSejaTestadorDescontoEmFuncaoDaFaixaSalarialUp() {
		Funcionarios funcionario = new Funcionarios("ACFA", "acfa@email.com",
				new BigDecimal("5000.00").setScale(2, RoundingMode.HALF_UP), "Testador");
		calculadoraDeSalarioDeFuncionários.calcularReajuste(funcionario);
		assertEquals(new BigDecimal("3750.0000"), funcionario.getSalarioBase());
	}

	@Test
	public void casoCargoSejaTestadorDescontoEmFuncaoDaFaixaSalarialDown() {
		Funcionarios funcionario = new Funcionarios("ACFA", "acfa@email.com",
				new BigDecimal("550.00").setScale(2, RoundingMode.HALF_UP), "Testador");
		calculadoraDeSalarioDeFuncionários.calcularReajuste(funcionario);
		assertEquals(new BigDecimal("467.5000"), funcionario.getSalarioBase());
	}

	@Test
	public void casoCargoSejaGerenteDescontoEmFuncaoDaFaixaSalarialUp() {
		Funcionarios funcionario = new Funcionarios("ACFA", "acfa@email.com",
				new BigDecimal("5000.00").setScale(2, RoundingMode.HALF_UP), "Gerente");
		calculadoraDeSalarioDeFuncionários.calcularReajuste(funcionario);
		assertEquals(new BigDecimal("3500.0000"), funcionario.getSalarioBase());
	}

	@Test
	public void casoCargoSejaGerenteDescontoEmFuncaoDaFaixaSalarialDown() {
		Funcionarios funcionario = new Funcionarios("ACFA", "acfa@email.com",
				new BigDecimal("2500.00").setScale(2, RoundingMode.HALF_UP), "Gerente");
		calculadoraDeSalarioDeFuncionários.calcularReajuste(funcionario);
		assertEquals(new BigDecimal("2000.0000"), funcionario.getSalarioBase());
	}
}
