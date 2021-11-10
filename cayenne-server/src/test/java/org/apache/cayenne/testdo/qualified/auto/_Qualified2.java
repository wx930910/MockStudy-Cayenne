package org.apache.cayenne.testdo.qualified.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.qualified.Qualified1;

/**
 * Class _Qualified2 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Qualified2 extends BaseDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "ID";

    public static final Property<Boolean> DELETED = Property.create("deleted", Boolean.class);
    public static final Property<String> NAME = Property.create("name", String.class);
    public static final Property<Qualified1> QUALIFIED1 = Property.create("qualified1", Qualified1.class);

    protected Boolean deleted;
    protected String name;

    protected Object qualified1;

    public void setDeleted(Boolean deleted) {
        beforePropertyWrite("deleted", this.deleted, deleted);
        this.deleted = deleted;
    }

    public Boolean getDeleted() {
        beforePropertyRead("deleted");
        return this.deleted;
    }

    public void setName(String name) {
        beforePropertyWrite("name", this.name, name);
        this.name = name;
    }

    public String getName() {
        beforePropertyRead("name");
        return this.name;
    }

    public void setQualified1(Qualified1 qualified1) {
        setToOneTarget("qualified1", qualified1, true);
    }

    public Qualified1 getQualified1() {
        return (Qualified1)readProperty("qualified1");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "deleted":
                return this.deleted;
            case "name":
                return this.name;
            case "qualified1":
                return this.qualified1;
            default:
                return super.readPropertyDirectly(propName);
        }
    }

    @Override
    public void writePropertyDirectly(String propName, Object val) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch (propName) {
            case "deleted":
                this.deleted = (Boolean)val;
                break;
            case "name":
                this.name = (String)val;
                break;
            case "qualified1":
                this.qualified1 = val;
                break;
            default:
                super.writePropertyDirectly(propName, val);
        }
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        writeSerialized(out);
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        readSerialized(in);
    }

    @Override
    protected void writeState(ObjectOutputStream out) throws IOException {
        super.writeState(out);
        out.writeObject(this.deleted);
        out.writeObject(this.name);
        out.writeObject(this.qualified1);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.deleted = (Boolean)in.readObject();
        this.name = (String)in.readObject();
        this.qualified1 = in.readObject();
    }

}
