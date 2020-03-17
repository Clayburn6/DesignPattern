package pers.pgb.design_pattern.create.prototype;

import java.io.*;

/**
 * @author clayburn
 */
public class Prototype implements Cloneable, Serializable {
    private String name;

    private Knife knife;

    public Prototype(String name, Knife knife) {
        this.name = name;
        this.knife = knife;
    }

    public Prototype() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Knife getKnife() {
        return knife;
    }

    public void setKnife(Knife knife) {
        this.knife = knife;
    }

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        Prototype prototype = (Prototype) super.clone();
        prototype.knife = prototype.knife.clone();
        return prototype;
    }

    public Prototype cloneByObjectByte() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);

        byte[] thisObject = byteArrayOutputStream.toByteArray();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(thisObject);
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        return  (Prototype) objectInputStream.readObject();
    }
}
