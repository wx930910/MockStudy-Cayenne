package org.apache.cayenne.testdo.embeddable.auto;

import java.io.Serializable;

import org.apache.cayenne.Persistent;
import org.apache.cayenne.exp.Property;

/** 
 * Embeddable class _Embeddable1 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually, 
 * since it may be overwritten next time code is regenerated. 
 * If you need to make any customizations, please use subclass. 
 */
public abstract class _Embeddable1 implements Serializable {

    public static final Property<String> EMBEDDED20 = Property.create("embedded20", String.class);
    public static final Property<String> EMBEDDED10 = Property.create("embedded10", String.class);

    // special properties injected by Cayenne
    private Persistent owner;
    private String embeddedProperty;
    
    // declared properties
    protected String embedded20;
    protected String embedded10;

    // lifecycle methods
    protected void propertyWillChange(String property, Object oldValue, Object newValue) {
        if (owner != null && owner.getObjectContext() != null) {
            owner.getObjectContext().propertyChanged(
                    owner,
                    embeddedProperty + "." + property,
                    oldValue,
                    newValue);
        }
    }

    // declared getters and setters
    public void setEmbedded20(String embedded20) {
        propertyWillChange("embedded20", this.embedded20, embedded20);
        this.embedded20 = embedded20;
    }
    public String getEmbedded20() {
        return embedded20;
    }

    public void setEmbedded10(String embedded10) {
        propertyWillChange("embedded10", this.embedded10, embedded10);
        this.embedded10 = embedded10;
    }
    public String getEmbedded10() {
        return embedded10;
    }

}