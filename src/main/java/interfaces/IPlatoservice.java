package interfaces;

import model.Plato;

import java.util.List;
import java.util.Optional;

public interface IPlatoservice {
    public List<Plato>listar();
    public Optional<Plato>listarId(int idPlato);
    public int save(Plato p);
    public void delete(int idPlato);
}
