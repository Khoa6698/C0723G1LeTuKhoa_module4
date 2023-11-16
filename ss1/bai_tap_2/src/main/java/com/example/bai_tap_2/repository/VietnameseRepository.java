package com.example.bai_tap_2.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class VietnameseRepository implements IVietnameseRepository{
    private static Map<String,String> map = new HashMap<>();
    static {
        map.put("apple","quả táo");
        map.put("banana","quả chuối");
        map.put("no","không");
        map.put("yes","có");
    }
    @Override
    public String search(String english) {
         english = map.get(english);

        if (english != null) {
            return english;
        } else {
            return "Không tìm thấy từ " + english + " trong từ điển.";
        }
////        for (Map.Entry<String,String> m : map.entrySet()){
//            if(m.getKey().toLowerCase().equals(english)){
//                return map.get(m.getValue());
////            }
//        }
//        return "word not found" + english;
    }
}
