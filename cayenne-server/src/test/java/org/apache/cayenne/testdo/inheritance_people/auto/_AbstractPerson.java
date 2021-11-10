package org.apache.cayenne.testdo.inheritance_people.auto;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import org.apache.cayenne.BaseDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.inheritance_people.PersonNotes;

/**
 * Class _AbstractPerson was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _AbstractPerson extends BaseDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String PERSON_ID_PK_COLUMN = "PERSON_ID";

    public static final Property<String> NAME = Property.create("name", String.class);
    public static final Property<String> PERSON_TYPE = Property.create("personType", String.class);
    public static final Property<List<PersonNotes>> NOTES = Property.create("notes", List.class);

    protected String name;
    protected String personType;

    protected Object notes;

    public void setName(String name) {
        beforePropertyWrite("name", this.name, name);
        this.name = name;
    }

    public String getName() {
        beforePropertyRead("name");
        return this.name;
    }

    public void setPersonType(String personType) {
        beforePropertyWrite("personType", this.personType, personType);
        this.personType = personType;
    }

    public String getPersonType() {
        beforePropertyRead("personType");
        return this.personType;
    }

    public void addToNotes(PersonNotes obj) {
        addToManyTarget("notes", obj, true);
    }

    public void removeFromNotes(PersonNotes obj) {
        removeToManyTarget("notes", obj, true);
    }

    @SuppressWarnings("unchecked")
    public List<PersonNotes> getNotes() {
        return (List<PersonNotes>)readProperty("notes");
    }

    @Override
    public Object readPropertyDirectly(String propName) {
        if(propName == null) {
            throw new IllegalArgumentException();
        }

        switch(propName) {
            case "name":
                return this.name;
            case "personType":
                return this.personType;
            case "notes":
                return this.notes;
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
            case "name":
                this.name = (String)val;
                break;
            case "personType":
                this.personType = (String)val;
                break;
            case "notes":
                this.notes = val;
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
        out.writeObject(this.name);
        out.writeObject(this.personType);
        out.writeObject(this.notes);
    }

    @Override
    protected void readState(ObjectInputStream in) throws IOException, ClassNotFoundException {
        super.readState(in);
        this.name = (String)in.readObject();
        this.personType = (String)in.readObject();
        this.notes = in.readObject();
    }

}
