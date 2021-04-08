package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;

import java.security.PublicKey;

public interface State {
    public void nextState (TrafficLightCtrl ctrl);
    TrafficLightColor getState();


}