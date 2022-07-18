package service;

import pattern.command.remote.RemoteLoader;
import pattern.composite.MenuTestDrive;
import pattern.decorator.Starbucks;
import pattern.facade.HomeTheaterTestDrive;
import pattern.factory.method.PizzaDrive;
import pattern.iterator.refact.WaitressRefact;
import pattern.observer.WeatherStation;
import pattern.state.GumballMachineTwoTestDrive;
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
            case "8" -> new pattern.iterator.Waitress();
            case "8-1" -> new WaitressRefact();
            case "9" -> new MenuTestDrive();
            case "10" -> new GumballMachineTwoTestDrive();
            default -> {

            }
        }
    }
}
