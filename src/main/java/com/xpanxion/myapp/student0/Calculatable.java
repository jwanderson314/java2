package com.xpanxion.myapp.student0;

import java.util.ArrayList;

public interface Calculatable {

    Integer add(Integer number1, Integer number2);
    Integer subtract(Integer number1, Integer number2);
    Integer multiply(Integer number1, Integer number2);
    Integer divide(Integer number1, Integer number2);

    ArrayList<String> getHistory();
}
