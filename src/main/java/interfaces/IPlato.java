package interfaces;

import model.Plato;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface IPlato  extends CrudRepository<Plato, Integer> {

    @Repository
    public class PlatoserviceImpl implements IPlatoservice {
        @Override
        public List<Plato> listar() {
            return null;
        }

        @Override
        public Optional<Plato> listarId(int idPlato) {
            return Optional.empty();
        }

        @Override
        public int save(Plato p) {
            return 0;
        }

        @Override
        public void delete(int idPlato) {

        }
        // Implementación de los métodos de la interfaz IPlatoservice
    }
}
