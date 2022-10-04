
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

    public int getBits() {
        final int bits = type.length() * 8;
        if (type.length() == 0) {
            return 0;
        } else {
            return bits;
        }

    }
}
