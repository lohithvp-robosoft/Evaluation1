class DualStack {
    int top1, top2;
    int[] arr;
    int size;

    DualStack(int n) {
        size = n;
        arr = new int[n];
        top1 = -1;
        top2 = size;
    }

    public void push1(int x) {
        if (top1 >= top2 - 1) {
            System.out.println("Stack OveFlow");
            return;
        }
        arr[++top1] = x;
    }

    public void push2(int x) {
        if (top2 <= top1 + 1) {
            System.out.println("Stack Overflow");
            return;
        }
        arr[--top2] = x;
    }

    public int pop1() {
        if (top1 == -1) {
            System.out.println("Stack Overflow");
            return -1;
        }
        return arr[top1--];
    }

    public int pop2() {
        if (top2 == size) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top2++];
    }
}

public class Question4 {
    public static void main(String[] args) {
        DualStack dualStack = new DualStack(6);
        dualStack.push1(1);
        dualStack.push2(4);
        dualStack.push2(3);
        dualStack.push1(1);
        dualStack.push1(6);
        dualStack.push2(12);
        dualStack.push1(21); // StackOverFlow
        dualStack.pop2();
        dualStack.push1(18);
        dualStack.push1(23); // StackOverflow


    }
}
