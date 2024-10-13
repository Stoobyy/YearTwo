public class QuestionOne {
    static class Box {
        int value;
        
        Box(int value) {
            this.value = value;
        }
    }
    
    static void modifyBox(Box box) {
        box.value *= 2;
    }
    
    static Box createBox(int value) {
        return new Box(value);
    }
    
    public static void main(String[] args) {
        Box myBox = new Box(5);
        System.out.println("Original value: " + myBox.value);
        
        modifyBox(myBox);
        System.out.println("After modification: " + myBox.value);
        
        Box newBox = createBox(10);
        System.out.println("New box value: " + newBox.value);
    }
}