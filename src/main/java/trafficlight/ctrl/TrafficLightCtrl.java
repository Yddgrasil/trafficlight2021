package trafficlight.ctrl;

import trafficlight.gui.TrafficLightGui;
import trafficlight.states.*;

public class TrafficLightCtrl {

    private State green;

    private State red;

    private State yellow;

    private State currentState;

    private State previousState;

    private TrafficLightGui gui;


    public TrafficLightCtrl() {
        super();
        initStates();
        gui = new TrafficLightGui(this);
        gui.setVisible(true);
    }

    private void initStates() {
        //TODO create the states and set current and previous state
        red = new FactoryMethod().factoryMethod("RED");
        green = new FactoryMethod().factoryMethod("GREEN");
        yellow = new FactoryMethod().factoryMethod("YELLOW");
        currentState = new FactoryMethod().factoryMethod("OFF");
        previousState = new FactoryMethod().factoryMethod("RED");
    }

    public State getGreen() {
        return green;
    }

    public State getRed() {
        return red;
    }

    public State getYellow() {
        return yellow;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public State getPreviousState() {
        return previousState;
    }

    public void setPreviousState(State previousState) {
        this.previousState = previousState;
    }

    public void run() {
        gui.run();
    }

    public void nextState() {
        //TODO handle GUi request and update GUI
        getCurrentState().nextState(this);
        gui.setLight(currentState.getState());
    }
}
