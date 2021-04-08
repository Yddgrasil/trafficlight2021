package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;


public class StateY implements State {

    @Override
    public void nextState(TrafficLightCtrl ctrl) {

        if (ctrl.getPreviousState().equals(ctrl.getRed())) {
            ctrl.setCurrentState(ctrl.getGreen());

        }
        else {
            ctrl.setCurrentState(ctrl.getRed());


        }


    }

    @Override
    public TrafficLightColor getState() {
        return TrafficLightColor.YELLOW;
    }
}
