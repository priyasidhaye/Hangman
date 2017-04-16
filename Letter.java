/* This class is the letter class */
public class Letter {
    private char value;
    private boolean isGuessed;

    public Letter(char value) {
        /* Constructor */
        this.value = value;
        this.isGuessed = false;
    }

    public char getValue() {
        return this.value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public boolean getIsGuessed() {
        return this.isGuessed;
    }

    public void setIsGuessed() {
        this.isGuessed = true;
    }

    public static void testInitialization() {
        /* Test creation of Letter object */
        Letter l = new Letter('a');
        try {
            assert l.getValue() == 'a';
        } catch(AssertionError ae) {
            System.out.println("Letter Initialization test failed.");
            return;
        }
        System.out.println("Object creation test passed.");
        
        //Test isGuessed property initialized to correct value
        try {
            assert !l.getIsGuessed();
        } catch (AssertionError ae) {
            System.out.println("Letter not initialized properly");
            return;
        }
        System.out.println("Initialize isGuessed property passed.");
    }
}