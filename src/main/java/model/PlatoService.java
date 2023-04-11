package model;

import interfaces.IPlato;
import interfaces.IPlatoservice;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PlatoService implements IPlatoservice {

    @Autowired
    private IPlato data;
    @Override
    public List<Plato> listar() {
        return (List<Plato>) data.findAll();
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
}
