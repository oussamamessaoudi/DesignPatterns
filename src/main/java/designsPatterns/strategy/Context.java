package designsPatterns.strategy;

public class Context {
    private IChoice choice;

    public Context() {
    }

    public IChoice getChoice() {
        return choice;
    }

    public void setChoice(IChoice choice) {
        this.choice = choice;
    }

    public void showChoice(String input1, String input2){
        choice.myChoice(input1, input2);
    }
}
