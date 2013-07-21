package za.co.yellowfire.hotas.web;


import lombok.extern.slf4j.Slf4j;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named("thermometer") @ViewScoped @Slf4j
public class ThermometerController {

    public String onSubmit() {
        log.info("Thermometer submitted");
        return null;
    }
}
