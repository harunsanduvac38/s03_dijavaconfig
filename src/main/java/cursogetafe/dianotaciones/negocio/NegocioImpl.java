package cursogetafe.dianotaciones.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cursogetafe.dianotaciones.persistencia.ClienteDao;

@Service("negocio")
public class NegocioImpl implements Negocio{

	
//	final private ClienteDao cDao (puede initializar pero hay que dar un valor en un constructor luego borrar el setter);
	@Autowired
	private ClienteDao cDao;
	
	public NegocioImpl(){
//		cDao = null;
		System.out.println("Constructor por defecto del NegocioImp");
	}
	
	
	public NegocioImpl(ClienteDao cDao) {
		this.cDao = cDao;
		System.out.println("Constructor  del NegocioImp(ClienteDao cDao)");
	}
	

	public ClienteDao getcDao() {
		return cDao;
	}

//	@Autowired
	public void setcDao(ClienteDao cDao) {
		System.out.println("NegocioImpl, setcDao(...)");
		this.cDao = cDao;
	}


	@Override
	public String proceso(int idCliente) {
		return "Soy el negocio y llamo al dao: " + cDao.findById(idCliente);
	}
	

}
