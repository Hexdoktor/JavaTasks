public class Main {
    public static void main(String[] args){
        int runs = 5;
        int customersPerRun = 10;

        for(int i = 1; i <= runs; i++){
            System.out.println("\n========== Run Simulation ==========");
            ServicePoint sp = new ServicePoint();
            CustomerGenerator generator = new CustomerGenerator(sp);

            generator.generate(customersPerRun);
            sp.serve();

        }

        System.out.println("All simulations complete.");
    }
}
