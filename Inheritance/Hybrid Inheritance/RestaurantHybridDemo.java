interface Worker {
    void performDuties();
}

class PersonIndividual {
    String name;
    int id;

    PersonIndividual(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

class ChefWorker extends PersonIndividual implements Worker {
    ChefWorker(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " (Chef) is cooking food.");
    }
}

class WaiterWorker extends PersonIndividual implements Worker {
    WaiterWorker(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println(name + " (Waiter) is serving food.");
    }
}

public class RestaurantHybridDemo {
    public static void main(String[] args) {
        Worker chef = new ChefWorker("Ravi", 101);
        Worker waiter = new WaiterWorker("Anita", 102);

        chef.performDuties();
        waiter.performDuties();
    }
}
