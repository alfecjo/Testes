



package br.calcSalarFunc;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CalculadoraDeSalarioDeFuncionários {
	
	public void calcularReajuste(Funcionarios funcionario) {

		final int menorque = -1;
		
		final BigDecimal salarioBaseDesenvolvedor = new BigDecimal("3000.0").setScale(2, RoundingMode.HALF_UP);
		final BigDecimal salarioBaseDBA = new BigDecimal("2000.0").setScale(2, RoundingMode.HALF_UP);
		final BigDecimal salarioBaseTestador = new BigDecimal("2000.0").setScale(2, RoundingMode.HALF_UP);
		final BigDecimal salarioBaseGerente = new BigDecimal("5000.0").setScale(2, RoundingMode.HALF_UP);
		
		final BigDecimal noventaPercent = new BigDecimal(".9");
		final BigDecimal oitentaECincoPercent = new BigDecimal(".85");
		final BigDecimal oitentaPercent = new BigDecimal(".8");
		final BigDecimal setentaECincoentaPercent = new BigDecimal(".75");
		final BigDecimal setentaPercent = new BigDecimal(".7");		
		
		switch (funcionario.getCargo()) {		
		case "Desenvolvedor":			
			if (funcionario.getSalarioBase().compareTo(salarioBaseDesenvolvedor) == menorque) {
				funcionario.setSalarioBase(
						funcionario.getSalarioBase().multiply(noventaPercent
								.setScale(2, RoundingMode.HALF_UP)));
			} else {
				funcionario.setSalarioBase(
						funcionario.getSalarioBase().multiply(oitentaPercent
								.setScale(2, RoundingMode.HALF_UP)));
			}
			break;
			
		case "DBA":			
			if (funcionario.getSalarioBase().compareTo(salarioBaseDBA) == menorque) {
				funcionario.setSalarioBase(
						funcionario.getSalarioBase().multiply(oitentaECincoPercent
								.setScale(2, RoundingMode.HALF_UP)));
			} else {
				funcionario.setSalarioBase(
						funcionario.getSalarioBase().multiply(setentaECincoentaPercent
								.setScale(2, RoundingMode.HALF_UP)));
			}
			break;
			
		case "Testador":			
			if (funcionario.getSalarioBase().compareTo(salarioBaseTestador) == menorque) {
				funcionario.setSalarioBase(
						funcionario.getSalarioBase().multiply(oitentaECincoPercent
								.setScale(2, RoundingMode.HALF_UP)));
			} else {
				funcionario.setSalarioBase(
						funcionario.getSalarioBase().multiply(setentaECincoentaPercent
								.setScale(2, RoundingMode.HALF_UP)));
			}
			break;
		
		case "Gerente":			
			if (funcionario.getSalarioBase().compareTo(salarioBaseGerente) == menorque) {
				funcionario.setSalarioBase(
						funcionario.getSalarioBase().multiply(oitentaPercent
								.setScale(2, RoundingMode.HALF_UP)));
			} else {
				funcionario.setSalarioBase(
						funcionario.getSalarioBase().multiply(setentaPercent
								.setScale(2, RoundingMode.HALF_UP)));
			}
			break;
		}
	}
}
