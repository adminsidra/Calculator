class Grandparent {
    void showGrandparent() {
        System.out.println("This is the Grandparent.");
    }
}

class Parent extends Grandparent {
    void showParent() {
        System.out.println("This is the Parent.");
    }
}

class Child extends Parent {
    void showChild() {
        System.out.println("This is the Child.");
    }
    
    public static void main(String[] args) {
        Child c = new Child();
        c.showGrandparent();
        c.showParent();
        c.showChild();
    }
}
