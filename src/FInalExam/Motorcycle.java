package FInalExam;

public abstract class Motorcycle {
    String brand;
    int Gear = 0;

    interface GearOperation {
        public String shiftUp();
        public String shiftDown();
    }

    static class MotorSport extends Motorcycle implements GearOperation {
        public MotorSport(String brand) {
            this.brand = brand;
        }
        @Override
        public String shiftUp() {
            if (Gear < 6){
                Gear += 1;
                return "Gear shifted up to " + Gear;
            } else {
                return "Gear already at maximum";
            }
        }

        @Override
        public String shiftDown() {
            if (Gear > 0){
                Gear -= 1;
                return "Gear shifted down to " + Gear;
            } else {
                return "Gear already at minimum";
            }
        }

        public String showOutput(){
            return "Motorcycle brand: " + brand + "\nGear: " + Gear;
        }
    }
}
