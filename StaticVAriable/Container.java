package StaticVAriable;


///////////////////static class////////////////

public class Container {
    private static String containerStaticField = "Container Static Field";

    // Static nested class
    public static class NestedClass {
        private String nestedField;

        public NestedClass(String value) {
            this.nestedField = value;
        }

        public void display() {
            System.out.println("Container static field: " + containerStaticField);
            System.out.println("Nested field: " + nestedField);
        }
    }

    public static void main(String[] args) {
        // Instantiating the static nested class
        NestedClass nestedInstance = new NestedClass("Nested Instance");
        nestedInstance.display();
    }
}
