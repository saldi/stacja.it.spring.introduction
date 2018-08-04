package it.stacja.app.factory.model;

import it.stacja.app.factory.context.Component;
import it.stacja.app.factory.context.Prototype;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

@Component
@Prototype
@org.springframework.stereotype.Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Tire {




}
