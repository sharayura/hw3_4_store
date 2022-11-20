package pro.sky.hw3_4_store.controller;

import org.springframework.web.bind.annotation.*;
import pro.sky.hw3_4_store.service.StoreService;

import java.util.List;

@RestController
public class StoreController {

    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/order/get")
    public List<Integer> getIds() {
        return this.storeService.getIds();
    }

    @RequestMapping ("/order/add")
    public void addId(@RequestParam List<Integer> ids) {
        this.storeService.addIds(ids);
    }
}
