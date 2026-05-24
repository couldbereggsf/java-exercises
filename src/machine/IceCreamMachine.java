package machine;

import flavors.Flavor;

public class IceCreamMachine<T extends Flavor> {

    public T produceIceCream(T flavor) {
        if (flavor == null) {
            System.out.println("Hopper error: No flavor object detected.");
            return null;
        }

        System.out.println("Processing production line item: " + flavor.getName());
        return flavor;
    }
}