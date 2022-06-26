package service;

import pattern.command.remote.RemoteLoader;
import pattern.decorator.Starbucks;
import pattern.facade.HomeTheaterTestDrive;
import pattern.factory.method.PizzaDrive;
import pattern.observer.WeatherStation;
import pattern.strategy.StrategyPattern;
import pattern.template.hook.BeverageTestDrive;
import pattern.template.javaapi.DuckSortTestDrive;
import pattern.template.javaapi.MyFrame;

public class PatternService {

    public void run(String input) {
        switch (input) {
            case "1" -> new StrategyPattern();
            case "2" -> new WeatherStation();
            case "3" -> new Starbucks();
            case "4" -> new PizzaDrive();
            case "5" -> new RemoteLoader();
            case "6" -> new HomeTheaterTestDrive();
            case "7" -> new BeverageTestDrive();
            case "7-1" -> new DuckSortTestDrive();
            case "7-2" -> new MyFrame();
            default -> {

            }
        }
    }
}
