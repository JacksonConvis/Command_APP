import java.util.ArrayList;

public class Variable {
    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Variable(String name, String type) {
        this.name = name;
        this.type = type;
        return;
    }

    //
    public int getBits() {
        final int bits;
        if (type.equals("char")) {
            bits = 16;
            return bits;
        } else if (type.equals("int")) {
            bits = 32;
            return bits;
        } else if (type.equals("boolean")) {
            bits = 49;
            return bits;
        } else if (type.equals("double")) {
            bits = 64;
            return bits;
        } else if (type.equals("float")) {
            bits = 32;
            return bits;
        } else if (type.equals("long")) {
            bits = 64;
            return bits;
        } else if (type.equals("short")) {
            bits = 16;
            return bits;
        } else if (type.equals("byte")) {
            bits = 8;
            return bits;
        } else {
            return 0;
        }

    }

}
