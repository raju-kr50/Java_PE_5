package com.stackroute;

import java.util.HashMap;
import java.util.Map;

public class ModifyKeyValue {
   public Map<String, String> keyValueModifier(Map<String, String> map) {
        if (map==null) {
            return null;
        }
        map.replace("value1","C++");
        map.replace("value2", "");
        return map;
    }
}
