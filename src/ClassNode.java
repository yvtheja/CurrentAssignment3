public class ClassNode {

    private String className;
    private int numberOfMethods;
    private int[] ifPresent;
    private int[] loopPresent;

    public ClassNode (String className, int numberOfMethods, int[] ifPresent, int[] loopPresent) {
        this.className = className;
        this.numberOfMethods = numberOfMethods;
        this.ifPresent = ifPresent;
        this.loopPresent = loopPresent;
    }

    public int[] getIfPresent() {
        return ifPresent;
    }

    public void setIfPresent(int[] ifPresent) {
        this.ifPresent = ifPresent;
    }

    public int[] getLoopPresent() {
        return loopPresent;
    }

    public void setLoopPresent(int[] loopPresent) {
        this.loopPresent = loopPresent;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getNumberOfMethods() {
        return numberOfMethods;
    }

    public void setNumberOfMethods(int n) {
        this.numberOfMethods = n;
    }
}
