package cursogetafe.dianotaciones.persistencia;

public class ClienteDaoImplNew implements ClienteDao{

	@Override
	public String findById(int id) {
		return "Nuevo Dao de ClienteDao" + id;
	}

}
