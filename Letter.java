public class Letter {
    private char value;
    private boolean isGuessed;

    public Letter(char value) {
        this.value = value;
        this.isGuessed = false;
    }

    public char getValue() {
        return this.value;
    }

    //This won't be needed
    public void setValue(char value) {
        this.value = value;
    }

    public boolean getIsGuessed() {
        return this.isGuessed;
    }

    public void setIsGuessed() {
        this.isGuessed = true;
    }

    public static void main(String args[]) {
        //Test creation of Letter object
        Letter l = new Letter('a');
        if (l.getValue() != 'a') {
            System.out.println("Test failed.");
        } else {
            System.out.println("Object creation test passed.");
        }

        //Test isGuessed property initialized to correct value
        if (l.getIsGuessed()) {
            System.out.println("Test Failed.");
        } else {
            System.out.println("Initialize isGuessed property passed.");
        }

        //Test setting isGuessed property.
        l.setIsGuessed();
        if (!l.getIsGuessed()) {
            System.out.println("Test Failed");
        } else {
            System.out.println("Test to set isGuessed passed.");
        }
    }
}