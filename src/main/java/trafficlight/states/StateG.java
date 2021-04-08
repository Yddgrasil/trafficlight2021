package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class StateG implements State {


    @Override
    public void nextState(TrafficLightCtrl ctrl) {
        ctrl.setPreviousState(this);
        ctrl.setCurrentState(ctrl.getYellow());
    }

    @Override
    public TrafficLightColor getState() {
        return TrafficLightColor.GREEN;
    }
}
