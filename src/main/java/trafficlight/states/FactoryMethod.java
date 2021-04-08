package trafficlight.states;

import trafficlight.ctrl.TrafficLightCtrl;


public class FactoryMethod {



    public State factoryMethod(String currentcolour){
        if (currentcolour == "GREEN"){
            return new StateG();
        }
        else if(currentcolour == "YELLOW"){
            return new StateY();
        }
        else if(currentcolour == "RED"){
            return new StateR();
        }
        else{
            return new StateOff();
        }
    }
}
