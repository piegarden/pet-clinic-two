package guru.springframework.sfgpetclinicjeremiah.services.map;

import guru.springframework.sfgpetclinicjeremiah.model.Speciality;
import guru.springframework.sfgpetclinicjeremiah.services.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class SpecialtiesMapService extends AbstractMapService<Speciality, Long> implements SpecialtyService {


    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Long aLong) {
        return super.findByID(aLong);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);

    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);

    }
}
