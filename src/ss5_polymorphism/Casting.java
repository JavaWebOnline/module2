package ss5_polymorphism;

class Laptop {
    int id;
    int name;
}

class OldLaptop extends Laptop {
    int yearsUsed;
}

class NewLaptop extends Laptop {
    int releaseYear;
}

public class Casting {
    public static void main(String[] args) {
//        OldLaptop oldLaptop = new OldLaptop();
//
//        Laptop laptop = oldLaptop; //Upcasting
//
//        if(laptop instanceof NewLaptop) {
//            NewLaptop newLaptop2 = (NewLaptop) laptop; // Downcating
//            System.out.println(newLaptop2.releaseYear);
//        }

        Laptop[] laptops = new Laptop[2];

        laptops[0] = new NewLaptop();
        laptops[1] = new OldLaptop();

        for(int i = 0; i < laptops.length; i++) {
            if(laptops[i] instanceof NewLaptop) {
                System.out.println(((NewLaptop)laptops[i]).releaseYear);
            } else if(laptops[i] instanceof OldLaptop) {
                OldLaptop oldLaptop = (OldLaptop)laptops[i];
                System.out.println(oldLaptop.yearsUsed);
            }
        }
    }
}
