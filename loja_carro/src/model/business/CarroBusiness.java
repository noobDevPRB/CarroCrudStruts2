package model.business;

import java.util.List;

import model.bean.CarroBean;
import model.dao.CarroDao;

public class CarroBusiness {
	
	public void cadastrarCarro(CarroBean carroBean) {
		
		CarroDao carroDao = new CarroDao();
		
		carroDao.cadastrarCarro(carroBean);
	}
	
	
	public  List<CarroBean> listarCarros() {
		
		CarroDao carroDao = new CarroDao();
		
		return carroDao.listarCarros();			
	}
	
	
	public CarroBean detalharCarro (int getIdForm) {
		
		CarroDao carroDao = new CarroDao();
			
	return carroDao.detalharCarro(getIdForm);
	}
	
	
	public void atualizarCarro(CarroBean carroBean) {
		
		CarroDao carroDao = new CarroDao();
		
		carroDao.atualizarCarro(carroBean);
	}
	
	
	public String removerCarro (int getIdForm) {
		
		CarroDao carroDao = new CarroDao();
		
		carroDao.removerCarro(getIdForm);
		
	return "success";
	}
	
}
