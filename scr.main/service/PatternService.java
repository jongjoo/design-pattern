package service;

import pattern.command.remote.RemoteLoader;
import pattern.decorator.Starbucks;
import pattern.facade.HomeTheaterTestDrive;
import pattern.factory.method.PizzaDrive;
import pattern.observer.WeatherStation;
import pattern.strategy.StrategyPattern;

public class PatternService {

    public void run(String input) {
        switch (input) {
            case "1" -> {
                new StrategyPattern();
            }
            case "2" -> {
                new WeatherStation();
            }
            case "3" -> {
                new Starbucks();
            }
            case "4" -> {
                new PizzaDrive();
            }
            case "5" -> {
                new RemoteLoader();
            }
            case "6" -> {
                new HomeTheaterTestDrive();
            }
            default -> {

            }
        }
    }
}
