/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correoskata4.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Histogram<T> {
    private final Map<T, Integer> map = new HashMap<>();
    
    public Integer get(T key){
        return map.get(key);
    }
    
    public Set<T> keySet(){
        return map.keySet();
    }
    
    public void increment(T key){
        if(map.containsKey(key)){
            map.put(key, map.get(key)+1);
        }else{
            map.put(key, 1);
        }
    }
    
    
}
