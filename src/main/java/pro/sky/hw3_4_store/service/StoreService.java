package pro.sky.hw3_4_store.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class StoreService {

    private final List<Integer> ids = new ArrayList<>();

    public List<Integer> getIds() {
        return ids;
    }

    public void addIds(List<Integer> idsToAdd) {
        ids.addAll(idsToAdd);
    }
}
