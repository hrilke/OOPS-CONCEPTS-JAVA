package String;

public class ImmutabilityDemo {
    public static void main(String[] args) {
        // --- 1. String (Immutable) ---
        String s1 = "Hello";
        System.out.println("s1 initial hash: " + s1.hashCode());

        // s2 refers to the same object in the String Pool
        String s2 = "Hello";

        System.out.println("\n--- String Comparison ---");
        System.out.println("s1 == s2 (same object?): " + (s1 == s2)); // Should be true (due to String Pool)

        // The concat() operation appears to change s1, but it actually creates a NEW String object.
        s1 = s1.concat(" World");

        System.out.println("\n--- After s1.concat(\" World\") ---");
        System.out.println("s1 value: " + s1);
        System.out.println("s2 value: " + s2);
        System.out.println("s1 == s2 (same object?): " + (s1 == s2)); // Should be false
        System.out.println("s1 new hash: " + s1.hashCode());
        System.out.println("s2 hash: " + s2.hashCode());

        // Key Takeaway: s2 was NOT affected, and s1 is now pointing to a brand new object.

        System.out.println("\n----------------------------");

        // --- 2. StringBuilder (Mutable) ---
        StringBuilder sb1 = new StringBuilder("Hello");

        // sb2 refers to a DIFFERENT object in the heap, even with the same content
        StringBuilder sb2 = new StringBuilder("Hello");

        System.out.println("\n--- StringBuilder Comparison (Initial) ---");
        System.out.println("sb1 == sb2 (same object?): " + (sb1 == sb2)); // Should be false

        // The append() operation MODIFIES the original object that sb1 refers to.
        sb1.append(" World");

        // Now, assign sb2 to the same object as sb1.
        sb2 = sb1;

        System.out.println("\n--- After sb1.append(\" World\") and sb2 = sb1 ---");
        System.out.println("sb1 value: " + sb1);
        System.out.println("sb2 value: " + sb2);
        System.out.println("sb1 == sb2 (same object?): " + (sb1 == sb2)); // Should be true

        // Now modify sb2 (which is the same object as sb1)
        sb2.append(" Mutated");

        System.out.println("\n--- After sb2.append(\" Mutated\") ---");
        System.out.println("sb1 value: " + sb1);
        System.out.println("sb2 value: " + sb2);

        // Key Takeaway: Since they point to the same mutable object, changing sb2 also changes sb1's observed value.
    }
}
