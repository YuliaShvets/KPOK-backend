package ua.lviv.iot.KPOK.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.KPOK.logic.GoodService;
import ua.lviv.iot.KPOK.model.Good;

import java.util.List;

@RestController
@RequestMapping("/kpok")
public class GoodController {

    @Autowired
    private GoodService goodService;

    @CrossOrigin
    @GetMapping
    public List<Good> findAll() {
        return goodService.getAllGoods();
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public Good findById(@PathVariable Integer id) {
        return goodService.getById(id);
    }

    @CrossOrigin
    @PostMapping
    public Good createGood(@RequestBody Good good) {
        return goodService.create(good);
    }

    @CrossOrigin
    @PutMapping("/{id}")
    public Good updateGood(@RequestBody Good good, @PathVariable Integer id) {
        return goodService.update(good, id);
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public void deleteGood(@PathVariable Integer id) {
        goodService.delete(id);
    }
}
