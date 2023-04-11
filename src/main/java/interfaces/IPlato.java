package interfaces;

import model.Plato;
import org.springframework.data.repository.CrudRepository;

public interface IPlato  extends CrudRepository<Plato, Integer> {
}
