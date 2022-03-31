package classes;

public class Calculate {

    // Class Attribute
    public int x = 5;

    /**
     * Access Modifier
     * public -> The class is accessible by any other class
     * private -> The code is only accessible within the declared class
     * protected -> The code is accessible in the same package and subclasses
     */
    public String publicAttribute = " I'm publicAttribute, Im accessible by any other class";
    private String privateAttribute = " I'm privateAttribute, Im accessible within the declared class";
    protected String protectedAttribute = " I'm protectedAttribute, Im accessible in the same package and subclasses";


    // Constructor
    public Calculate() {
    }

    // Class Method
    public int calculateTwoInteger(int num1, int num2){
        int total = num1 + num2;
        return total;
    }

    // Accessing private attributes
    public String showPrivateAtrribute(){
        return privateAttribute;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String getPrivateAttribute() {
        return privateAttribute;
    }

    public void setPrivateAttribute(String privateAttribute) {
        this.privateAttribute = privateAttribute;
    }


}
