package ifsc.sti.tcc.service;

public class BaseService <E> {
	
	E jpaRepository;

	public BaseService(E jpaRepository) {
		super();
		this.jpaRepository = jpaRepository;
	}
	
	public interface BaseObject<E> {
		E build();
	}
}
