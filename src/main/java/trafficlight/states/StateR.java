package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class StateR implements State {


    @Override
    public void nextState(TrafficLightCtrl ctrl) {
        ctrl.setPreviousState(ctrl.getRed());
        ctrl.setCurrentState(ctrl.getYellow());
    }

    @Override
    public TrafficLightColor getState() {
        return TrafficLightColor.RED;
    }
}
