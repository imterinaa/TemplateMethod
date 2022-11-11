package Template;

public class Consumer {
    String axles, engin, body, prod, color = null;
    int flag = 0;

    public Consumer(
            String axles, String engin, String body, String prod, String color) {
        this.axles = axles;
        this.engin = engin;
        this.body = body;
        this.prod = prod;
        this.color = color;
    }
    protected void create() {
        if (axles.equals("2")) {
            if (engin.equals("Petrol")) {
                if (body.equals(("Bortovoi"))) {
                    if (prod.equals(("Mit"))) {
                        if (color.equals(null)) {
                            Template tr1 = new FirstTruck();
                            flag = 1;
                            tr1.Collectoffer();
                        } else {
                            Template colortr1 = new FirstTruck();
                            flag = 1;
                            colortr1.Collectoffer();
                            colortr1.AddCondiments(color);
                        }
                    }
                }
            }
        } else {
            Template smpltr1 = new SampleTruck();
            flag = 1;
            Message();
            smpltr1.Collectoffer();
        }

        if (axles.equals("1")) {
            if (engin.equals("Dizel"))
                if (body.equals(("Samosval"))) {
                    if (prod.equals(("Ars"))) {
                        if (color.equals(null)) {
                            Template tr2 = new SecondTruck();
                            flag = 1;
                            tr2.Collectoffer();
                        } else {
                            Template colortr2 = new SecondTruck();
                            flag = 1;
                            colortr2.Collectoffer();
                            colortr2.AddCondiments(color);
                        }
                    }
                }
        } else {
            if (flag == 0) {
                Template smpltr2 = new SampleTruck();
                Message();
                smpltr2.Collectoffer();
            }
        }
    }
    protected void Message() {
        System.out.print(
                "Unfortunately there is no such truck, we can offer a truck:\n");
    }
}