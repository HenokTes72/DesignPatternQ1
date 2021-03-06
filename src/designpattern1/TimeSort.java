/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class TimeSort implements SortStrategy{

    @Override
    public List<Swimmer> sort(List<Swimmer> swimmers) {
        swimmers.sort((obj1, obj2) -> obj1.getTime().compareTo(obj2.getTime()));
        return swimmers;
    }
    
}
