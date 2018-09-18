package comp1110.homework.J14;

import java.util.*;

public class Cost {
    HashMap<String, Item> items = new HashMap<>();

    void addItem(String name, int cost) {
        items.put(name, new Item(name, cost));
    }

    void printCost() {
        List<Item> sorted = new ArrayList<>();
        for (Item item : items.values()) {
            sorted.add(item);
        }
        Collections.sort(sorted);
        for (Item item : sorted) {
            System.out.println(item.name + " " + item.cost);
        }
    }

    int voucherWaste(int value) {
        Set<Integer> prices = new HashSet<>();
        for (Item item : items.values()) {
            prices.add(item.cost);
        }
        return remainingVoucherWaste(value, prices);
    }

    private int remainingVoucherWaste(int value, Set<Integer> prices) {
        int min = value;
        if(min == 0) return 0;
        for (Integer p : prices) {
            if (p <= value) {
                int newValue = remainingVoucherWaste(value - p, prices);
                if (newValue < min) {

                    min = newValue;
                }
            }
        }
        return min;
    }

    public class Item implements Comparable<Item> {
        String name;
        int cost;   // in cents

        public Item(String n, int c) {
            name = n;
            cost = c;
        }

        public String toString() {
            return name + " " + cost;
        }

        @Override
        public int compareTo(Item o) {
            int diff = this.cost - o.cost;
            if (diff == 0) return this.name.compareTo(o.name);
            else return diff;
        }
    }
}