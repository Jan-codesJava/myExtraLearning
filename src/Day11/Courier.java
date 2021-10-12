/*package Day11;

    import org.omg.CORBA.PUBLIC_MEMBER;

    public  class Courier implements Worker {
        private int salary;
        private Warehouse warehouse;

        public Courier(Warehouse warehouse) {
            this.warehouse = warehouse;
        }

        @Override
        public void doWork(){
            salary+=80;
            warehouse.setBalance(warehouse.getBalance()+1000);

        }

        @Override
        public void bonus() {

        }

        @Override
        public String toString() {
            return "Courier{" +
                    "salary=" + salary +
                    '}';
        }
    }
}


 */