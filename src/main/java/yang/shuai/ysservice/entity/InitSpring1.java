package yang.shuai.ysservice.entity;

public class InitSpring1 {
    private InitSpring2 initSpring2;
    // a setter method to inject the dependency.
    public void setInitSpring2(InitSpring2 initSpring2) {
        System.out.println("init Spring1."+"\n");
        this.initSpring2 = initSpring2;
    }
    // a getter method to return spellChecker
    public InitSpring2 getInitSpring2() {
        return initSpring2;
    }
    public void logOut() {
        initSpring2.logOut();
    }
}
