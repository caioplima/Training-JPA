package Muitospramuitos;

import infra.DAO;

public class NovoTioSobrinho {
	public static void main(String[] args) {
		Tio tio1 = new Tio("João");
		Tio tia1 = new Tio("Maria");
		Sobrinho sobrinho1 = new Sobrinho("Junior");
		Sobrinho sobrinha1 = new Sobrinho("Bia");
		
		tio1.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tio1);
		tio1.getSobrinhos().add(sobrinha1);
		sobrinha1.getTios().add(tio1);
		tia1.getSobrinhos().add(sobrinho1);
		sobrinho1.getTios().add(tia1);
		tia1.getSobrinhos().add(sobrinha1);
		sobrinha1.getTios().add(tia1);
		
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirT();
		dao.incluir(tio1);
		dao.incluir(tia1);
		dao.incluir(sobrinho1);
		dao.incluir(sobrinha1);
		dao.fecharT();
		dao.fechar();
	}
}


