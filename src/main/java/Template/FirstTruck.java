package Template;

public class FirstTruck extends Template {

    @Override
    protected void Producer() {
    System.out.print("Producer: Mitsubishi\n");
    }

    @Override
    protected void Typeofbody() {
        System.out.print("Typeofbody: Bortovoi\n");
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
