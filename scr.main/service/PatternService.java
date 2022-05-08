package service;

import pattern.observer.WeatherStation;
import pattern.strategy.StrategyPattern;

public class PatternService {

    public void run(String input){
        switch (input) {
            case "1" -> {
                new StrategyPattern();
            }
            case "2" -> {
                new WeatherStation();
            }
            case "3" -> {

            }
            case "4" -> {

            }
            default -> {

            }
        }
    }
}
