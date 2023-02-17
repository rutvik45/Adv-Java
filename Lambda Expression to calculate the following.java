package com.sss;

import java.util.*;

interface Temperatureinterface{
public void fahren(double fah);
}

interface Distanceinterface{
public void kilometers(double kil);
}

public class Generic {
public static void main(String args[]) {
Temperatureinterface temp = (fah)-> System.out.println((fah-32)*(5.0/9.0));
Distanceinterface dist = (kilo)-> System.out.println(kilo*1000);
temp.fahren(97.6);
dist.kilometers(6.3);
}
}
