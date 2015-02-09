package com.programyourhome.huebridgesimulator.model.lights;

import java.awt.Color;

/**
 * JSON DTO modeling the data for a Hue light.
 *
 *
 * "state": {
 *
 * "on": true,
 * "bri": 219,
 * "hue": 33849,
 * "sat": 44,
 * "xy":
 *
 * [
 * 0.3693,
 * 0.3695
 * ],
 * "ct": 234,
 * "alert": "none",
 * "effect": "none",
 * "colormode": "xy",
 * "reachable": true
 *
 * },
 * "type": "Extended color light",
 * "name": "Box",
 * "modelid": "LCT001",
 * "uniqueid": "00:17:88:01:00:e1:16:9e-0b",
 * "swversion": "66013452",
 *
 * }
 */
public class SimHueLight {

    private final SimHueLightState state;
    private final String type;
    private final String name;
    private String modelid;
    private String uniqueid;
    private String swversion;
    private SimHuePointSymbol pointsymbol;

    public SimHueLight(final int index, final String name, final Color color) {
        this.state = new SimHueLightState(color);
        this.type = "Extended color light";
        this.name = name;
        this.modelid = "LCT001";
        this.uniqueid = "01:23:45:67:89:00:00:00-0" + index;
        this.swversion = "66013452";
        this.pointsymbol = new SimHuePointSymbol();
    }

    public String getModelid() {
        return this.modelid;
    }

    public void setModelid(final String modelid) {
        this.modelid = modelid;
    }

    public String getUniqueid() {
        return this.uniqueid;
    }

    public void setUniqueid(final String uniqueid) {
        this.uniqueid = uniqueid;
    }

    public String getSwversion() {
        return this.swversion;
    }

    public void setSwversion(final String swversion) {
        this.swversion = swversion;
    }

    public SimHuePointSymbol getPointsymbol() {
        return this.pointsymbol;
    }

    public void setPointsymbol(final SimHuePointSymbol pointsymbol) {
        this.pointsymbol = pointsymbol;
    }

    public SimHueLightState getState() {
        return this.state;
    }

    public String getType() {
        return this.type;
    }

    public String getName() {
        return this.name;
    }

}
