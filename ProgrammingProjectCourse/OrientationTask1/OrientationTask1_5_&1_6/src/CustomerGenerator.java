public class CustomerGenerator {
    private int customerAmount;
    private ServicePoint servicePoint;

    public CustomerGenerator(ServicePoint servicePoint){
        this.servicePoint = servicePoint;

    }

    public void generate(int customerAmount){
        for(int i = 0;i < customerAmount; i++){
            Customer customer = new Customer();
            servicePoint.addToQueue(customer);
        }
    }
}
