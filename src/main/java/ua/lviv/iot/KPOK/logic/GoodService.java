package ua.lviv.iot.KPOK.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import org.springframework.web.server.ResponseStatusException;
import ua.lviv.iot.KPOK.model.Good;
import ua.lviv.iot.KPOK.repository.KpokRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class GoodService {

    @Autowired
    private KpokRepository kpokRepository;

    public List<Good> getAllGoods() {
        return kpokRepository.findAll();
    }

    public Good create(Good good) {
        return kpokRepository.save(good);
    }

    public Good getById(Integer id) {
        return kpokRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public void delete(Integer id) {
        kpokRepository.deleteById(id);
    }

    @Transactional
    public Good update(Good good, Integer id) {
        Good newGood = kpokRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        newGood.setName(good.getName());
        newGood.setPrice(good.getPrice());
        newGood.setImage(good.getImage());
        return newGood;
    }
}
