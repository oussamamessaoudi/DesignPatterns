package designsPatterns.decorator;

public class ConcreteComponent extends Component {

    @Override
    public void doJob() {
        System.out.println("ConcreteComponent");
    }
}
