package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

public class StateOff implements State
{


    @Override
    public void nextState(TrafficLightCtrl ctrl) {
        ctrl.setCurrentState(ctrl.getRed());
    }

    @Override
    public TrafficLightColor getState() {
        return TrafficLightColor.OFF;
    }
}
