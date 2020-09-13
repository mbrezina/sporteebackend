package da.project.sporteezone.app.service;

import da.project.sporteezone.app.entity.Lekce;
import da.project.sporteezone.app.repository.LekceRepository;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LekceService {
    LekceRepository lekceRepository;

    public List<Lekce> najdiLekce (Date zacatekLekce, Date konecLekce) {
        lekceRepository.find

    }

}
