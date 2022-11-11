package Template;

public class SampleTruck extends Template{

    @Override
    protected void Producer() {
        System.out.print("Producer: Bin\n");
    }

    @Override
    protected void Typeofbody() {
        System.out.print("Typeofbody: Tent\n");
    }

    @Override
    protected void Typeofengine() {
        System.out.print("Typeofengine: Petrol\n");
    }

    @Override
    protected void Howmuchaxles() {
        System.out.print("Howmuchaxles: 2\n");
    }
}
