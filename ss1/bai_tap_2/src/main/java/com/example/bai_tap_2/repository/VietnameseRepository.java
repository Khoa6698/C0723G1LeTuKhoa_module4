package com.example.bai_tap_2.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class VietnameseRepository implements IVietnameseRepository{
    private static Map<String,String> vietSub = new HashMap<>();
    static {
        vietSub.put("apple","quả táo");
        vietSub.put("banana","quả chuối");
        vietSub.put("no","không");
        vietSub.put("yes","có");
    }
    @Override
    public String search(String english) {
        for (Map.Entry<String,String> map : vietSub.entrySet()){
            if(map.getKey().toLowerCase().equals(english)){
                return vietSub.get(map.getKey());
            }
        }
        return "word not found" + english;
    }
}
