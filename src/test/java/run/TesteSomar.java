package run;

import org.junit.Test;

import br.com.sigla.Main;

public class TesteSomar {
	
	private Main main;
	
	@Test
	public void somar() {
		main.somar(2, 4);
	}
	
	@Test
	public void subtrair() {
		main.subtrair(2, 4);
	}

}
